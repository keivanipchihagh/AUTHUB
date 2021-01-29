package gui.graphics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonFont {
	private JButton button = new JButton("Click me!");
	private JFrame frame = new JFrame();
	
	public ButtonFont() {
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setFont(new Font("Dialog", Font.BOLD, 50));
		button.setText("Click again!");
		frame.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button.setFont(new Font("Dialog", Font.BOLD, button.getFont().getSize()-1));
			}
		});
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonFont();
	}
}











//button.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		button.setFont(new Font("Dialog", Font.BOLD, button.getFont().getSize() - 1));
//		
//	}
//});


