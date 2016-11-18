package smcs.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import smcs.swing.controller.MainWindowController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField minField;
	private JTextField maxField;
	private JTextField guessField;
	private MainWindowController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		controller = new MainWindowController();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		minField = new JTextField();
		minField.setBounds(42, 6, 130, 26);
		frame.getContentPane().add(minField);
		minField.setColumns(10);
		
		maxField = new JTextField();
		maxField.setBounds(42, 44, 130, 26);
		frame.getContentPane().add(maxField);
		maxField.setColumns(10);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(6, 11, 34, 16);
		frame.getContentPane().add(lblMin);
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setBounds(6, 49, 61, 16);
		frame.getContentPane().add(lblMax);
		
		JButton btnChooseANumber = new JButton("Choose a Number");
		btnChooseANumber.addActionListener(controller);
		btnChooseANumber.setBounds(16, 82, 156, 56);
		frame.getContentPane().add(btnChooseANumber);
		
		JLabel lblFeedback = new JLabel("Feedback");
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setFont(new Font("Marker Felt", Font.BOLD, 24));
		lblFeedback.setBounds(184, 11, 260, 75);
		frame.getContentPane().add(lblFeedback);
		
		guessField = new JTextField();
		guessField.setBounds(252, 138, 130, 26);
		frame.getContentPane().add(guessField);
		guessField.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(controller);
		btnGuess.setBounds(262, 176, 117, 29);
		frame.getContentPane().add(btnGuess);
	}
}
