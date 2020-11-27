//Importando librerias
import java.util.*;
import java.io.IOException;

//El juego basicamente dcon todos sus metodos
public class Gato extends Persona{

    Scanner escaner = new Scanner(System.in);
    public static char[][] matriz_gato = new char[3][3];
    public static char jugadorJugando = 'X';
    public static String nombre = " ";
    Jugador1 ju1 = new Jugador1();
    Jugador2 ju2 = new Jugador2();
    
    public void Imprimir_Posiciones() {
        int pos = 1;
        if (jugadorJugando == 'X'){
            System.out.println(" "+ju1.nombre+" es tu turno");
        }else {
            System.out.println(" "+ju2.nombre+" es tu turno");
        }

        for(int i = 0; i < matriz_gato.length; i++){
            for(int j = 0; j < matriz_gato.length; j++){
                if(matriz_gato[i][j] == 'X' || matriz_gato[i][j] == 'O'){
                    System.out.print("  "+matriz_gato[i][j]);
                }else{
                    System.out.print("  "+pos);
                }
                pos++;
            }
            System.out.println();
        }
    }

    public static boolean Casilla_Disponible(int posicion){
        switch (posicion) {
            case 1:
                return matriz_gato[0][0] != ' ';
            case 2:
                return matriz_gato[0][1] != ' ';
            case 3:
                return matriz_gato[0][2] != ' ';
            case 4:
                return matriz_gato[1][0] != ' ';
            case 5:
                return matriz_gato[1][1] != ' ';
            case 6:
                return matriz_gato[1][2] != ' ';
            case 7:
                return matriz_gato[2][0] != ' ';
            case 8:
                return matriz_gato[2][1] != ' ';
            case 9:
                return matriz_gato[2][2] != ' ';
            default:
                return false;
        }
    }

    public void Jugada(char caracter) throws IOException{
        boolean salir = false;
        String entrada;
        int posicion;
        Scanner escaner = new Scanner(System.in);

        do{
            Imprimir_Posiciones();
            if(jugadorJugando == 'X'){
                System.out.println(" "+ju1.nombre+" observe el tablero y elija una casilla (debes introducir el numero)");
                entrada = escaner.next();
            }else{
                System.out.println(" "+ju2.nombre+" observe el tablero y elija una casilla (debes introducir el numero)");
                entrada = escaner.next();
            }

            posicion = Integer.parseInt(entrada);
            if(Casilla_Disponible(posicion)){
                switch (posicion){
                        case 1:
                            matriz_gato[0][0] = caracter;
                        break;
                        case 2:
                            matriz_gato[0][1] = caracter;
                        break;
                        case 3:
                            matriz_gato[0][2] = caracter;
                        break;
                        case 4:
                            matriz_gato[1][0] = caracter;
                        break;
                        case 5:
                            matriz_gato[1][1] = caracter;
                        break;
                        case 6:
                            matriz_gato[1][2] = caracter;
                        break;
                        case 7:
                            matriz_gato[2][0] = caracter;
                        break;
                        case 8:
                            matriz_gato[2][1] = caracter;
                        break;
                        case 9:
                            matriz_gato[2][2] = caracter;
                        break;
                        
                }
                salir = true;
            }else{
                System.out.println("Casilla no valida, introduzca el numero de una casilla que este entre  1 y 9");
            }
        }while (!salir);
    }

    public static boolean Ganador_por_Renglon(char caracter){

        for (char[] gato1 : matriz_gato){
            if(gato1[0] == caracter && gato1[1] == caracter && gato1[2] == caracter){
                return true;
            }
        }
        return false;
    }

    public static boolean Ganador_por_Columna(char caracter){

        for(int i = 0; i < matriz_gato.length; i++){
            if(matriz_gato[0][i] == caracter && matriz_gato[1][i] == caracter && matriz_gato[2][i] == caracter){
                return true;
            }
        }
        return false;
    }

    public static boolean Ganador_por_Diagonales(char caracter){
        
        if(matriz_gato[0][0] == caracter && matriz_gato[1][1] == caracter && matriz_gato[2][2] == caracter){
            return true;
        }
        if(matriz_gato[0][2] == caracter && matriz_gato[1][1] == caracter && matriz_gato[2][0] == caracter){
            return true;
        }
        return false;
    }

    public static boolean Ganador(char caracter) {
        if  (Ganador_por_Renglon(caracter)){
            return true;
        }
        if (Ganador_por_Columna(caracter)){
            return true;
        }
        if (Ganador_por_Diagonales(caracter)){
            return true;
        }
        return false;
    }

    public static boolean Espacios(){
        for(char[] gato1 : matriz_gato){
            for(int j = 0; j < matriz_gato.length; j++){
                if(gato1[j] == '-'){
                    return true;
                }
            }
        }
        return false;
    }

    public static void El_Tablero(){
        for(int i = 0; i < matriz_gato.length; i++){
            for(int j = 0; j < matriz_gato.length; j++){
                matriz_gato[i][j] = '-';
            }
        }
    }

    public void nombres(){
        ju1.mostrarJugador1();
        ju2.mostrarJugador2();
    }

    //Metodo que contola todo el juego
    public void El_Juego() throws IOException{
        Scanner escaner = new Scanner(System.in);

        boolean terminar = false;
        El_Tablero();
        nombres();
        System.out.println("Puedes eleguir cualquier casilla que contenga un numero"
                            +"\nLas casillas que aparezcan con una 'X' o 'O' ya estan ocupadas y no se pueden elegir"
                            +"\nLo demas pues... todos sabemos jugar gato");
        do{
            Jugada(jugadorJugando);
            if(Ganador(jugadorJugando)){
                if(jugadorJugando == 'X'){
                    System.out.println("El jugador "+ju1.nombre+" ha ganado, eres una riata");
                    int pos = 1;
                    for(int i = 0; i < matriz_gato.length; i++){
                        for(int j = 0; j < matriz_gato.length; j++){
                            if(matriz_gato[i][j] == 'X' || matriz_gato[i][j] == 'O'){
                                System.out.print("  "+matriz_gato[i][j]);
                            }else{
                                System.out.print("  "+pos);
                            }
                            pos++;
                        }
                        System.out.println();
                    }
                    terminar = true;
                }else{
                    System.out.println("El jugador "+ju2.nombre+" ha ganado, eres una riata");
                    int pos = 1;
                    for(int i = 0; i < matriz_gato.length; i++){
                        for(int j = 0; j < matriz_gato.length; j++){
                            if(matriz_gato[i][j] == 'X' || matriz_gato[i][j] == 'O'){
                                System.out.print("  "+matriz_gato[i][j]);
                            }else{
                                System.out.print("  "+pos);
                            }
                            pos++;
                        }
                        System.out.println();
                    }
                    terminar = true;
                }

            }else{
                if(!Espacios()){
                    System.out.println("Ya no hay mas casillas disponibles, hay un empate");
                    terminar = true;
                }else if(jugadorJugando == 'X'){
                    jugadorJugando = 'O';
                }else{
                    jugadorJugando = 'X';
                }

            }
        }while(!terminar);
        
    }

}