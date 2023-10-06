

public class Pokemon {
    private int hp;
    private int nivel;
    private String nombre;
    private String tipo;

    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.hp = 100; // Inicializamos HP en 100
    }

    public int getHP() {
        return hp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    private void calculaDanio(int danio) {
        this.hp -= danio;
        System.out.printf("%s recibe %d puntos de danio\n", this.getNombre(), danio);
    }

    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        int danio = (int) (Math.random() * 10 + 1);
        calculaDanio(danio);
    }

    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }
}
