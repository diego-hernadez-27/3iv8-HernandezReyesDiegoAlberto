import java.util.Scanner;

public class Arreglos{

Scanner entrada = new Scanner(System.in);
public static void main(String[] args){

    Arreglos pooarg = new Arreglos();

    int opcion;
    char letra;
    
    do{
        
    pooarg.indice();
    Scanner entrada = new Scanner(System.in);
    System.out.println("¿Desas repetir el programa? si es asi oprime ,s,");
    letra = entrada.next().charAt(0);

    }while (letra == 's');
}

public void indice(){


    int opcion;
        System.out.println("¿Que quieres hacer?: ");
        System.out.println("1.- Promedio de numeros negativos y positivos ");
        System.out.println("2.- Promedio de los numeros en lugares pares en el arreglo ");
        System.out.println("3.- Calificaciones ");
        System.out.println("4.- Sumar dos matrices 3 x 3 ");
        System.out.println("5.- Salir");

    opcion = entrada.nextInt();
    char letra = 0;
    switch (opcion){
        case 1:
        do{
        Promediopyn();
        System.out.println("¿Deseas repetir Promedio de numeros negativos y positivos? puchale a la ,y, si es asi");
        letra = entrada.next().charAt(0);
        }while (letra == 'y');
        break;

        case 2:
        do{
        Promediopa();
        System.out.println("¿Deseas repetir Promedio de los numeros en lugares pares en el arreglo? puchale a la ,y, si es asi");
        letra = entrada.next().charAt(0);
        }while (letra == 'y');
        break;

        case 3:
        do{
        Clificacionesraras();
        System.out.println("¿Deseas repetir Calificaciones? puchale a la ,y, si es asi");
        letra = entrada.next().charAt(0);
        }while (letra == 'y');
        break;

        case 4:
        do{
        Sumadematrices();
        System.out.println("¿Deseas repetir Sumar dos matrices 3 x 3? puchale a la ,y, si es asi");
        letra = entrada.next().charAt(0);
        }while (letra == 'y');
        break;

        default:
    }
}


public void Promediopyn(){

    int matriz[] = new int[10];
    float promedio1, promedio2;
    float Suma1 = 0;
    float Suma2 = 0;
    int numeros1 = 0;
    int numeros2 = 0;

    for(int i = 0; i < matriz.length; i++){
        System.out.println("Ingrese los numero");
        matriz[i] = entrada.nextInt(); 
        
    while (matriz[i] == 0){

        System.out.println("Ingrese un numereo que no sea cero ganador");
        matriz[i] = entrada.nextInt(); 

    }

    if(matriz[i] > 0){

        Suma1 += matriz[i];
        numeros1++;
        
    }
    else{

    if (matriz[i] < 0){

        Suma2 += matriz[i];
        numeros2++;
        
    }
    else{

        }
    }

    }
    promedio1 = Suma1/numeros1;
    promedio2 = Suma2/numeros2;

    System.out.println("El promedio de positivos es: "+promedio1);
    System.out.println("El promedio de negativos es: "+promedio2);
}

public void Promediopa(){

    int matriz[] = new int[10];
    float Suma1 = 0;
    float promedio1;

    for(int i = 0; i < matriz.length; i++){
        System.out.println("Ingrese los numero");
        matriz[i] = entrada.nextInt(); 
    
    while (matriz[i] == 0){

        System.out.println("Ingrese un numereo que no sea cero ganador");
        matriz[i] = entrada.nextInt(); 

    }

    }

    Suma1 = (matriz[0]+matriz[2]+matriz[4]+matriz[6]+matriz[8]);
    promedio1 = Suma1/5;

    System.out.println("El promedio de los numeros en posiciones pares es: "+promedio1);

}

public void Clificacionesraras(){

    int matriz[] = new int[10];
    float promedio1, promedio2;
    float Suma1 = 0;
    float Suma2 = 0;
    int numeros1 = 0;
    int numeros2 = 0;
    int numeros3 = 0;
    int numeros4 = 0;
    int numeros5 = 0;
    


    for(int i = 0; i < matriz.length; i++){
        System.out.println("Ingrese las calificaciones");
        matriz[i] = entrada.nextInt(); 


    while (matriz[i] < 0){

        System.out.println("Ingrese un numereo positivos");
        matriz[i] = entrada.nextInt(); 
    
    }
    
    while (matriz[i] > 10){
    
        System.out.println("Ingrese un numeros menores o iguales a 10 crack");
        matriz[i] = entrada.nextInt(); 
    
    }
    
}
    
    System.out.println("Las calificaciones fueron respectivamente");
    for(int i:matriz){
        System.out.println(i);
    }
    
    
    for(int i = 0; i<matriz.length; i++){
    
    
            Suma1 += matriz[i];
    
    }
    
        promedio1 = Suma1/matriz.length;
    
        System.out.println("El promedio es: "+promedio1);
    
        numeros1 = numeros2 = matriz[0];
    
    for(int i = 0; i < matriz.length; i++){
        if (matriz[i] > numeros1 ){
            numeros1 = matriz[i];        
        }
        else{}
        if(matriz[i] < numeros2){
            numeros2 = matriz[i];  
        }
        else{}
    
    }
    
        System.out.println("La calificacion mas alta fue: "+numeros1);
        System.out.println("La calificacion menor fue: "+numeros2);
        
    
    for(int i = 0; i < matriz.length; i++){
        if (promedio1 < matriz[i]){
    
            numeros3++;
    
        }
        else{}
    }
    
        System.out.println("El numero de calificaciones mas altas que el promedio fueron: "+numeros3);
    
    for(int i = 0; i < matriz.length; i++){
    
        if (matriz[i] > 5){
    
            numeros4++;
    
        }
        else{
    
            numeros5++;
    
        }
    }
    
        System.out.println("Los alumnos aprobados fueron: "+numeros4);
        System.out.println("Los alumnos reprobados fueron: "+numeros5);
}

public void Sumadematrices(){

    int matriza[][] = new int [3][3];
    int matrizb[][] = new int [3][3];
    int matrizs[][] = new int [3][3];
    int j = 0, i;

    System.out.println("Valores para la primera matriz");

    for (i = 0; i < matriza.length; i++){

        for (j = 0; j < matriza.length; j++){
            System.out.println("Ingrese los valores de la fila " + i + " y la columna " + j + ": ");
            matriza [i][j] = entrada.nextInt();
        }

    }
    
    System.out.println("Valores para la segunda matriz");
    for (i = 0; i < matrizb.length; i++){

        for (j = 0; j < matrizb.length; j++){
            System.out.println("Ingrese los valores de la fila " + i + " y la columna " + j + ": ");
            matrizb [i][j] = entrada.nextInt();
        }

    }

    for (i = 0; i < matrizs.length; i++){

        for (j = 0; j < matrizs.length; j++){

             matrizs [i][j] = matriza[i][j] + matrizb[i][j];
        }

    } 

    System.out.println("Matriz resultante de la suma:");

        for (i = 0; i <= 2; i++){

            for (j = 0; j <= 2; j++) {
                System.out.print(matrizs[i][j] + " ");
            }
            System.out.println("");
        }

}
}

