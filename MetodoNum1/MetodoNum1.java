
import java.util.Scanner;

public class MetodoNum1{

    int m;
    
    

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char letra;

        MetodoNum1 maymen = new MetodoNum1();

        System.out.println("uwu");
        do{
        System.out.println("(umu)/");    
        maymen.cargarValores();
        System.out.println("Deseas repetir?");
        letra = entrada.next().charAt(0);
        System.out.println("ono");
        }while(letra != 's');


    }

    public void cargarValores(){
        Scanner entrada = new Scanner(System.in);

        int val1, val2, val3;
        int mayor, menor;

        System.out.println("Ingresa el primer numero a comparar");
        val1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero a comparar");
        val2 = entrada.nextInt();
        System.out.println("Ingresa el tercero numero a comparar");
        val3 = entrada.nextInt();
        System.out.println("¬¬");
        mayor = calcularMayor(val1, val2, val3);
        System.out.println("kok");
        menor = calcularmenor(val1, val2, val3);

        System.out.println("El valor mayor es: "+ mayor);
        System.out.println("El valor menor es: "+ menor);
    }

    public int calcularMayor(int v1, int v2, int v3){

        if(v1>v2 && v1>v3){
            m = v1;
        }else{
            if(v2>v3){
                m = v2;
            }
            else{
                m = v3;
            }
        }
        return m;

    }

    public int calcularmenor(int v1, int v2, int v3){

        if(v1<v2 && v1<v3){
            
            m = v1;
        }else{
            if(v2<v3){
                m = v2;
            }
            else{
                m = v3;
            }
        }
        return m;

    }

}
