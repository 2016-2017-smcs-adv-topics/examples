package smcs.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import smcs.swing.controller.MainWindowController;
import smcs.swing.model.NumberGuesser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private NumberGuesser model;
	private JFrame view;
	private MainWindowController controller;
	private JTextField minField;
	private JTextField maxField;
	private JTextField guessField;
	private JLabel lblFeedback;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.view.setVisible(true);
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
		model = new NumberGuesser();
		view = new JFrame();
		controller = new MainWindowController(model, this);

		view.setBounds(100, 100, 450, 300);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.getContentPane().setLayout(null);

		minField = new JTextField();
		minField.setText(String.valueOf(NumberGuesser.DEFAULT_LOW));
		minField.setBounds(42, 6, 130, 26);
		view.getContentPane().add(minField);
		minField.setColumns(10);

		maxField = new JTextField();
		maxField.setText(String.valueOf(NumberGuesser.DEFAULT_HIGH));
		maxField.setBounds(42, 44, 130, 26);
		view.getContentPane().add(maxField);
		maxField.setColumns(10);

		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(6, 11, 34, 16);
		view.getContentPane().add(lblMin);

		JLabel lblMax = new JLabel("Max");
		lblMax.setBounds(6, 49, 61, 16);
		view.getContentPane().add(lblMax);

		JButton btnChooseANumber = new JButton("Choose a Number");
		btnChooseANumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.chooseNumberClicked(e);
			}
		});
		btnChooseANumber.setBounds(16, 82, 156, 56);
		view.getContentPane().add(btnChooseANumber);

		lblFeedback = new JLabel();
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setFont(new Font("Marker Felt", Font.BOLD, 24));
		lblFeedback.setBounds(184, 11, 260, 75);
		view.getContentPane().add(lblFeedback);

		guessField = new JTextField();
		guessField.setBounds(252, 138, 130, 26);
		view.getContentPane().add(guessField);
		guessField.setColumns(10);

		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.guessClicked(e);
			}
		});
		btnGuess.setBounds(262, 176, 117, 29);
		view.getContentPane().add(btnGuess);
	}
	
	public int getMinField() {
		return Integer.valueOf(minField.getText());
	}
	
	public int getMaxField() {
		return Integer.valueOf(maxField.getText());
	}
	
	public int getGuessField() {
		return Integer.valueOf(guessField.getText());
	}
	
	public void setFeedback(String s) {
		lblFeedback.setText(s);
	}
}
