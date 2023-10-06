


public class BatallaPokemon {

    public static void main(String[] args) {
        PokemonFuego Charizard = new PokemonFuego("Charizard", 10);
        PokemonHielo Lapras = new PokemonHielo("Lapras", 10);

        Charizard.atacar("bola hielo", Lapras);
        System.out.println("Estado de charizard:hp"+ Charizard.getHP());
        System.out.println(",Nivel="+Charizard.getNivel());
        
        Lapras.atacar("bomba ignea", Charizard);
        System.out.println("Estado de charizard:hp"+ Lapras.getHP());
        System.out.println(",Nivel="+Lapras.getNivel());
    }
}
