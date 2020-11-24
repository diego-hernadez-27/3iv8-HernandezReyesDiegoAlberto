import java.util.*;
import javax.swing.JOptionPane;

public class Libro5 extends Biblioteca{

    public Libro5(){}

    public Libro5(String titulo, String autor, int ejemplares, int ejemplarespre){
        super(titulo, autor, ejemplares, ejemplarespre);
    }

    public void mostrarLibro5(){
        JOptionPane.showMessageDialog(null,"El libro es: "+getTitulo()+"\n"
                                           +"Del autor: "+getAutor()+"\n"
                                           +"Los disponibles son: "+getEjemplares()+"\n"
                                           +"Hemos prestado: "+getPrestados()+"\n"
                                           );
    }



}
