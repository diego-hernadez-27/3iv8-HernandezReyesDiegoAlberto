import java.io.*;
public class Principal {



public static void main(String[] args)throws IOException {
BufferedReader recibir=new BufferedReader (new InputStreamReader(System.in));
String gatito[][];
gatito = new String[3][3];//matrices
int n=0;
int fila;
int columna;

    for (int a=0; a<=2; a=a+1) {
        for (int b=0; b<=2; b=b+1) {
            gatito[a][b]="*";
            int dato;
            int dato1;
            int datob;
            int datob2;
        }
    }   

//tablero
System.out.println("  0   1   2");
System.out.println("0 "+gatito[0][0]+" | "+gatito[0][1]+" | "+gatito[0][2]);
System.out.println("  _ _ _ _ _ ");
System.out.println("2 "+gatito[1][0]+" | "+gatito[1][1]+" | "+gatito[1][2]);
System.out.println("  _ _ _ _ _ ");
System.out.println("3 " +gatito[2][0]+" | "+gatito[2][1]+" | "+gatito[2][2]);

while (n<10) { //ciclo

//jugador 'x'
System.out.println("Es el turno de X.");
System.out.println(" fila.");
int dato = Integer.parseInt(recibir.readLine());
System.out.println(" columna.");
int dato1=Integer.parseInt(recibir.readLine());
//comprobar si la jugada existe
while (gatito[dato][dato1]== "X" || gatito[dato][dato1]== "O" ) { //comparacion
System.out.println("Esta casilla ya esta ocupada, elija otra");
System.out.println("Ingrese una fila.");
dato=Integer.parseInt(recibir.readLine());
System.out.println("Ingrese una columna.");
dato1=Integer.parseInt(recibir.readLine());
}
gatito[dato][dato1] = "X";
//jugador X

//tablero
System.out.println(" 0   1   2");
System.out.println("0 "+gatito[0][0]+" | "+gatito[0][1]+" | "+gatito[0][2]);
System.out.println("  ___________");
System.out.println("1 "+gatito[1][0]+" | "+gatito[1][1]+" | "+gatito[1][2]);
System.out.println("  ___________");
System.out.println("2 "+gatito[2][0]+" | "+gatito[2][1]+" | "+gatito[2][2]);

n=n+1;


if (gatito[0][0]== "X" && gatito[0][1]== "X" && gatito [0][2]== "X") {
System.out.println("El ganador es el jugador 'x'.");
break;
}
if (gatito[1][0]== "X" && gatito[1][1]== "X" && gatito [1][2]== "X") {
System.out.println("El ganador es el jugador 'x'.");
break;
}
else if (gatito[2][0]== "X" && gatito[2][1]== "X" && gatito [2][2]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
if (gatito[0][0]== "X" && gatito[1][0]== "X" && gatito [2][0]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
if (gatito[0][1]== "X" && gatito[1][1]== "X" && gatito [2][1]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
if (gatito[0][2]== "X" && gatito[1][2]== "X" && gatito [2][2]== "X") {
System.out.println("El ganador es el jugador 'X'.");
break;
}
//diagonales faltan
if (gatito[0][0]== "X" && gatito[1][1]== "X" && gatito [2][2]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
if (gatito[0][2]== "X" && gatito[1][1]== "X" && gatito [2][0]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
//condiciones victoria

if (n==9) {
break;
}

//jugador 0
System.out.println("Es el turno del la Maquina");
System.out.println(" fila.");
int datob;
datob = (int)(Math.random()*3)+0;
System.out.println("columna.");
int datob2;
datob2 = (int)(Math.random()*3)+0;
System.out.println("numeros elegidos"+datob+"segundo"+datob2);
//comprobar si la jugada existe
while (gatito[datob][datob2]== "O" || gatito[datob][datob2]== "X" ) {
System.out.println("maquina");
datob = (int)(Math.random()*3)+0;
datob2 = (int)(Math.random()*3)+0;
System.out.println("numeros elegidos"+datob+"segundo"+datob2);
}
gatito[datob][datob2] = "O";
// jugador O

//tablero
System.out.println(" 0   1   2");
System.out.println("0 "+gatito[0][0]+" | "+gatito[0][1]+" | "+gatito[0][2]);
System.out.println("  ____________");
System.out.println("1 "+gatito[1][0]+" | "+gatito[1][1]+" | "+gatito[1][2]);
System.out.println("  ____________");
System.out.println("2 "+gatito[2][0]+" | "+gatito[2][1]+" | "+gatito[2][2]);

n=n+1;//cantidad de jugadas permitidas

if (gatito[0][0]== "O" && gatito[0][1]== "O" && gatito [0][2]== "O") {
System.out.println("el ganador es la maquina");
break;
}
if (gatito[1][0]== "O" && gatito[1][1]== "O" && gatito [1][2]== "O") {
System.out.println("El ganador es la maquina");
break;
}
if (gatito[2][0]== "O" && gatito[2][1]== "O" && gatito [2][2]== "O") {
System.out.println("El ganador es la maquina.");
break;
}
if (gatito[0][0]== "O" && gatito[1][0]== "O" && gatito [2][0]== "O") {
System.out.println("El ganador es la maquina");
break;
}
if (gatito[0][1]== "O" && gatito[1][1]== "O" && gatito [2][1]== "O") {
System.out.println("El ganador es la maquina");
break;
}
if (gatito[0][2]== "O" && gatito[1][2]== "O" && gatito [2][2]== "O") {
System.out.println("El ganador es la maquina");
break;
}
//diagonales faltan
if (gatito[0][0]== "O" && gatito[1][1]== "O" && gatito [2][2]== "O") {
System.out.println("El ganador es la maquina.");
break;
}
if (gatito[0][2]== "O" && gatito[1][1]== "O" && gatito [2][0]== "O") {
System.out.println("El ganador es la maquina");
break;
}
//condiciones victoria

if (n==9) {
break;
}

}

}
}