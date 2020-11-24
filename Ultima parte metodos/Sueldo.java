import javax.swing.JOptionPane;
import java.util.*;
public class Sueldo{

    private int id; 
    private String nombre, puesto;
    double sueldo_quincenal[] = new double[4];
    double total = 0;
    int id2;
    String puesto2, nombre2;

    public Sueldo(){}

    public Sueldo(int id, String nombre, String puesto){

        this.id = id; 
        this.nombre = nombre;
        this.puesto = puesto;

    }

        public int getId(){

            while(true){
            try {

                id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nueva id futuro empleado"));

                break;

            } catch (Exception e) {
               
            }
            
                JOptionPane.showMessageDialog(null, "Introducio un dato no valido, intentelo de nuevo");

            }

            return id;

        }

        public void setId(int id){
            this.id = id;
        }

        public String getPuesto(){
            
            puesto = JOptionPane.showInputDialog("¿Que puesto quiere tener en nuestra empresa, normal o supervisor? ");
 
            return puesto;

        }

        public void setPuesto(String puesto){
            this.puesto = puesto;
        }

        public String getNombre(){

            nombre = JOptionPane.showInputDialog("Introduzca su nombre, futuro empleado");
 
            return nombre;

        }

        public void setNombre(){
            this.nombre = nombre;
        }

        public void mostrarDatos(){
            JOptionPane.showMessageDialog(null, getNombre()+"Su id de empleado es: "+getId()+" y su puesto es: "+getPuesto());
        }

    public void lasOperaciones(){

        JOptionPane.showMessageDialog(null, "Introduzca sus datos de empleado por favor, comenzemos con su id, para obtener su sueldo");
        id2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id de empleado"));

        while (id2 != id){
            id2 = Integer.parseInt(JOptionPane.showInputDialog("¿Seguro que este es su numero de empleado?, intentelo de nuevo"));
        }

        puesto2 = JOptionPane.showInputDialog("Ingrese su puesto de empleado");

        while(!puesto2.equals(puesto)){
            puesto2 = JOptionPane.showInputDialog("¿Seguro que este es su puesto?, intentelo de nuevo");
        }

        nombre2 =  JOptionPane.showInputDialog("Ingrese su nombre");
    
       while(!nombre2.equals(nombre)){
            nombre2 = JOptionPane.showInputDialog("Esta persona no podria ser usted, intentelo de nuevo");
       }
        
        if (puesto2.equals("normal")){
        
            sueldo_quincenal[0] = 5000;
            JOptionPane.showMessageDialog(null, "Inicialmente al empleado se le pagaran: $"+sueldo_quincenal[0]);

            sueldo_quincenal[1] = Double.parseDouble(JOptionPane.showInputDialog("Indique las horas diurnas extra que tuvo en los 15 dias"));

            while(sueldo_quincenal[1] > 45){
                sueldo_quincenal[1] = Double.parseDouble(JOptionPane.showInputDialog("¿Seguro que trabajo tantas horas?, intentelo de nuevo"));
            }

            sueldo_quincenal[2] = Double.parseDouble(JOptionPane.showInputDialog("Indique las horas nocturnas extra que tuvo en los 15 dias"));

            while(sueldo_quincenal[2] > 45){
                sueldo_quincenal[2] = Double.parseDouble(JOptionPane.showInputDialog("¿Seguro que trabajo tantas horas?, intentelo de nuevo"));
            }

            total = sueldo_quincenal[0]+(sueldo_quincenal[1]*50)+(sueldo_quincenal[2]*60);

            JOptionPane.showMessageDialog(null, nombre+" su sdueldo total es de: $"+total);
        
        }else{

            sueldo_quincenal[0] = 8000;
            JOptionPane.showMessageDialog(null, "Inicialmente al empleado se le pagaran: $"+sueldo_quincenal[0]);

            sueldo_quincenal[1] = sueldo_quincenal[0]*0.2;

            JOptionPane.showMessageDialog(null, "Se le quitara del INFONAVIT: $"+sueldo_quincenal[1]);

            sueldo_quincenal[2] = sueldo_quincenal[0]*0.1;
            
            JOptionPane.showMessageDialog(null, "Se le quitara de seguro de gastos medicos: $"+sueldo_quincenal[2]);

            sueldo_quincenal[3] = sueldo_quincenal[0]*0.16;

            JOptionPane.showMessageDialog(null, "Se le quitara de seguro de ISR: $"+sueldo_quincenal[3]);

            total = sueldo_quincenal[0] - sueldo_quincenal[1] - sueldo_quincenal[2] - sueldo_quincenal[3];

            JOptionPane.showMessageDialog(null, nombre+" su sueldo total es de: $"+total);

        }

    } 

}