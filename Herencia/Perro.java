public class Perro extends Animal{

    private String ladrido;

    public Perro(){

    }

    public Perro(String nombre, String raza, String tipo_de_alimento, int edad, String ladrido){

        super(nombre, raza, tipo_de_alimento, edad);

        this.ladrido = ladrido;
    }

    public String getLadrido(){
        return ladrido;
    }

    public void setLadrido(String ladrido){
        this.ladrido = ladrido;
    }

    public void mostrarPerro(){
        System.out.println("El nombre del perro es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su ladrido es: " + getLadrido());
    }
}