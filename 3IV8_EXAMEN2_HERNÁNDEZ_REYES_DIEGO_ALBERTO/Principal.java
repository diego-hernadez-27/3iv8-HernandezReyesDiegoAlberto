import java.util.*;
import java.io.IOException;

public class Principal{
public static void main(String[] args) throws IOException{
    
    Scanner escaner = new Scanner(System.in);
    String respuesta =  " ";

    do{
    Gato obj = new Gato();
    obj.El_Juego();

    System.out.println("¿Deseas repetie el juego? si es asi escriba 'si'");
    respuesta = escaner.nextLine();

    }while(respuesta.equals("si"));
    
}
}