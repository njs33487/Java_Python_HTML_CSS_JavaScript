package example.service;

import java.util.List;

import example.dao.PokemonDao;
import example.dao.PokemonDaoImpl;
import example.model.Pokemon;

public class PokemonServiceImpl implements PokemonService {

	
	
	//let's make a Dao object
	PokemonDao myPokeDao = new PokemonDaoImpl();
	
	

	public static void main(String[] args) {
		PokemonServiceImpl poke = new PokemonServiceImpl();
		System.out.println(poke.getAllPokemon());
	}
	
	
	
	@Override
	public boolean addPokemon(Pokemon pokemon) {

		//if we DID have business logic it would go here
//		String lowercaseName = pokemon.getPokemonName().toLowerCase();
//		pokemon.setPokemonName(lowercaseName);
		
		boolean boolResults = myPokeDao.insertPokemon(pokemon);
		//OR it would go here. BY CHANCE, we just don't have any business logic.
		
		return boolResults;
	}

	@Override
	public Pokemon getPokemonById(int pokeId) {
		return myPokeDao.selectPokemonById(pokeId);
	}

	@Override
	public List<Pokemon> getAllPokemon() {
		return myPokeDao.selectAllPokemon();
	}

	@Override
	public boolean removePokemon(int pokeId) {
		
		//here is an example of some possible business logic you may be able to put in your service layer
		//			(though this specific logic could also arguably go into your dao layer)
		
		if(myPokeDao.selectPokemonById(pokeId)==null)
			return false;
		else
			return myPokeDao.deletePokemon(pokeId);
	}

}
