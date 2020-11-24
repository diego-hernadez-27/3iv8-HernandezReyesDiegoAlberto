import javax.swing.JOptionPane;

public class Principal{

 public static void main(String[] args){
    int opcion = 0;
    String respuesta = "";
    char otrarespuesta = ' ';

   do{

   opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija lo que quiera hacer en este programa: \n1.-Sueldo de un empleado\n2.-Productos de un Proveedor\n3.-Libreria"));

   switch (opcion) {
      case 1:

         do{
         Sueldo obj = new Sueldo();
         obj.mostrarDatos();
         obj.lasOperaciones();
         respuesta = JOptionPane.showInputDialog("Escriba si, para repetir Sueldo de un empleado");
         }while(respuesta.equals("si"));
         break;
      
      case 2:

         do{
         Proveedores obja = new Proveedores();
         obja.mostrarCliente();
         obja.mostrarProductos();
         obja.mostrarOtros();
         obja.mostrarTotal();
         respuesta = JOptionPane.showInputDialog("Escriba si, para repetir Productos de un Proveedor");
         }while(respuesta.equals("si"));

         break;
      
      case 3:

         do{
         LosLibros objb = new LosLibros();
         objb.Cosas();
         respuesta = JOptionPane.showInputDialog("Escriba si, para repetir Libreria");
         }while(respuesta.equals("si"));
         
         break;
   
      default:
         break;
   }

      otrarespuesta = JOptionPane.showInputDialog("Si desea repetir todo introduzca la 'y'").charAt(0);

   }while (otrarespuesta == 'y');
   
}
}