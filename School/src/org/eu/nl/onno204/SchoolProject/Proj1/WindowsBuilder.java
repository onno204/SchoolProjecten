package org.eu.nl.onno204.SchoolProject.Proj1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WindowsBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowsBuilder window = new WindowsBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowsBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.GREEN);
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel QuestionLabel = new JLabel("Is java Awesom?");
		QuestionLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		QuestionLabel.setBounds(20, 11, 494, 79);
		layeredPane.add(QuestionLabel);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				WindowsBuilder window = new WindowsBuilder();
				window.frame.setLocation(frame.getLocation());;
				window.frame.setVisible(true);
			}
		});
		ResetButton.setForeground(new Color(255, 255, 255));
		ResetButton.setBackground(new Color(0, 51, 153));
		ResetButton.setBounds(20, 87, 494, 73);
		layeredPane.add(ResetButton);
		ResetButton.hide();
		
		JButton YesButton = new JButton("Yes");
		JButton NoButton = new JButton("No");
		
		YesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				QuestionLabel.setText("You'r right! Java is cool!");
				NoButton.hide();
				YesButton.hide();
				ResetButton.show();
			}
		});
		YesButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		YesButton.setBackground(new Color(0, 102, 0));
		YesButton.setForeground(Color.WHITE);
		YesButton.setBounds(30, 87, 152, 73);
		layeredPane.add(YesButton);
		
		
		NoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				QuestionLabel.setText("Java is way cooler than u!");
				NoButton.hide();
				YesButton.hide();
				ResetButton.show();
			}
		});
		NoButton.setForeground(Color.WHITE);
		NoButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		NoButton.setBackground(new Color(204, 0, 0));
		NoButton.setBounds(362, 87, 152, 73);
		layeredPane.add(NoButton);
		
	}
}
