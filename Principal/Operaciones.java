import java.util.Scanner;

public class Operaciones{

    Scanner entrada = new Scanner(System.in);

    public void menu(){

        char op, letra;

        System.out.println("Ejemplo de un menu que se encarga de: ");
        System.out.println("A.- Calculadora ");
        System.out.println("B.- Conversor de unidades ");
        System.out.println("C.- Creacion de cuadros");
        System.out.println("D.- Movimiento en cuadro");

        op = entrada.next().charAt(0);

        switch (op) {
            case 'A':
                do{
                Calculadora();
                System.out.println("¿Quieres repetir calculadora? si es asi puchale a ala s");
                letra = entrada.next().charAt(0);
                }while (letra == 's');
            break;
            
            case 'B':
                do{
                ConversordeUnidades();
                System.out.println("¿Quieres repetir conversor de unidades? si es asi puchale a ala s");
                letra = entrada.next().charAt(0);
                }while (letra == 's');
            break;

            case 'C':
                do{
                CreaCuadro();
                System.out.println("¿Quieres repetir creacion de cuadros? si es asi puchale a ala s");
                letra = entrada.next().charAt(0);
                }while (letra == 's');
            break;
            
            case 'D':
                MoviCuadro();
            break;

            default:
            break;
        }

    }

    public void Calculadora(){

        double numero = 0.00, suma = 0.00, multi = 1.00, division = 1.00, num1 = 0;

        char operacion, p;

        System.out.println("Seleccione la opcion desada: ");
        System.out.println("a. Suma y resta");
        System.out.println("b. Multiplicacion");
        System.out.println("c. Division ");
        System.out.println("d. Salir");

        operacion = entrada.next().charAt(0);

        switch(operacion){

            case 'a':
                do{
                    System.out.println("Para dejar de sumar/restar ingresa 0");
                    System.out.println("Ingresa el valor a sumar/resta (si va a restar no olvides ponerle el menos crack): ");
                    numero = entrada.nextDouble();

                    suma += numero;

                    }while(numero!=0);
                    System.out.println("La suma total es de: "+ suma);
                break;

            case 'b':
                do{
                    System.out.println("Para dejar de multiplicar ingresa 1");
                    System.out.println("Ingresa el valor a multiplicar: ");
                    numero = entrada.nextDouble();

                    if(numero > 0){
                        multi *= numero;
                    }else{
                        System.out.println("Ingresa solo positivos");
                    }

                    }while(numero != 1);
                    System.out.println("El producto total es de: "+ multi);
                break;

            case 'c':
                do{
                    System.out.println("Para dejar de dvidir ingresa 1");
                    System.out.println("Ingresa el valor a dividir: ");
                    numero = entrada.nextDouble();

                    while(numero < 0){
                        System.out.println("Numeros positivos por fa, intente otra vez");
                        numero = entrada.nextInt();
                    }

                    division = numero / division;

                    }while(numero != 1);
                    System.out.println("El cociente total es de: "+ division);


                break;

            default:

            break;
               
        }


    }

    public void ConversordeUnidades(){

        double numero = 0.00, conversion = 0.00;

        char operacion;

        System.out.println("Seleccione la opcion desada: ");
        System.out.println("a. Convertir metros a cm: ");
        System.out.println("b. Convertir metros a pulgadas: ");
        System.out.println("c. Convertir kilogramos a libras: ");
        System.out.println("d. Convertir kilogramos a onzas: ");
        System.out.println("e. Salir");

        operacion = entrada.next().charAt(0);

        switch(operacion){

            case 'a':
                System.out.println("Ingrese los metros que quiera convertir a centimetros");
                numero = entrada.nextDouble();

                conversion = numero / 0.010000;

                System.out.println("A centimetros serian: "+conversion+" cm");
             break;

            case 'b':
                System.out.println("Ingrese los metros que quiera convertir a pulgadas");
                numero = entrada.nextDouble();

                conversion = numero * 39.370;

                System.out.println("A pulgadas serian: "+conversion+" in");
            break;

            case 'c':
                System.out.println("Ingrese los kilogramos que quiera convertir a libras");
                numero = entrada.nextDouble();

                conversion = numero * 2.2046;

                System.out.println("A libras serian: "+conversion+" lb");
            break;

            case 'd':
                System.out.println("Ingrese los kilogramos que quiera convertir a onzas");
                numero = entrada.nextDouble();

                conversion = numero * 35.274;

                System.out.println("A onzas serian: "+conversion+" oz");
            break;

            default:

            break;
               
        }

    }

    public void CreaCuadro(){

        int n, m = 0;

            System.out.println("Ingresa el numero de * que tenga el cuadro magico");
            n = entrada.nextInt();

            if((n<0) || (n>100)){
                System.out.println("No se aceptan negativos, ni valores superiores a 1000");
            }else{

                for(int i=0; i <= n; i++){
                    System.out.print("* ");
                }

                System.out.print("\n");

                    for(int i = -2; i < n - 4; i++){

                        System.out.print("*");
                        System.out.print(" ");

                        for(int j = 0; j < n - 1; j++){

                            System.out.print("  ");
                        }
                        System.out.println("*");
                        
                    }
                    for(int k = 0; k <= n; k++){

                        System.out.print("* ");
                    }
            }
        System.out.println("\n");

    }

    public void MoviCuadro(){

        int n, m = 0;

            System.out.println("Ingresa el numero de * que tenga el cuadro magico");
            n = entrada.nextInt();

            if((n<0) || (n>100)){
                System.out.println("No se aceptan negativos, ni valores superiores a 1000");
            }else{

                for(int i=0; i <= n; i++){
                    System.out.print("* ");
                }

                System.out.print("\n");

                    for(int i = -2; i < n - 4; i++){

                        System.out.print("*");
                        System.out.print(" ");

                        for(int j = 0; j < n - 1; j++){

                            System.out.print("  ");
                        }
                        System.out.println("*");
                        
                    }
                    for(int k = 0; k <= n; k++){

                        System.out.print("* ");
                    }
            }
        System.out.println("\n");

    }

}