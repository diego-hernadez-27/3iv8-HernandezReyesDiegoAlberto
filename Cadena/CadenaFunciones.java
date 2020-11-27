import java.util.*;

public class CadenaFunciones{

    Scanner entrada = new Scanner(System.in);}

    public void masFunciones() {

        String s1 = new String("Hola tengo otra forma de cadenas");
        String s2 = new String("patito");
        String s3 = new String("Feliz Cumpleaños");
        String s4 = new String("feliz cumpleaños");
    
        System.out.println("Escribir la letra de un cracter: ");
        char y;
        y = entrada.next().charAt(0);
        System.out.println("Escribiste: "+y);
        
        String salida = "cadena s1: "+s1+"\n cadena s2: "+s2+"\n cadena s3: "
                        +s3+"\n cadena s4: "+s4+"\n";

        if(s1.equals("Hola tengo otra forma de cadenas")){

            salida += "Si es igual a s1\n";
            System.out.println(salida);

        }else{
            salida += "No es igual a s1\n";
            System.out.println(salida);
        }

        if(s3.equalsIgnoreCase(s4)){
            salida += "s3 si es igual a s4\n"
            System.out.println(salida);
        }else{
            salida += "s3 no es igual a s4\n"
            System.out.println(salida);
        }

        salida += "\n s1 compareTo (s2): "+s1.compareTo(s2)+
                  "\n s2 compareTo (s3): "+s1.compareTo(s1)+
                  "\n s3 compareTo (s4): "+s1.compareTo(s4)+
                  "\n s4 compareTo (s3): "+s1.compareTo(s3)+

        String s5 = "Patito color de cafe";

        int pos;

        pos = s5.indexOf('t', pos+1);
        System.out.println("Segunda aparicion de t: "+pos);

        String s6 = "12";

        System.out.println("Cadena original: "+s6);
        System.out.println("Cadena sin espacios en blanco: ")
    }

}