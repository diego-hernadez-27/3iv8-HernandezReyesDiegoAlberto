/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswing;

import java.awt.PopupMenu;
import javax.swing.*;

/**
 *
 * @author 25666
 */
import javax.swing.*;
public class EjemploSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("Ejemplo Ventanita");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);

    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario");

        userLabel.setBounds(10, 10, 80, 25);

        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel userpasslabel = new JLabel("Password");

        userpasslabel.setBounds(10, 40, 80, 25);

        panel.add(userpasslabel);

        JTextField userpassText = new JTextField(20);
        userpassText.setBounds(100, 40, 160, 25);
        panel.add(userpassText);

        JButton loginbutton = new JButton("Inicia sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);

        JButton registrobutton = new JButton("Registrate");
        registrobutton.setBounds(180, 80, 100, 20);
        panel.add(registrobutton);

    }

}