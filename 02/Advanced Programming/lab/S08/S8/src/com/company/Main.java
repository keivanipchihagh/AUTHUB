package com.company;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(700,700);
        frame.setLocation(200 , 100);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = frame.getContentPane();
        JTabbedPane tb = new JTabbedPane();
        tb.add(new SciCal() , "scientific");
        tb.add(new SimpleCal() , "simple");
        contentPane.add(tb);
        frame.setVisible(true);
    }
}

class SimpleCal extends JPanel implements ActionListener {
    private JTextField display = new JTextField("0");
    private double result = 0;
    private String operator = "=";
    private boolean calculating = true;

    public SimpleCal() {
        setLayout(new BorderLayout());
        //setEditable false user cant edit display field
        display.setEditable(false);
        display.setPreferredSize(new Dimension(70,70));
        add(display, "North");
        Font bigFont = display.getFont().deriveFont(Font.PLAIN, 25f);
        display.setFont(bigFont);
        //setting JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        //labeling of buttons
        String buttonLabels = "789/456*123-0.=+";
        for (int i = 0; i < buttonLabels.length(); i++) {
            JButton b = new JButton(buttonLabels.substring(i, i + 1));
            b.setFont(bigFont);
            panel.add(b);
            b.addActionListener(this);
        }
        add(panel, "Center");
    }

    public void actionPerformed(ActionEvent evt) {
        String cmd = evt.getActionCommand();
        if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals(".")) {
            if (calculating)
                display.setText(cmd);
            else
                display.setText(display.getText() + cmd);
            calculating = false;
        } else {
            if (calculating) {
                if (cmd.equals("-")) {
                    display.setText(cmd);
                    calculating = false;
                } else
                    operator = cmd;
            } else {
                double x = Double.parseDouble(display.getText());
                calculate(x);
                operator = cmd;
                calculating = true;
            }
        }
    }

    private void calculate(double n) {
        switch (operator) {
            case "+":
                result += n;
                break;
            case "-":
                result -= n;
                break;
            case "*":
                result *= n;
                break;
            case "/":
                result /= n;
                break;
            case "=":
                result = n;
                break;
        }
        display.setText("" + result);
    }
}

class SciCal extends JPanel implements ActionListener{
    private JTextField display = new JTextField("0");
    private double result = 0;
    private String operator = "=";
    private boolean calculating = true;
    private JButton sin = new JButton("SIN");
    private JButton cos = new JButton("COS");

    public SciCal() {
        setLayout(new BorderLayout());
        //display editable false
        display.setEditable(false);
        display.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                display.setToolTipText("This is not a tool tip Im actually bored-.-");
            }
        });
        display.setPreferredSize(new Dimension(70,100));
        add(display, "North");
        Font bigFont = display.getFont().deriveFont(Font.PLAIN, 25f);
        display.setFont(bigFont);
        //setting JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,6));
        //labeling of buttons
        String buttonLabels = "789/456*123-0.=+";
        String[] sciBtnL = {"SIN" , "PI" , "ln" , "SHIFT"};
        String[] sciBtnR = {"COS" , "e" , "sqrt" ,  "x^2"};
        sin.setFont(bigFont); cos.setFont(bigFont);
        sin.addActionListener(this); cos.addActionListener(this);
        panel.add(sin); panel.add(cos);
        for (int i = 0; i < 4; i++) {
            JButton b;
            if (i >= 1) {
                b = new JButton(sciBtnL[i]);
                b.setFont(bigFont);
                panel.add(b);
                if (!b.getText().equals(""))
                    b.addActionListener(this);
                b = new JButton(sciBtnR[i]);
                b.setFont(bigFont);
                panel.add(b);
                if (!b.getText().equals(""))
                    b.addActionListener(this);
            }
            for (int j = i * 4 ; j < i * 4 + 4 ; j++) {
                b = new JButton(buttonLabels.substring(j, j + 1));
                b.setFont(bigFont);
                panel.add(b);
                b.addActionListener(this);
            }
        }
        add(panel , "Center");
        //exit and ctrl + c
        JPanel e = new JPanel();
        e.setPreferredSize(new Dimension(700 , 40));
        JButton exit = new JButton("EXIT");
        exit.setPreferredSize(new Dimension(300 , 40));
        exit.addActionListener(actionEvent -> System.exit(0));
        exit.setFont(bigFont);
        JButton save = new JButton("SAVE");
        save.addActionListener(actionEvent -> {
            String ctc = display.getText();
            StringSelection stringSelection = new StringSelection(ctc);
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        });
        save.setFont(bigFont);
        save.setPreferredSize(new Dimension(300 , 40));
        e.add(exit); e.add(save);

        add(e , BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String cmd = evt.getActionCommand();
        if (cmd.equals("SHIFT")) {
                if (sin.getText().equals("SIN")) {
                    sin.setText("TAN");
                    cos.setText("COT");
                } else {
                    sin.setText("SIN");
                    cos.setText("COS");
                }
        }

        if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals(".")) {
            if (calculating)
                display.setText(cmd);
            else
                display.setText(display.getText() + cmd);
            calculating = false;
        } else if(cmd.equals("PI")) {
            if (calculating)
                display.setText("" + Math.PI);
            else
                display.setText(display.getText() + Math.PI);
            calculating = false;
        } else if(cmd.equals("e")) {
            if (calculating)
                display.setText("" + Math.exp(1));
            else
                display.setText(display.getText() + Math.exp(1));
            calculating = false;
        } else if (cmd.equals("SIN")) {
            display.setText("" + Math.sin(Double.parseDouble(display.getText())));
            calculating = false;
        } else if (cmd.equals("COS")) {
            display.setText("" + Math.cos(Double.parseDouble(display.getText())));
            calculating = false;
        } else if (cmd.equals("TAN")) {
            display.setText("" + Math.tan(Double.parseDouble(display.getText())));
            calculating = false;
        } else if (cmd.equals("COT")) {
            display.setText("" + 1 / Math.tan(Double.parseDouble(display.getText())));
            calculating = false;
        } else if (cmd.equals("ln")) {
            display.setText("" + Math.log(Double.parseDouble(display.getText())));
            calculating = false;
        } else if (cmd.equals("sqrt")) {
            display.setText("" + Math.sqrt(Double.parseDouble(display.getText())));
            calculating = false;
        } else if (cmd.equals("x^2")) {
            double a = Double.parseDouble(display.getText());
            display.setText("" + a*a);
            calculating = false;
        } else {
            if (calculating) {
                if (cmd.equals("-")) {
                    display.setText(cmd);
                    calculating = false;
                } else
                    operator = cmd;
            } else {
                double x = Double.parseDouble(display.getText());
                calculate(x);
                operator = cmd;
                calculating = true;
            }
        }
    }

    private void calculate(double n) {
        switch (operator) {
            case "+":
                result += n;
                break;
            case "-":
                result -= n;
                break;
            case "*":
                result *= n;
                break;
            case "/":
                result /= n;
                break;
            case "=":
                result = n;
                break;
        }
        display.setText("" + result);
    }
}