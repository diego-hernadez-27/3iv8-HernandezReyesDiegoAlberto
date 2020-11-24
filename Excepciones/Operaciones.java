import java.util.*;

public class Operaciones{

Scanner entrada = new Scanner(System.in);

int y = 0;

public void Ejemplo(){

    try{

    System.out.println("Ingrese un valor numerico");
    y = entrada.nextInt();
    System.out.println("El numero es: "+ y);
    System.exit(0);

    } catch (Exception e) {
       System.out.println("ingrese un valor numerico");

       System.out.println("Error: "+e.getMessage());
    }

}

}