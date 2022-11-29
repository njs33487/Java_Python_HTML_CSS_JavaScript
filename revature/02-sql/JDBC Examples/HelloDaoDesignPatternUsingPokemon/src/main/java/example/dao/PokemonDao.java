package example.dao;

import java.util.List;

import example.model.Pokemon;

public interface PokemonDao {

	//inserts
	public boolean insertPokemon(Pokemon pokemon);
	
	//selects
	public Pokemon selectPokemonById(int pokeId);
	public List<Pokemon> selectAllPokemon();
	
	//delete
	public boolean deletePokemon(int pokeId);
}
