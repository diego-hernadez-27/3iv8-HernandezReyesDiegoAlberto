//La libreria y la clase

import java.util.*;

class Principal{

    public static void main(String[] args){
        
        Scanner escaner = new Scanner(System.in);

        //Mi nombre

        System.out.println("Hernández Reyes Diego Alberto 3IV8");

        char letra, op;

        //El ciclo para repetir el progrma

        do{
         //Dando las opciones

        System.out.println("Elija lo que quiere hacer:");
        System.out.println("A.- Calcular la edad");
        System.out.println("B.- Perimetros y areas");
        System.out.println("C.- Llamadas");
        System.out.println("D.- Salir");

        op = escaner.next().charAt(0);

        //Corriendo el programa y dando vinculos a los programas
        switch(op){

            case 'A':
                EdadXD obj = new EdadXD();
                do{
                obj.LaEdad();
                System.out.println("¿Desas repetir el programa? si es asi oprime ,s,");
                letra = escaner.next().charAt(0);
                }while (letra == 's');
                break;

            case 'B':
            
                FigurasXD obj1 = new FigurasXD();
                do{
                obj1.AreasyPerimetros();
                System.out.println("¿Desas repetir el programa? si es asi oprime ,s,");
                letra = escaner.next().charAt(0);
                }while (letra == 's');
                break;  

            case 'C':

                LlamadasXD obj2 = new LlamadasXD();
                obj2.LasLlamadas();
                break;

            default:

                break;
        }

        System.out.println("¿Desea repetir el profgrama? si es asi dale a la ,y,");
        letra = escaner.next().charAt(0);

        }while (letra == 'y');
        //Para repetirlo
    }
}
