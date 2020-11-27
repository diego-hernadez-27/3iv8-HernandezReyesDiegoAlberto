//Importadno librerias
import java.util.*;

//La clase padre y el encapsulamiento de datos
public class Persona{

    Scanner escaner = new Scanner(System.in);
    protected String nombre;

    public Persona(){}

    public Persona(String nombre){

        this.nombre = nombre;

    }

    public String getNombre(){
        System.out.println("Introduzca su nombre jugador");
        nombre = escaner.nextLine();
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


}