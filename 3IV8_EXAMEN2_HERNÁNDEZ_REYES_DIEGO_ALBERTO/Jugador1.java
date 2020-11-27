import java.util.*;

public class Jugador1 extends Persona {

    public Jugador1(){}

    public Jugador1(String nombre){
        super(nombre);
    } 

    public void mostrarJugador1() {
        System.out.println("El jugador 1 es: "+getNombre());
    }
    
}