//Importando librerias
import java.util.Scanner;
import java.text.DecimalFormat;

public class FigurasXD{

//Las variables
        Scanner escaner = new Scanner(System.in);
        int opcion;
        float base = 0, altura = 0;
        double area = 0, perimetro = 0, lado = 0;
        DecimalFormat df = new DecimalFormat("#.0000");

public void AreasyPerimetros(){
    
    //Dando las opciones
    System.out.println("Elija la opcion deseada: ");
    System.out.println("1.- Calcular el area y perimetro de un circulo");
    System.out.println("2.- Calcular el area y perimetro de un rectangulo");
    System.out.println("3.- Calcular el area y perimetro de un cuadrado");
    System.out.println("4.- Calcular el area y perimetro de un triangulo");
    System.out.println("5.- Salir");

    opcion = escaner.nextInt();

    switch (opcion) {
        case 1:

            Circulo();

            break;

        case 2:

            Rectangulo();

            break;

        case 3:

            Cuadrado();

            break;
        
        case 4:

            Triangulo();

            break;

        default:
            System.out.println("Adios");
  
    }

    //El programa con sus operaciones y dando resultados

    }
    public void Circulo(){

            System.out.println("Ingresa el valor de la radio");
            base = escaner.nextFloat();

            while (base <= 0){
            System.out.println("Ingresa el valor de base positivo");
            base = escaner.nextFloat();}

            area = 3.1416*base*base;

            perimetro = 2*3.1416*base;

            System.out.println("El area del circulo es de: "+df.format(area)+" unidades cuadradas");
            System.out.println("Y el perimetro es: "+df.format(perimetro)+" unidades");
        }
    public void Rectangulo(){

            System.out.println("Ingrese el valor de la base ");
            base = escaner.nextFloat();

                while (base <= 0){
                System.out.println("Ingresa el valor de base positivo");
                base = escaner.nextFloat();}

            System.out.println("Ingrese el valor de la altura ");
            altura = escaner.nextFloat();

                while (altura <= 0){
                System.out.println("Ingresa el valor de la altura positivo");
                altura = escaner.nextFloat();}

            while (base == altura){
            System.out.println("Esto es un cuadrado, elija valores diferentes");
                System.out.println("Ingresa el valor del lado");
                base = escaner.nextFloat();

                    while (base <= 0){
                    System.out.println("Ingresa el valor de base positivo");
                    base = escaner.nextFloat();}

                System.out.println("Ingresa el valor de la altura");
                altura = escaner.nextFloat();
            
                    while (altura <= 0){
                    System.out.println("Ingresa el valor de la altura positivo");
                    altura = escaner.nextFloat();}
            
            }

            area = base*altura;
            perimetro = 2*base + 2*altura;

            System.out.println("El area del rectangulo es de: "+df.format(area)+" unidades cuadradas");
            System.out.println("Y el perimetro es: "+df.format(perimetro)+" unidades");
        }

    public void Cuadrado(){

            System.out.println("Ingresa el valor del lado");
            base = escaner.nextFloat();

            while (base <= 0){
            System.out.println("Ingresa el valor de base positivo");
            base = escaner.nextFloat();}

            area = base*base;

            perimetro = 4*base;

            System.out.println("El area del cuadrado es de: "+df.format(area)+" unidades cuadradas");
            System.out.println("Y el perimetro es: "+df.format(perimetro)+" unidades");
        }
    public void Triangulo(){

            System.out.println("Ingresa el valor de la base");
            base = escaner.nextFloat();

            while (base <= 0){
            System.out.println("Ingresa el valor de base positivo");
            base = escaner.nextFloat();}

            System.out.println("Ingresa el valor de la altura");
            altura = escaner.nextFloat();

            while (altura <= 0){
            System.out.println("Ingresa el valor de base positivo");
            altura = escaner.nextFloat();}

            area = (base*altura)/2;

            lado = Math.hypot(base, (base/2));

            perimetro = base + 2*lado;

            System.out.println("El area del triangulo es de: "+df.format(area)+" unidades cuadradas");
            System.out.println("Y el perimetro es: "+df.format(perimetro)+" unidades");
        }

}



