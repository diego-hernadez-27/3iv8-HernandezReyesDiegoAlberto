public class Perico extends Animal{

    private String color_de_plumas;

    public Perico(){

    }

    public Perico(String nombre, String raza, String tipo_de_alimento, int edad, String color_de_plumas){
        super(nombre, raza, tipo_de_alimento, edad);
        this.color_de_plumas = color_de_plumas;
    }

    public String getColorPlumas(){
        return color_de_plumas;
    }

    public void setColorPlumas(String color_de_plumas){
        this.color_de_plumas = color_de_plumas;
    }

    public void mostrarPerico(){
        System.out.println("El nombre del perico es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su plumaje es de color: " + getColorPlumas());
    }
}