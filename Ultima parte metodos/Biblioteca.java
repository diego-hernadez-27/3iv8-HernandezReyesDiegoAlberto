import java.util.*;
import javax.swing.JOptionPane;

public class Biblioteca {

    private String titulo, autor;
    private int ejemplares, ejemplarespre;

    public Biblioteca(){

    }

    public Biblioteca(String titulo, String autor, int ejemplares, int ejemplarespre){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplarespre = ejemplarespre;
    }


    public String getTitulo(){
        return titulo;
    }
 
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }


    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getEjemplares(){
        return ejemplares;
    }

    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }

    public int getPrestados(){
        return ejemplarespre;
    }
    
    public void setPrestados(int ejemplarespre){
        this.ejemplarespre = ejemplarespre;
    }

    public boolean Prestamos(){
        
        boolean prestado = true;

        if(ejemplarespre < ejemplares){
            ejemplarespre++;
            ejemplares--;
        }else{
            prestado = false;
        }
        return prestado;

    }

    public boolean Devoluciones(){
        boolean devolucion = true;
        if(ejemplarespre == 0){

            devolucion = false;

        }else{

            ejemplarespre--;
            ejemplares++;

        }
        return devolucion;
    }
}