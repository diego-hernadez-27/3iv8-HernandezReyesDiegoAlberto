import javax.swing.JOptionPane;

public class LosLibros{

    public void Cosas() {
    
        int opcion = 0;
        String respuesta = ""; 

       opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija el libro que quisiera devolver o pedir: \n"
                                                            +"1.-MOMO\n2.-BALDOR: GyT\n3.-La historia del mundo\n"
                                                            +"4.-Dinosaurios\n 5.-El kamasutra"));

        switch (opcion) {
            case 1:
                Libro1 lib1 = new Libro1("MOMO", "Michael Ende", 5, 3);
                lib1.mostrarLibro1();

                respuesta = JOptionPane.showInputDialog("Si quiere hacer un prestamo escriba si, si desea hacer una devolucion escriba no");

                if (respuesta.equals("si")){  

                if(lib1.Prestamos()==true){

                    JOptionPane.showMessageDialog(null, "Se presto el libro: "+lib1.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "Ya no tenemos mas copias de: "+lib1.getTitulo());
            
                }

                }else{
            
                if(lib1.Devoluciones()){
            
                    JOptionPane.showMessageDialog(null, "Se devolvio el libro: "+lib1.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "El  inventario esta lleno");
            
                }
                         
                }
                JOptionPane.showMessageDialog(null, "Los libros prestados de este libro son: "+lib1.getPrestados());
                JOptionPane.showMessageDialog(null, "Los libros en el inventario son: "+lib1.getEjemplares());   


                break;
            
            case 2:
                Libro2 lib2 = new Libro2("BALDOR: GyT", "Dr. J. A. Baldor", 10, 4);
                lib2.mostrarLibro2();



                respuesta = JOptionPane.showInputDialog("Si de hacer un prestamo escriba si, si quiere hacer una devolucion escriba no");

                if (respuesta.equals("si")){  

                if(lib2.Prestamos()==true){

                    JOptionPane.showMessageDialog(null, "Se presto el libro: "+lib2.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "Ya no tenemos mas copias de: "+lib2.getTitulo());
            
                }

                }else{
            
                if(lib2.Devoluciones()){
            
                    JOptionPane.showMessageDialog(null, "Se devolvio el libro: "+lib2.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "No hay mas ejemplares de este libro");
            
                }
                         
                }
                JOptionPane.showMessageDialog(null, "Los libros prestados de este libro son: "+lib2.getPrestados());
                JOptionPane.showMessageDialog(null, "Los libros en el inventario son: "+lib2.getEjemplares());   

                break;

                case 3: 

                Libro3 lib3 = new Libro3("La historia del mundo", "John Fardon & Victoria Parker", 7, 0);
                lib3.mostrarLibro3();



                respuesta = JOptionPane.showInputDialog("Si de hacer un prestamo escriba si, si quiere hacer una devolucion escriba no");

                if (respuesta.equals("si")){  

                if(lib3.Prestamos()==true){

                    JOptionPane.showMessageDialog(null, "Se presto el libro: "+lib3.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "Ya no tenemos mas copias de: "+lib3.getTitulo());
            
                }

                }else{
            
                if(lib3.Devoluciones()){
            
                    JOptionPane.showMessageDialog(null, "Se devolvio el libro: "+lib3.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "No hay mas ejemplares de este libro");
            
                }
                         
                }
                JOptionPane.showMessageDialog(null, "Los libros prestados de este libro son: "+lib3.getPrestados());
                JOptionPane.showMessageDialog(null, "Los libros en el inventario son: "+lib3.getEjemplares());  

                break;

                case 4: 
                Libro4 lib4 = new Libro4("Dinosaurios", "John Long", 0, 9);
                lib4.mostrarLibro4();



                respuesta = JOptionPane.showInputDialog("Si de hacer un prestamo escriba si, si quiere hacer una devolucion escriba no");

                if (respuesta.equals("si")){  

                if(lib4.Prestamos()==true){

                    JOptionPane.showMessageDialog(null, "Se presto el libro: "+lib4.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "Ya no tenemos mas copias de: "+lib4.getTitulo());
            
                }

                }else{
            
                if(lib4.Devoluciones()){
            
                    JOptionPane.showMessageDialog(null, "Se devolvio el libro: "+lib4.getTitulo());
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "No hay mas ejemplares de este libro");
            
                }
                         
                }
                JOptionPane.showMessageDialog(null, "Los libros prestados de este libro son: "+lib4.getPrestados());
                JOptionPane.showMessageDialog(null, "Los libros en el inventario son: "+lib4.getEjemplares());  

                break;

            default:

                Libro5 lib5 = new Libro5("Eres una rata asquerosa, nunca en mi vida vi una persona tan horrible", "eres un pervertido asqueroso, sigue el camino de Jesucristo por favor", 69, 0);
                lib5.mostrarLibro5();
                JOptionPane.showMessageDialog(null,"Desde ese dia, a ese cliente ya no se le permito el paso a esa biblioteca");  

                break;
        }
    
    }

}