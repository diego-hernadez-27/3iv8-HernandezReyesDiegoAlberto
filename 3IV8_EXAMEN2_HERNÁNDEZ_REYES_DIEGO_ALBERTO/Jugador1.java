//Importartando librerias
import java.util.*;

//dando la herecia
public class Jugador1 extends Persona {
    //El constructor
    public Jugador1(){}

    public Jugador1(String nombre){
        super(nombre);
    } 
    //Mostrando los datos
    public void mostrarJugador1() {
        System.out.println("El jugador 1 es: "+getNombre());
    }
    
}