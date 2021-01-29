package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    JFrame calcFrame;


    public CalculatorGUI(){
        calcFrame = new JFrame();
        calcFrame.setTitle("CalculatorGUI");
        calcFrame.setSize(600, 370);
        calcFrame.setLocation(100 , 200);
        calcFrame.setLayout(null);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tb = new JTabbedPane();
        tb.setBounds(0,0,600,500);
        JPanel j = new JPanel();
        createNormal(j);
        tb.add("normal", j);
        j = new JPanel();
        createAdvanced(j);
        tb.add("advanced", j);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            //...
        }

        calcFrame.setVisible(true);
        calcFrame.add(tb);
    }

    void createNormal(JPanel calcFrame){
        JPanel cal = new JPanel();
        cal.setLayout(new GridLayout(2 , 1));
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(5 , 4 , 5 , 5));

        JTextArea display = new JTextArea();
        display.setEditable(false);
        display.setSize(new Dimension(400 , 70));
        cal.add(display);


        JButton ac = new JButton();
        JButton btn = new JButton();
        JButton percent = new JButton();
        JButton divide = new JButton();
        JButton equal = new JButton();
        JButton multiplication = new JButton();
        JButton minus = new JButton();
        JButton sum = new JButton();
        JButton zero = new JButton();
        JButton dot = new JButton();

        ac.setText("AC");
        keyboardPanel.add(ac);
        btn.setText("+/-");
        keyboardPanel.add(btn);
        percent.setText("%");
        keyboardPanel.add(percent);
        divide.setText("/");
        keyboardPanel.add(divide);


        for (int i = 3 ; i > 0 ; i--){
            JButton b = new JButton();
            b.setText("" + (i + 6));
            keyboardPanel.add(b);
        }

        multiplication.setText("X");
        keyboardPanel.add(multiplication);

        for (int i = 3 ; i > 0 ; i--){
            JButton b = new JButton();
            b.setText("" + (i + 3));
            keyboardPanel.add(b);
        }

        minus.setText("-");
        keyboardPanel.add(minus);

        for (int i = 3 ; i > 0 ; i--){
            JButton b = new JButton();
            b.setText("" + i);
            keyboardPanel.add(b);
        }

        sum.setText("+");
        keyboardPanel.add(sum);
        zero.setText("0");
        keyboardPanel.add(zero);
        JButton empty = new JButton();
        empty.setText("");
        keyboardPanel.add(empty);
        dot.setText(".");
        keyboardPanel.add(dot);
        equal.setText("=");
        keyboardPanel.add(equal);
        cal.add(keyboardPanel);

        calcFrame.add(cal);
    }

    void createAdvanced(JPanel calcFrame){
        JPanel cal = new JPanel();
        cal.setLayout(new GridLayout(2 , 1));
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(5 , 6 , 5 , 5));

        JTextArea display = new JTextArea();
        display.setEditable(false);
        display.setSize(new Dimension(400 , 70));
        cal.add(display);


        JButton ac = new JButton();
        JButton btn = new JButton();
        JButton percent = new JButton();
        JButton divide = new JButton();
        JButton equal = new JButton();
        JButton multiplication = new JButton();
        JButton minus = new JButton();
        JButton sum = new JButton();
        JButton zero = new JButton();
        JButton dot = new JButton();
        JButton sin = new JButton();
        JButton cos = new JButton();
        JButton pi = new JButton();
        JButton e = new JButton();
        JButton ePowX = new JButton();
        JButton log = new JButton();
        JButton shift = new JButton();
        JButton rand = new JButton();
        JButton left = new JButton();
        JButton right = new JButton();

        pi.setText("PI");
        keyboardPanel.add(pi);
        sin.setText("sin");
        keyboardPanel.add(sin);
        ac.setText("AC");
        keyboardPanel.add(ac);
        btn.setText("+/-");
        keyboardPanel.add(btn);
        percent.setText("%");
        keyboardPanel.add(percent);
        divide.setText("/");
        keyboardPanel.add(divide);
        e.setText("e");
        keyboardPanel.add(e);
        cos.setText("cos");
        keyboardPanel.add(cos);


        for (int i = 3 ; i > 0 ; i--){
            JButton b = new JButton();
            b.setText("" + (i + 6));
            keyboardPanel.add(b);
        }

        multiplication.setText("X");
        keyboardPanel.add(multiplication);
        left.setText("(");
        keyboardPanel.add(left);
        ePowX.setText("pow(e , x)");
        keyboardPanel.add(ePowX);

        for (int i = 3 ; i > 0 ; i--){
            JButton b = new JButton();
            b.setText("" + (i + 3));
            keyboardPanel.add(b);
        }

        minus.setText("-");
        keyboardPanel.add(minus);
        right.setText(")");
        keyboardPanel.add(right);
        log.setText("log");
        keyboardPanel.add(log);

        for (int i = 3 ; i > 0 ; i--){
            JButton b = new JButton();
            b.setText("" + i);
            keyboardPanel.add(b);
        }

        sum.setText("+");
        keyboardPanel.add(sum);

        shift.setText("shift");
        keyboardPanel.add(shift);
        shift.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (sin.getText().equals("sin"))
                    sin.setText("tan");
                else if (sin.getText().equals("tan"))
                    sin.setText("sin");

                if (cos.getText().equals("cos"))
                    cos.setText("cot");
                else if (cos.getText().equals("cot"))
                    cos.setText("cos");
            }
        });

        rand.setText("rand");
        keyboardPanel.add(rand);
        zero.setText("0");
        keyboardPanel.add(zero);
        JButton empty = new JButton();
        empty.setText("");
        keyboardPanel.add(empty);
        dot.setText(".");
        keyboardPanel.add(dot);
        equal.setText("=");
        keyboardPanel.add(equal);
        cal.add(keyboardPanel);



        calcFrame.add(cal);
    }
}
