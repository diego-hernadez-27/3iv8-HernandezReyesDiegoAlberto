package buscaminas;

//import java.util.*;
import javax.swing.JOptionPane;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;

public class CRUD extends javax.swing.JFrame implements Serializable{
    
    public String NombreJugador, ContrasenaJugador;
    public int EdadJugador, PuntosJugador = 0, IdJugador, numJugadores;
    int Puntostmp=0;
    //ControladorJugador control = new ControladorJugador();
    
    public ArrayList<Jugador> listaJugadores;
    
    protected ArchivoC objarchivo = new ArchivoC();
          
    public CRUD() {
        listaJugadores = new ArrayList<Jugador>();
        listaJugadores = objarchivo.leer();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/buscaminas-logo.png"));
        return retValue;
    }
    
    
    public void obtenerInformacion(){
        Tablero tab = new Tablero();
        PuntosJugador = tab.puntitos;
        AgregarlosPuntos();
    }
    
    public void AgregarlosPuntos(){
        int posBuscarj = 0;
        Tablero tab = new Tablero();
        String jugadoringresado = tab.Elnom;
        
        posBuscarj = traePosicion(jugadoringresado);
        int Nuevosp = PuntosJugador;
        listaJugadores.get(posBuscarj).setPuntos(Nuevosp);
    }
    /*public String datosBuscar(String jugadorxd){
            String JugadorABuscar = tJugador.getText();
            jugadorxd = JugadorABuscar;
            return JugadorABuscar;
    }*/
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tJugador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tContrasena = new javax.swing.JPasswordField();
        bAgregar = new javax.swing.JButton();
        bCambiar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bTOP = new javax.swing.JButton();
        bJugar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tEdad = new javax.swing.JTextField();
        bMostrar = new javax.swing.JButton();
        bGrabar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Nombre del nuevo jugador");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        tJugador.setBackground(new java.awt.Color(204, 204, 255));
        tJugador.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tJugador.setForeground(new java.awt.Color(51, 102, 255));
        tJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(tJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 310, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Contraseña del jugador");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        tContrasena.setBackground(new java.awt.Color(204, 204, 255));
        tContrasena.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tContrasena.setForeground(new java.awt.Color(0, 51, 255));
        tContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(tContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 50));

