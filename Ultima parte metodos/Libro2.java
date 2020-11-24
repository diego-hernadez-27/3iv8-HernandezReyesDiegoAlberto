import java.util.*;
import javax.swing.JOptionPane;

public class Libro2 extends Biblioteca{

    public Libro2(){}

    public Libro2(String titulo, String autor, int ejemplares, int ejemplarespre){
        super(titulo, autor, ejemplares, ejemplarespre);
    }

    public void mostrarLibro2(){
        JOptionPane.showMessageDialog(null,"El libro es: "+getTitulo()+"\n"
                                           +"Del autor: "+getAutor()+"\n"
                                           +"Los disponibles son: "+getEjemplares()+"\n"
                                           +"Hemos prestado: "+getPrestados()+"\n"
                                           );
    }

}