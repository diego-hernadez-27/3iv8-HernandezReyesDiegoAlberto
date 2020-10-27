import java.util.Scanner;

class POKEDEX{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcion, num1, num2;
        double charmander, bulbasaor, squartle;
        char letra;


        letra = 0;
        //Escribiendo los datos.

    do{

        System.out.println("3IV8 Hernandez Reyes Diego Alberto");

        System.out.println("Buenos dias joven entrnador, que desa hacer");
        System.out.println("1.- Consultar los datos de charmander");
        System.out.println("2.- Consultar los datos de bulbasaor");
        System.out.println("3.- Consultar los datos de squartle");
        System.out.println("4.- Iniciar una batalla");
        System.out.println("5.- Salir");
        opcion = entrada.nextInt();

        //Mintras sea negativo el valor repetir

        while(opcion <=0 ){
            System.out.println("Introduzca un valor positivo");
            opcion = entrada.nextInt();}

        //Elijiendo los casos

        switch (opcion){

        case 1:

        System.out.println("Los datos del pokemon son");
        System.out.println("id: 123");
        System.out.println("nombre: charmander");
        System.out.println("fuerza: 15");
        System.out.println("defensa: 5");
        System.out.println("ataque principal: fuego uwu");
        System.out.println("ataque secundario: lava uwu");

        break;

        case 2:

        System.out.println("Los datos del pokemon son");
        System.out.println("id: 124");
        System.out.println("nombre: bulbasaor");
        System.out.println("fuerza: 5");
        System.out.println("defensa: 20");
        System.out.println("ataque principal: plantitas uwu");
        System.out.println("ataque secundario: arbol uwu");

        break;

        case 3:

        System.out.println("Los datos del pokemon son");
        System.out.println("id: 125");
        System.out.println("nombre: squartle");
        System.out.println("fuerza: 15");
        System.out.println("defensa: 17");
        System.out.println("ataque principal: agua uwu");
        System.out.println("ataque secundario: marejada uwu");

        break;

        case 4:

        //Iniciando la batalla pokemon

        charmander =  (15*5)/3;

        bulbasaor = (20*5)/3;

        squartle = (15*17)/3;

            System.out.println("Iniciando una batalla random...");

            System.out.println("1.- charmander, 2.- bulbasaor, 3.- squartle");

            do{
            num1 = (int) (Math.random() * 2 + 1);
            
            num2 = (int) (Math.random() * 2 + 1);
            }while (num1 != num2);

            if(num1 == 1){

                if (num2 == 2){

                        System.out.println("Charmander 50 hp vs bulbasaor 50 hp");
                        System.out.println("Charmander hace "+charmander+" no fue efectivo");
                        System.out.println("Bulbasaor hace "+bulbasaor+" fue casi efectivo");
                        System.out.println("Charmander hace "+charmander+" fue efectivo");
                        System.out.println("Charmander gana");
                }
                    
                else{

                    System.out.println("Charmander 50 hp vs squartle 50 hp");;
                    System.out.println("Charmander hace "+charmander+" no fue efectivo");
                    System.out.println("Squartle hace "+squartle+" fue efectivo");
                    System.out.println("Squartle gana");
                }
            }
            else

                {
                    System.out.println("bulbasaor 50 hp vs squartle 50 hp");
                        System.out.println("Bulbasaor hace "+bulbasaor+" fue casi efectivo");
                        System.out.println("Squartle hace "+squartle+" fue efectivo");
                        System.out.println("Squartle gana");  
            }

        break;

        default:

        System.out.println("Gracias por participar XD");

    }

    System.out.println("¿Deseas repetir el programa?, si lo desea escriba y");  
        letra = entrada.next().charAt(0);

    }while(letra == 'y');

}

}




