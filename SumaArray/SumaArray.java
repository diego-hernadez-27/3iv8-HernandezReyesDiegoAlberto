import java.util.Scanner;

import javax.swing.JOptionPane;

public class SumaArray{

    public static void main(String[] args){
        /*
        //vamos a crear el array
        int[] numeros = new int[100];
        //variables
        int suma = 0;
        double media = 0.00;
        //recorremos el array y le asignamos numeros
        for(int i = 0; i<numeros.length; i++){
            //ahora asginamos los numeros dentro del arreglo
            numeros[i]=i+1;
            //System.out.println("Posiciones"+i);//posiciones
            //System.out.println("Numeros"+numeros);//memoria
            //System.out.println("Valor"+numeros[i]);//valor
            //sumamos los numeros
            suma+=numeros[i];
        }
        System.out.println("La suma de los numeros es de: "+suma);
        media = (double)suma/numeros.length;
        System.out.println("La media de los numeros es de: "+media);
    */

    String texto = JOptionPane.showInputDialog("Introduce el tamaño del arreglo");

    int tamanio = Integer.parseInt(texto);

    int array1[] = new int [tamanio];
    int array2[];

    rellenarNumAleatoriosArray(array1, 10, 100);

    array2 = array1;

    array1 = new int[tamanio];

    rellenarNumAleatoriosArray(array1, 10, 100);

    int array3[] = multiplicador(array1, array2);

    System.out.println("Arreglo 1: ");

    mostrarArray(array1);
    System.out.println("Arreglo 2: ");

    mostrarArray(array2);
    System.out.println("Arreglo 3: ");

    mostrarArray(array3);

    }

    public static void rellenarNumAleatoriosArray(int lista[], int a, int b){
        for(int i = 0; i<lista.length; i++){

            lista[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    public static void mostrarArray(int lista[]){

        for(int i = 0; i<lista.length; i++){
            System.out.println("En la posicion " + i + " esta el valor : " +lista[i]);
        }
    }

    public static int[] multiplicador(int array1[], int array2[]){

        int array3[] = new int[array1.length];

        for(int i = 0; i<array1.length; i++){

            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }

}