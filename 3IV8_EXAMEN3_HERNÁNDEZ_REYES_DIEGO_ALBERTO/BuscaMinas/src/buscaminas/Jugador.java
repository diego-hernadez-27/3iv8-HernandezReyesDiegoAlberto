
package buscaminas;

import java.io.Serializable;

public class Jugador implements Serializable, Comparable<Jugador>{
    
    public String nombre, contrasena;
    public int edad;
    public Integer puntos;
    
    public Jugador(){}

    public Jugador(String nombre, int edad, String contraseña, int puntos) {
        this.nombre = nombre;
        this.contrasena = contraseña;
        this.puntos = puntos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{ \n" + "\nnombre=" + nombre + "\nedad=" + edad + "\npuntos=" + puntos + '}'+"\n";
    }

    @Override
    public int compareTo(Jugador t) {
        return puntos.compareTo(t.getPuntos());
    }
    
}
