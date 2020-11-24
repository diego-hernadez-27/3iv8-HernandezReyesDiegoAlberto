import java.util.*;
import javax.swing.JOptionPane;

public class Libro4 extends Biblioteca{

    public Libro4(){}

    public Libro4(String titulo, String autor, int ejemplares, int ejemplarespre){
        super(titulo, autor, ejemplares, ejemplarespre);
    }

    public void mostrarLibro4(){
        JOptionPane.showMessageDialog(null,"El libro es: "+getTitulo()+"\n"
                                           +"Del autor: "+getAutor()+"\n"
                                           +"Los disponibles son: "+getEjemplares()+"\n"
                                           +"Hemos prestado: "+getPrestados()+"\n"
                                           );
    }

}