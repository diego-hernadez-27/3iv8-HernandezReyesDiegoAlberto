import java.util.*;
import javax.swing.JOptionPane;

public class Libro1 extends Biblioteca{

    public Libro1(){}

    public Libro1(String titulo, String autor, int ejemplares, int ejemplarespre){
        super(titulo, autor, ejemplares, ejemplarespre);
    }

    public void mostrarLibro1(){
        JOptionPane.showMessageDialog(null,"El libro es: "+getTitulo()+"\n"
                                           +"Del autor: "+getAutor()+"\n"
                                           +"Los disponibles son: "+getEjemplares()+"\n"
                                           +"Hemos prestado: "+getPrestados()+"\n"
                                           );
    }



}