        bAgregar.setBackground(new java.awt.Color(46, 203, 224));
        bAgregar.setText("Agregar Jugador");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(bAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, 50));

        bCambiar.setBackground(new java.awt.Color(51, 255, 255));
        bCambiar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bCambiar.setText("Cambiar Datos");
        bCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(bCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 120, 50));

        bEliminar.setBackground(new java.awt.Color(50, 199, 223));
        bEliminar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bEliminar.setText("Eliminar Jugador");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 110, 50));

        bTOP.setBackground(new java.awt.Color(0, 255, 255));
        bTOP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bTOP.setText("Jugadores");
        bTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTOPActionPerformed(evt);
            }
        });
        getContentPane().add(bTOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 110, 50));

        bJugar.setBackground(new java.awt.Color(0, 255, 255));
        bJugar.setText("Jugar");
        bJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJugarActionPerformed(evt);
            }
        });
        getContentPane().add(bJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 110, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Edad del jugador");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        tEdad.setBackground(new java.awt.Color(204, 204, 255));
        tEdad.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tEdad.setForeground(new java.awt.Color(51, 0, 153));
        tEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEdadActionPerformed(evt);
            }
        });
        getContentPane().add(tEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 310, 50));

        bMostrar.setBackground(new java.awt.Color(51, 255, 255));
        bMostrar.setText("Mostrar Jugador");
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(bMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, 50));

        bGrabar.setText("Grabar");
        bGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(bGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(216, 249, 69));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/water-heater-explosion.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 690, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJugadorActionPerformed

    private void tContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tContrasenaActionPerformed

    
            
    
    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
      
        NombreJugador = tJugador.getText();

        EdadJugador = Integer.parseInt(tEdad.getText());
        
        ContrasenaJugador = tContrasena.getText();
        
        Jugador jugadorNuevo = new Jugador(NombreJugador, EdadJugador, ContrasenaJugador,PuntosJugador);
        
        numJugadores++;
        
        if(numJugadores > 10){
            JOptionPane.showMessageDialog(null,"Se ha exedido el limita maximo de jugadores.");
        }else{
            listaJugadores.add(jugadorNuevo);
        
            JOptionPane.showMessageDialog(null,"El registro se ha realizado con exito");
            
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    protected int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        for(int i = 0; i < listaJugadores.size(); i++){
            if(nombreBuscar.equals(listaJugadores.get(i).getNombre())){
                pos = i;
                existe = true;
            }
        }    
        if(!existe){
            JOptionPane.showMessageDialog(null, "No existen registros de este jugador");
            pos = -1;
        }
        return pos;
    }
    
    public void eliminarJugador(Jugador eliminar){
        listaJugadores.remove(eliminar);
    }
    
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed

        if(listaJugadores.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay jugadores registrados");
        }else{
        String jueliminar = tJugador.getText();
        
        int posBorrar = traePosicion(jueliminar);
        
        listaJugadores.remove(posBorrar);
        
        numJugadores--;
        
        JOptionPane.showMessageDialog(null,"El registro se ha eliminado con exito");
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarActionPerformed
        int posModificar = 0;
        
        String jugadoringresado = tJugador.getText();
        
        posModificar = traePosicion(jugadoringresado);
        
        if(posModificar <= 0);
        
        JOptionPane.showMessageDialog(null, "La informacion de esta persona era... "
                                        +"\n Nombre: "+listaJugadores.get(posModificar).getNombre()
                                        +"\n Edad: "+listaJugadores.get(posModificar).getEdad()
                                        +"\nEspere a que se termine de guardar "
                                                + "\nla nueva informacion...");
        
 
        int nuevaEdad = Integer.parseInt(tEdad.getText());
        String nuevaContrasena = tContrasena.getText();
        
        listaJugadores.get(posModificar).setEdad(Integer.parseInt(tEdad.getText()));
        listaJugadores.get(posModificar).setContrasena(tContrasena.getText());

        JOptionPane.showMessageDialog(null, "El cambio se ha realizado con exito... ");

    }//GEN-LAST:event_bCambiarActionPerformed

    private void bTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTOPActionPerformed
        Collections.sort(listaJugadores);
        
        for(Jugador elemento: listaJugadores){
            JOptionPane.showMessageDialog(null, elemento);
        }
        
        /*if(listaJugadores.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay jugadores registrados");
        }else{
            System.out.println("Los libros son:\n");
            //debemos recorrer el arreglo
            for(int i = 0; i<listaJugadores.size(); i++){
                JOptionPane.showMessageDialog(null, "La informacion de esta persona era... "
                                        +"\n Nombre: "+listaJugadores.get(i).getNombre()
                                        +"\n Edad: "+listaJugadores.get(i).getEdad()
                                        +"\n Edad: "+listaJugadores.get(i).getPuntos());
            }
            
        }*/
    }//GEN-LAST:event_bTOPActionPerformed

    private void tEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEdadActionPerformed
    
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;
        
        nombreBusca = tJugador.getText();
        
        posBuscando = traePosicion(nombreBusca);
        
        JOptionPane.showMessageDialog(null, "La informacion de esta persona es: "
                                        +"\n Nombre: "+listaJugadores.get(posBuscando).getNombre()
                                        +"\n Edad: "+listaJugadores.get(posBuscando).getEdad()
                                        +"\n Puntos: "+listaJugadores.get(posBuscando).getPuntos());
        return posBuscando;
    }
            
            
    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed
        buscar();
    }//GEN-LAST:event_bMostrarActionPerformed

        public static String hola = "";
        public static int hola2 = 0;
    
    private void bJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJugarActionPerformed
        int posBuscar = 0;
        String jugadoringresado = tJugador.getText();
        String contrasenaing = tContrasena.getText();
        
        posBuscar = traePosicion(jugadoringresado);
        
        if(contrasenaing.equals(listaJugadores.get(posBuscar).getContrasena())){
            
        hola = listaJugadores.get(posBuscar).getNombre();
        hola2 = listaJugadores.get(posBuscar).getPuntos();
        
        Tablero con = new Tablero();
        con.setVisible(true);
        this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
        }
        
    }//GEN-LAST:event_bJugarActionPerformed

    private void bGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGrabarActionPerformed
        grabar();
        JOptionPane.showMessageDialog(null, "Se ha grabado con exito");
    }//GEN-LAST:event_bGrabarActionPerformed

    public ArrayList<Jugador> getListaJugadores(){
        return listaJugadores;
    }
    
    public void setListalibros(ArrayList<Jugador> listañibros){
        this.listaJugadores = listaJugadores;
    }
    
    public ArchivoC getObjarchivo(){
        return objarchivo;
    }
    
   public void setObjarchivo(ArchivoC objarchivo){
       this.objarchivo = objarchivo;
   }
   
   public void grabar(){
       getObjarchivo().serializar(listaJugadores);
   }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bAgregar;
    public javax.swing.JButton bCambiar;
    public javax.swing.JButton bEliminar;
    private javax.swing.JButton bGrabar;
    public javax.swing.JButton bJugar;
    private javax.swing.JButton bMostrar;
    private javax.swing.JButton bTOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPasswordField tContrasena;
    public javax.swing.JTextField tEdad;
    public javax.swing.JTextField tJugador;
    // End of variables declaration//GEN-END:variables
}
