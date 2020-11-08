  
import java.util.*;

public class MatrizDeArreglo{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int [3][3];

        float sumarFilas=0;

        for(int i=0; i<matriz.length; i++){

            for(int j=0; j<matriz.length; j++){
                System.out.println("Ingresa el numero de la fila "
                + i + " columna " + j + " : ");
                matriz[i][j] = entrada.nextInt();


            }
            
        }


        for(int i = 0; i<matriz.length; i++){
            sumarFilas = 0;
            for(int j = 0; j<matriz.length; j++){

                sumarFilas += matriz[i][j];
                System.out.println(String.format(" %d ", matriz[i][j]));

            }

            System.out.println(String.format("Suma fila : %f, promedio fila: %f ", sumarFilas,
             sumarFilas/matriz.length));

            System.out.println();

        }
        

    }
}