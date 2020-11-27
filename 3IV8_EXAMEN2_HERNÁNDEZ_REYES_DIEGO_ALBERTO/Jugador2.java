import java.util.*;

public class Jugador2 extends Persona {

    public Jugador2(){}

    public Jugador2(String nombre){
        super(nombre);
    } 

    public void mostrarJugador2() {
        System.out.println("El jugador 2 es: "+getNombre());
    }
    
}