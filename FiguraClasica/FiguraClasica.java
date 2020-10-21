import java.util.Scanner;

class FiguraClasica{

    public static void main(String[] args){
  
        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion;
        char letra;
        double area, perimetro;
    do{
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el area y perimetro de un cuadrado ");
        System.out.println("2.- Calcular el area y perimetro de un triangulo ");
        System.out.println("3.- Calcular el area y perimetro de un circulo ");
        System.out.println("4.- Salir ");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                area = base*base;

                perimetro = 4*base;

                System.out.println("El area del cuadrado es de: "+area);
                System.out.println("Y el perimetro es de: "+perimetro);
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                area = (base*altura)/2;

                System.out.println("El area del triangulo es de: "+area);
                break;

            case 3:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                area = 3.1416*base*base;

                System.out.println("El area del circulo es de: "+area);
                break;

            default:
                System.out.println("Gracias por participar unu nwn");
      
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");

        letra = entrada.next().charAt(0);

    }while(letra == 's');
        
    }
}