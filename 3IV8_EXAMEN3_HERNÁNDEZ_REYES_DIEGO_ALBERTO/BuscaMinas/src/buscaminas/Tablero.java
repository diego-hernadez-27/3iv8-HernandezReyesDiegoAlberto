package buscaminas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Tablero extends javax.swing.JFrame {

    int Filas = 10;
    int Columnas = 10;
    int LasMinas = 10;
    int Puntos = 0;
    boolean Presionar = true, Ganador = false;
 
    JButton[][] botonesTablero;
    
    BuscaMinas tableroBuscaminas;
    
    Jugador jugando2 = new Jugador();
    
    CRUD con = new CRUD();
    

    
    
    public Tablero() {
        initComponents();
        ReinicarPartida();
        this.setLocationRelativeTo(null);
        CRUD con = new CRUD();
        lbNombre.setText(con.hola);
        lbPuntos.setText(Integer.toString(con.hola2));
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/buscaminas-logo.png"));
        return retValue;
    }
    
    public void Puntuacion(){
        if(Ganador == true){
            lbPuntos.setText(Integer.toString(Integer.parseInt(lbPuntos.getText())+1));
        }else{}
    }
    
    void descargarControles(){
        if(botonesTablero != null){
            for(int i = 0; i < botonesTablero.length; i++){
                for(int j= 0; j < botonesTablero[i].length; j++){
                    if(botonesTablero[i][j] != null){
                        getContentPane().remove(botonesTablero[i][j]);
                    }
                }
            }
        }
    }
       
    private void ReinicarPartida(){
        Presionar = true;
        Ganador = false;
        descargarControles();
        cargarControles();
        crearTableroBuscaminas();
        repaint();
    }
     
    private void crearTableroBuscaminas(){
        tableroBuscaminas = new BuscaMinas(Filas, Columnas, LasMinas);
        tableroBuscaminas.setEventoPartidaLose(new Consumer<List<Casilla>>(){
            @Override
            public void accept(List<Casilla> t){
               for(Casilla casillaConMina: t){
                   botonesTablero[casillaConMina.getPosFila()][casillaConMina.getPosColumna()].setText("*");
               }
               Presionar = false;  
            }
        });
        tableroBuscaminas.setEventoPartidaWin(new Consumer<List<Casilla>>(){
            @Override
            public void accept(List<Casilla> t){
               for(Casilla casillaConMina: t){
                   botonesTablero[casillaConMina.getPosFila()][casillaConMina.getPosColumna()].setText("uwu");
               }
               Presionar = false;   
               Ganador = true;
                
               //AgregarPuntos();
            }
        });
        
        tableroBuscaminas.setEventoCasillaAbierta(new Consumer<Casilla>(){
            @Override
            public void accept(Casilla t){
                botonesTablero[t.getPosFila()][t.getPosColumna()].setEnabled(false);
                botonesTablero[t.getPosFila()][t.getPosColumna()].setText(t.getMinasAlrededor() == 0
                                                               ?"":t.getMinasAlrededor()+"");
            }          
        });
        //tableroBuscaminas.imprimirTablero();
    }
    
    
    private void cargarControles(){
        
        int posXReferencia = 25;
        int posYReferencia = 25;
        int anchoControl = 30;
        int altoControl = 30;
        
        botonesTablero = new JButton[Filas][Columnas];
        for(int i = 0; i < botonesTablero.length; i++){
            for(int j = 0; j < botonesTablero[i].length; j++){
                botonesTablero[i][j]=new JButton();
                botonesTablero[i][j].setName(i+","+j);
                botonesTablero[i][j].setBorder(null);
                if(i==0 && j==0){
                    botonesTablero[i][j].setBounds(posXReferencia, posYReferencia, anchoControl, altoControl);
                }else if(i==0 && j!=0){
                    botonesTablero[i][j].setBounds(botonesTablero[i][j-1].getX()+botonesTablero[i][j-1].getWidth(), 
                     posYReferencia, anchoControl, altoControl);
                }else{
                    botonesTablero[i][j].setBounds(botonesTablero[i-1][j].getX(), 
                    botonesTablero[i-1][j].getY()+botonesTablero[i-1][j].getHeight(), anchoControl, altoControl);
                }
                botonesTablero[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnClick(e);
                    }
                });
                getContentPane().add(botonesTablero[i][j]);
            }
        }this.setSize(botonesTablero[Filas-1][Columnas-1].getX()+botonesTablero[Filas-1][Columnas-1].getWidth()+45, 
                      botonesTablero[Filas-1][Columnas-1].getY()+botonesTablero[Filas-1][Columnas-1].getHeight()+110);
    }
    
    private void btnClick(ActionEvent e) {
        if(Presionar == true){
        JButton btn = (JButton)e.getSource();
        String[] coordenada = btn.getName().split(",");
        int posFila = Integer.parseInt(coordenada[0]);
        int posColumna = Integer.parseInt(coordenada[1]);
        tableroBuscaminas.seleccionarCasilla(posFila, posColumna);
        }else{}
        Puntuacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPuntos = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miMinas = new javax.swing.JMenuItem();
        miCsillas = new javax.swing.JMenuItem();
        miReiniciar = new javax.swing.JMenuItem();
        miRegresar = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Puntos del jugador: ");

        lbPuntos.setText("0");

        jMenu1.setText("Ajustes");

        miMinas.setText("Numero de minas");
        miMinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMinasActionPerformed(evt);
            }
        });
        jMenu1.add(miMinas);

        miCsillas.setText("Numero de casillas");
        miCsillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCsillasActionPerformed(evt);
            }
        });
        jMenu1.add(miCsillas);

        miReiniciar.setText("Reiniciar partida");
        miReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReiniciarActionPerformed(evt);
            }
        });
        jMenu1.add(miReiniciar);

        jMenuBar1.add(jMenu1);

        miRegresar.setText("Juego");

        jMenuItem4.setText("Regresar al menu");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        miRegresar.add(jMenuItem4);

        jMenuBar1.add(miRegresar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNombre)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miMinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMinasActionPerformed
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de minas"));
        this.LasMinas = nro;
        ReinicarPartida();
    }//GEN-LAST:event_miMinasActionPerformed

    private void miCsillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCsillasActionPerformed
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de casillas, N x N"));
        this.Filas = nro;
        this.Columnas = nro;
        ReinicarPartida();
    }//GEN-LAST:event_miCsillasActionPerformed

    private void miReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReiniciarActionPerformed
        ReinicarPartida();
    }//GEN-LAST:event_miReiniciarActionPerformed

    protected static int puntitos = 0;
    protected static String Elnom = "";
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        puntitos = Integer.parseInt(lbPuntos.getText());
        Elnom = lbNombre.getText();

        CRUD con = new CRUD();
        con.obtenerInformacion();;
        con.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPuntos;
    private javax.swing.JMenuItem miCsillas;
    private javax.swing.JMenuItem miMinas;
    private javax.swing.JMenu miRegresar;
    private javax.swing.JMenuItem miReiniciar;
    // End of variables declaration//GEN-END:variables
}
