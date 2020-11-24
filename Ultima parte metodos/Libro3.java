import java.util.*;
import javax.swing.JOptionPane;

public class Libro3 extends Biblioteca{

    public Libro3(){}

    public Libro3(String titulo, String autor, int ejemplares, int ejemplarespre){
        super(titulo, autor, ejemplares, ejemplarespre);
    }

    public void mostrarLibro3(){
        JOptionPane.showMessageDialog(null,"El libro es: "+getTitulo()+"\n"
                                           +"Del autor: "+getAutor()+"\n"
                                           +"Los disponibles son: "+getEjemplares()+"\n"
                                           +"Hemos prestado: "+getPrestados()+"\n"
                                           );
    }

}
