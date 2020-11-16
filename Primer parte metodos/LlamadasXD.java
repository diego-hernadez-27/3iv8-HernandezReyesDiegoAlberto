//Importando las librerias
import java.util.*;

public class LlamadasXD{

    Scanner escaner = new Scanner(System.in);

    //Las variables

    int opcion;
    char letra;

    //El progrma

 public void LasLlamadas(){
   do{

        indice();

        System.out.println("¿Desas repetir el programa? si es asi oprime ,s,");
        letra = escaner.next().charAt(0);
   
    }while (letra == 's');
}

public void indice(){

    //Dando las opciones del programa

    LlamadasXD ce = new LlamadasXD();
    Scanner escaner = new Scanner(System.in);

    int opcion;
    double Saldo;
    System.out.println("Elije lo que quiera hacer");
    System.out.println("1.- Agregar  y consultar");
    System.out.println("2.- Hacer llamadas");
    System.out.println("3.- Salir");
    opcion = escaner.nextInt();

    switch (opcion) {
        case 1:
        
        AgregarCredito();

        break;

        case 2:

        HacerLlamadas();

        break; 

        default:
            break;

    }
    }

    //El program con sus operaciones y resultado 

public void HacerLlamadas(){

    Scanner escaner = new Scanner(System.in);
    LlamadasXD ce = new LlamadasXD();

    double credito1 = AgregarCredito();

    int LocalI, LocalN, Celulares;

            System.out.println("Ingrese el numero de llamada locolas nacionales hechas: ");
            LocalN = escaner.nextInt();

            credito1 = credito1 - (LocalN * 0.5);

            System.out.println("Ingrese el numero de llamadas locolas internacionales hechas: ");
            LocalI = escaner.nextInt();

            credito1 = credito1 - (LocalI * 0.6);

            System.out.println("Ingrese el numero de llamadas Clelulares hechas: ");
            Celulares = escaner.nextInt();

            credito1 = credito1 - (Celulares * 0.2);

            if (credito1 < 0){

                System.out.println("Su credito se ha hagotado, su adeudo es de: "+credito1*-1);
            }
            else{
                System.out.println("Su scredito es de: "+credito1);
            }
    }

    public double AgregarCredito(){

        Scanner escaner = new Scanner(System.in);

    int NumeroCelular, NumeroCelular2, credito;
    double credito1;

    credito1 = 0;
    credito = 1;


        NumeroCelular = 55859210;
        System.out.println("Su numero telefonico es: "+NumeroCelular);
        System.out.println("Ingrese su numero telefonico");
        NumeroCelular2 = escaner.nextInt();

    while (NumeroCelular != NumeroCelular2){

        System.out.println("Esta seguro de que este es su numero celular, no queremos regalarle dinero a alguien");
        System.out.println("Ingrese su numero otra vez");
        NumeroCelular2 = escaner.nextInt();

    }

        if (credito1 != credito ){
        System.out.println("Agregue el credito deseado: ");
        credito = escaner.nextInt();

        credito1 = credito1 + credito;

        System.out.println("Ahora su credito es de: " +credito1);
        }
    else{
        System.out.println("Su credito es de: "+credito);
        }


        return credito1;

    }

}


