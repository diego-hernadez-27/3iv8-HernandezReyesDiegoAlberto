public class Hamster extends Animal{

    private String comida_en_la_boca;

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_de_alimento, int edad, String comida_en_la_boca){
        super(nombre, raza, tipo_de_alimento, edad);
        this.comida_en_la_boca = comida_en_la_boca;
    }

    public String getComidaBoca(){
        return comida_en_la_boca;
    }

    public void setComidaBoca(String color_de_plumas){
        this.comida_en_la_boca = comida_en_la_boca;
    }

    public void mostrarHamster(){
        System.out.println("El nombre del perico es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su retencion de comida en la boca: " + getComidaBoca());
    }
}