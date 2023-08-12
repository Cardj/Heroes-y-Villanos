class PersonajeDeAccion {
    String nombre;
    double altura;
    double peso;
    String colorDePiel;
    int porcentajeDePoder;
    String estado;

    // Constructor
    public PersonajeDeAccion(String nombre, double altura, double peso, String colorDePiel) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorDePiel = colorDePiel;
        this.porcentajeDePoder = 100; // Comenzamos con el 100% de poder
        this.estado = "Vivo";
    }

    void atacar() {
        System.out.println(nombre + " está atacando a un enemigo.");
    }

    void correr() {
        System.out.println(nombre + " está corriendo a toda velocidad.");
    }

    void saltar() {
        System.out.println(nombre + " está saltando.");
    }

    void esquivar() {
        System.out.println(nombre + " está esquivando un ataque enemigo.");
    }

    void morir() {
        estado = "Muerto";
        System.out.println(nombre + " ha muerto.");
    }
}

public class PruebaPersonajesDeAccion {
    public static void main(String[] args) {
        PersonajeDeAccion personaje1 = new PersonajeDeAccion("Héroe1", 1.75, 70.0, "Blanca");
        PersonajeDeAccion personaje2 = new PersonajeDeAccion("Villano1", 1.85, 80.0, "Morena");
        PersonajeDeAccion personaje3 = new PersonajeDeAccion("Héroe2", 1.80, 75.0, "Negra");
        PersonajeDeAccion personaje4 = new PersonajeDeAccion("Villano2", 1.70, 65.0, "Blanca");

        personaje1.atacar();
        personaje2.correr();
        personaje3.saltar();
        personaje4.esquivar();

        personaje1.morir();

        System.out.println(personaje2.nombre + " está " + personaje2.estado);
    }
}
