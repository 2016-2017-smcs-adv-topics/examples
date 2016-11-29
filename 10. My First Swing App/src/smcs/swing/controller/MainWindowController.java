package smcs.swing.controller;

import java.awt.event.ActionEvent;

import smcs.swing.model.NumberGuesser;
import smcs.swing.view.MainWindow;

public class MainWindowController {

	private NumberGuesser model;
	private MainWindow view;
	
	public MainWindowController(NumberGuesser model, MainWindow view) {
		this.model = model;
		this.view = view;
	}

	public void chooseNumberClicked(ActionEvent e) {
		model.pickANumber(view.getMinField(), view.getMaxField());
	}

	public void guessClicked(ActionEvent e) {
		view.setFeedback(model.guess(view.getGuessField()));
	}

}
