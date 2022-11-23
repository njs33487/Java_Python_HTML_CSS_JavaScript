package example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import example.model.Pokemon;

public class PokemonDaoImpl implements PokemonDao {
	
	
	
	@Override
	public boolean insertPokemon(Pokemon pokemon) {

		try(Connection conn = OurCustomConnectionFactory.getConnection()) {
			
			String ourSQLStatement = "INSERT INTO pokemon VALUES(?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			ps.setInt(1, pokemon.getPokemonId());//the 1st "?"
			ps.setString(2, pokemon.getPokemonName()); //the 2nd "?"
			ps.setString(3, pokemon.getPokemonType()); //the 3rd "?"
			ps.setString(4, pokemon.getPokemonSecondType()); //the 4th "?"
			
			ps.executeUpdate();
			
			return true;
		
		}catch(SQLException e) {
			e.printStackTrace();
			
			return false;
		}
	}

	@Override
	public Pokemon selectPokemonById(int pokeId) {
		//I'll leave this implementation to you all for practice
		return null;
	}

	
	@Override
	public List<Pokemon> selectAllPokemon() {
		List<Pokemon> pokes = new ArrayList<>();
		
		try(Connection conn = OurCustomConnectionFactory.getConnection()) {

			//SELECT * FROM pokemon;
			//SELECT * FROM pokemon ORDER BY pokemon_name;
			String ourSQLStatement = "SELECT * FROM pokemon";
			
			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			
			ResultSet resultSet = ps.executeQuery(); //NOTE...this is NOT "executeUpdate" it's "executeQuery"
			
			/*
			 * Here, we're going to extra the data from the ResultSet object.
			 * 
			 * The resultSet object contains TWO things. First, it contains the records retrieved from the database. Second,
			 * 		it remembers which row of the resultSet you're currently looking at. The row it remembers starts at index -1.
			 * 
			 * "resultSet.next()" asks the resultSet object to go to the next record in the resultSet (adding 1 to the index) and if
			 * that record does NOT exist it will result the boolean false. If the next record DOES exist it will result the boolean
			 * true.
			 */
			while(resultSet.next()) {
				//							resultSet.getInt(columnIndex)
				Pokemon newPokemon = new Pokemon(resultSet.getInt(1), resultSet.getString(2)
											, resultSet.getString(3), resultSet.getString("pokemon_secondtype"));
				
				pokes.add(newPokemon);
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return pokes;
	}

	@Override
	public boolean deletePokemon(int pokeId) {
		//I'll leave this implementation to you all for practice
		return false;
	}

}
