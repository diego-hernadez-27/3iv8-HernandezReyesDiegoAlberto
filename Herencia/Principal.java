public class Principal{

    public static void main(String[] args){

        Perro dog = new Perro("Teddy", "Callejero", "croquetas", 2, "fuerte");
        Gato cat = new Gato("Miau", "Hogareño", "atun", 1, 7);
        Perico parrot = new Perico("Willyrex", "Salvaje", "semillas", 5, "verde");
        Hamster ham = new Hamster("Sr. tacataca", "Hogareño", "lechuga", 3, "mucha");
        Tortuga turt = new Tortuga("Greengo", "Hogareño", "uvas", 10, 9.2);

        dog.mostrarPerro();
        cat.mostrarGato();
        parrot.mostrarPerico();
        ham.mostrarHamster();
        turt.mostrarTortuga();
        
    }
}