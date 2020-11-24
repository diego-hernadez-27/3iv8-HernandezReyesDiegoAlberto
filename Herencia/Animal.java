public class Animal{

    private String nombre, raza, tipo_de_alimento;
    private int edad; 

    public Animal(){

    }

    public Animal(String nombre, String raza, String tipo_de_alimento, int edad){

        this.nombre = nombre;
        this.raza = raza;
        this.tipo_de_alimento = tipo_de_alimento;
        this.edad = edad;
    }

    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getTipoAlimento(){
        return tipo_de_alimento;
    }

    public void setTipoAlimento(String tipo_alimento){
        this.tipo_de_alimento = tipo_de_alimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

}