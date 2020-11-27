//Importartando librerias
import java.util.*;

public class Jugador2 extends Persona {
    //El constructor
    public Jugador2(){}

    public Jugador2(String nombre){
        super(nombre);
    } 
    //Mostrando los datos
    public void mostrarJugador2() {
        System.out.println("El jugador 2 es: "+getNombre());
    }
    
}