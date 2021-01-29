package gui;

import javax.swing.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException,
			InstantiationException, IllegalAccessException {

//		for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//			System.out.println(info.getClassName());
//		}
//		System.out.println("System: " + UIManager.getSystemLookAndFeelClassName());
//		System.out.println("Current: " + UIManager.getLookAndFeel().getClass().getName());
////		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//		System.out.println("Current:" + UIManager.getLookAndFeel().getClass().getName());
//		// obtain user input from JOptionPane input dialogs
//		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
//		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
//		int number1 = Integer.parseInt(firstNumber);
//		int number2 = Integer.parseInt(secondNumber);
//		int sum = number1 + number2;
		// display result in a JOptionPane message dialog
//		JOptionPane.showMessageDialog(null, "Be careful", "Error!", JOptionPane.QUESTION_MESSAGE);
//		int response = JOptionPane.showConfirmDialog(null, "Do you agree?", "Please select", JOptionPane.YES_NO_CANCEL_OPTION);
//		System.out.println(response);

//		BorderLayoutFrame borderLayoutExample = new BorderLayoutFrame();
//		borderLayoutExample.setVisible(true);
		
//		 LoginForm form = new LoginForm("Login");
//		 form.showGUI();

//		 LoginFormLM form2 = new LoginFormLM("Login (2)");
//		 form2.showGUI();
		//
//		 LoginFormMultiLM form3 = new LoginFormMultiLM("Login (3)");
//		 form3.showGUI();
		//
		
//		 LoginFormWithEventHandlingSimple login = new LoginFormWithEventHandlingSimple("MyLogin");
//		 login.showGUI();
		 
		 // with FocusListener
		 LoginFormWithEventHandling login2 = new LoginFormWithEventHandling("MyLogin");
		 login2.showGUI();
	}

}
