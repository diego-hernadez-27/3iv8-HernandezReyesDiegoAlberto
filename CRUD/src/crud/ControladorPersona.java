/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author 25666
 * */

import java.util.ArrayList;

public class ControladorPersona {
    
    public ArrayList<Persona> listaPersona = new ArrayList<Persona>();

    public void agregarPersona(Persona p){

        listaPersona.add(p);
    }
    
    public Persona buscarPersona(int id){

        Persona encontrada = new Persona();

        for(Persona p : listaPersona){

            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("No existe el registro");
            }
        }
        return encontrada;
    }
    
    public void actualizarPersona(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());

        listaPersona.remove(actualizar);

        listaPersona.add(actualizada);
    }

    public void eliminarPersona(Persona eliminar){
        listaPersona.remove(eliminar);
    }
    
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersona;
    }
    
    
    
}