public class PokemonTest {
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
		Pokemon charmander = pokedex.createPokemon("charmander", 100, "fire");
		Pokemon jiglypuff = pokedex.createPokemon("jiglypuff", 90, "hood");
        Pokemon ratta = pokedex.createPokemon("ratta", 80, "earth");

        pokedex.attackPokemon(charmander);
        pokedex.attackPokemon(jiglypuff);
        pokedex.attackPokemon(ratta);

        System.out.println("Charmander Type: " + charmander.getType());
		System.out.println("Jiglypuff Type: " + jiglypuff.getType());
		System.out.println("Ratta Type: " + ratta.getType());

		System.out.println("Charmander hp: " + charmander.getHealth());
		System.out.println("Jiglypuff hp: " + jiglypuff.getHealth());
		System.out.println("Ratta hp: " + ratta.getHealth());
		System.out.println("There are " + Pokemon.count + " pokemon in the pokedex");

    }
}