package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginFormLM {

    private JFrame frame;

    public LoginFormLM(String title) {
        frame = new JFrame(title);
        frame.setSize(250, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JPanel pane = (JPanel) frame.getContentPane();
//        pane.setLayout(new GridLayout(3, 1, 5, 5));
//        pane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        JPanel panel = new JPanel(new GridLayout(3, 1, 5, 5));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(panel);
        //https://stackoverflow.com/questions/35821071/learning-guis-setcontentpane-method
        
        JTextField unameField = new JTextField("Enter username ...");

        JPasswordField psswdField = new JPasswordField();

        JButton loginButton = new JButton(" Login ");

        panel.add(unameField);
        panel.add(psswdField);
        panel.add(loginButton);
        
//        frame.add(unameField);
//        frame.add(psswdField);
//        frame.add(loginButton);
    }

    public void showGUI() {
        frame.setVisible(true);
    }
}
