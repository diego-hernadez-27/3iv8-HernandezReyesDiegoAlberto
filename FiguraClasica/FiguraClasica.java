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
        System.out.println("4.- Calcular el area y perimetro de un rectangulo ");
        System.out.println("5.- Calcular el area y perimetro de un pentagono ");
        System.out.println("6.- Salir");

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

                perimetro = base*3;

                System.out.println("El area del triangulo es de: "+area);
                System.out.println("Y el perimetro es:"+perimetro);
                break;

            case 3:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                area = 3.1416*base*base;

                perimetro = 2*3.1416*base;

                System.out.println("El area del circulo es de: "+area);
                System.out.println("Y el perimetro es:"+perimetro);
                break;
            
            case 4:
                System.out.println("Ingrese el valor de la base ");
                base = entrada.nextInt();

                System.out.println("Ingrese el valor de la altura ");
                altura = entrada.nextInt();

                area = base*altura;

                perimetro = 2*base + 2*altura;

                System.out.println("El area del rectangulo es de: "+area);
                System.out.println("Y el perimetro es: "+perimetro);

            case 5:
                System.out.println("Ingrese el valor de la base ");
                 base = entrada.nextInt();

                System.out.println("Ingrese el valor del apotema ");
                altura = entrada.nextInt();

                perimetro = base*5;

                area = (perimetro*altura)/2;

                System.out.println("El area del rectangulo es de: "+area);
                System.out.println("Y el perimetro es: "+perimetro);


            default:
                System.out.println("Gracias por participar uwu");
      
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");

        letra = entrada.next().charAt(0);

    }while(letra == 's');
        
    }
}