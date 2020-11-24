public class Tortuga extends Animal{

    private double tamano_del_caparazon;

    public Tortuga(){

    }

    public Tortuga(String nombre, String raza, String tipo_de_alimento, int edad, double tamano_del_caparazon){
        super(nombre, raza, tipo_de_alimento, edad);
        this.tamano_del_caparazon = tamano_del_caparazon;
    }

    public double getTamanoCaparazon(){
        return tamano_del_caparazon;
    }

    public void setTamanoCaparazon(double color_de_plumas){
        this.tamano_del_caparazon = tamano_del_caparazon;
    }

    public void mostrarTortuga(){
        System.out.println("El nombre del perico es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su diametro del caparazon: " + getTamanoCaparazon());
    }
}