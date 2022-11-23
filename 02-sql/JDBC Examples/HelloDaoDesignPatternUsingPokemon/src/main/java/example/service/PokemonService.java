package example.service;

import java.util.List;

import example.model.Pokemon;

public interface PokemonService {


	//inserts
	public boolean addPokemon(Pokemon pokemon);
	
	//selects
	public Pokemon getPokemonById(int pokeId);
	public List<Pokemon> getAllPokemon();
	
	//delete
	public boolean removePokemon(int pokeId);
}
