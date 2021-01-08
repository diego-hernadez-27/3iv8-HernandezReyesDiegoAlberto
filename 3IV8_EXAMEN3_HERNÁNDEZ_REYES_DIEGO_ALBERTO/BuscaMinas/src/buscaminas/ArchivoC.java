
package buscaminas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class ArchivoC implements Serializable{
    
    ArrayList<Jugador> listarecuperada = new ArrayList<Jugador>();
    
    public ArrayList<Jugador> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<Jugador>)in.readObject();
            in.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Esperando... "+e.getMessage());
        }return listarecuperada;
    }
    
    void serializar(ArrayList<Jugador> listaseriar){
        try{
            FileOutputStream out = new FileOutputStream("libro.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(listaseriar);
            objout.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"ERROR... "+e.getMessage());
        }
    }
    
}
