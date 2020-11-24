import java.util.*;
import javax.swing.JOptionPane;
 
public class Proveedores {

    private String nombre_cliente;
    private String mi_Proveedor;
    String producto[] = {"Zelda BoW", "Mario Delux", "Mario Kart 8", "MK 1", "Pokemon", "Fifa 20", "Luigi's mansion", "Smash Bros", "just dance", "overwatch"};
    int costo[] = {1599, 1599, 1499, 699, 1399, 1199, 1499, 1599, 1099, 799 };
    int pexistentes[] = {12, 26, 10, 30, 15, 21, 13, 5, 19, 27};
    int totaldetodo[] = new int[10];
    int mayor, menor, promedio, suma_costos;
    
    public Proveedores(){}

    public Proveedores(String nombre_cliente, String mi_Proveedor){

        this.nombre_cliente = nombre_cliente;
        this.mi_Proveedor = mi_Proveedor;

    }

    public String getNombreC(){
        nombre_cliente = JOptionPane.showInputDialog("Introduzca el nombre del cliente: ");

        return nombre_cliente;
    }

    public void setNombreC(String nombre_cliente){
        this.nombre_cliente = nombre_cliente;
    }



    public String getNombreP(){
        mi_Proveedor = "Juanito Escarcha";

        return mi_Proveedor;
    }

    public void setNombreP(String mi_Proveedor){
        this.mi_Proveedor = mi_Proveedor;
    }


    public void mostrarCliente(){
      JOptionPane.showMessageDialog(null, "El nombre del cliente es: "+getNombreC());
    }

    public void mostrarProductos(){
        JOptionPane.showMessageDialog(null, "Su proveedor es: "+getNombreP()+"\n"
                                            +producto[0]+",  precio: $"+costo[0]+",  disponibles: "+pexistentes[0]+"\n"
                                            +producto[1]+",  precio: $"+costo[1]+",  disponibles: "+pexistentes[1]+"\n"
                                            +producto[2]+",  precio: $"+costo[2]+",  disponibles: "+pexistentes[2]+"\n"
                                            +producto[3]+",  precio: $"+costo[3]+",  disponibles: "+pexistentes[3]+"\n"
                                            +producto[4]+",  precio: $"+costo[4]+",  disponibles: "+pexistentes[4]+"\n"
                                            +producto[5]+",  precio: $"+costo[5]+",  disponibles: "+pexistentes[5]+"\n"
                                            +producto[6]+",  precio: $"+costo[6]+",  disponibles: "+pexistentes[6]+"\n"
                                            +producto[7]+",  precio: $"+costo[7]+",  disponibles: "+pexistentes[7]+"\n"
                                            +producto[8]+",  precio: $"+costo[8]+",  disponibles: "+pexistentes[8]+"\n"
                                            +producto[9]+",  precio: $"+costo[9]+",  disponibles: "+pexistentes[9]);
    }

    public int getSumaCosto(){
        for(int i = 0; i < costo.length; i++){
            suma_costos += costo[i];
        }
        return suma_costos;
    }

    public void setSumaCosto(int suma_costos){
        this.suma_costos = suma_costos;
    }

    public int getMayor(){

        mayor = costo[0];

        for(int i = 0; i < costo.length; i++){
           if(costo[i] > mayor){
               mayor = costo[i];
            }
 
    } return mayor;
    }

    public void setMayor(int mayor){
        this.mayor = mayor;
    }

    public int getMenor(){

        menor = costo[0];

        for(int i = 0; i < costo.length; i++){
           if(costo[i] < menor){
               menor = costo[i];
            }
 
    }       return menor;
    }

    public void setMenor(int menor){
        this.menor = menor;
    }

    public int getPromedio(){
        promedio = suma_costos/costo.length;
        return promedio;
    }

    public void setPromedio(int promedio){
        this.promedio = promedio;
    }
  
    public void mostrarOtros(){
        JOptionPane.showMessageDialog(null, "La suma total de costos es: $"+getSumaCosto()+"\nEl numero mayor es: $"+getMayor()+
                                        "\ny el menor es: $"+getMenor()+"\n El promedio de los costos es: $"+getPromedio());
    }

    public void mostrarTotal(){
        for(int i = 0; i <= 9; i++){
            totaldetodo[i] = costo[i]*pexistentes[i];
        }
        JOptionPane.showMessageDialog(null,"el total de cada producto es: \n"
                                        +producto[0]+",  total del producto: $"+totaldetodo[0]+"\n"
                                        +producto[1]+",  total del producto: $"+totaldetodo[1]+"\n"
                                        +producto[2]+",  total del producto: $"+totaldetodo[2]+"\n"
                                        +producto[3]+",  total del producto: $"+totaldetodo[3]+"\n"
                                        +producto[4]+",  total del producto: $"+totaldetodo[4]+"\n"
                                        +producto[5]+",  total del producto: $"+totaldetodo[5]+"\n"
                                        +producto[6]+",  total del producto: $"+totaldetodo[6]+"\n"
                                        +producto[7]+",  total del producto: $"+totaldetodo[7]+"\n"
                                        +producto[8]+",  total del producto: $"+totaldetodo[8]+"\n"
                                        +producto[9]+",  total del producto: $"+totaldetodo[9]);

    }



    
}