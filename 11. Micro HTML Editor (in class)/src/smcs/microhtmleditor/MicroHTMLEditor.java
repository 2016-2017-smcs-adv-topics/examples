package smcs.microhtmleditor;

import java.awt.EventQueue;

public class MicroHTMLEditor {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocumentManager documentManager = new DocumentManager();
					EditorView editorView = new EditorView();
					UserInterface userInterface = new UserInterface(documentManager, editorView);
					editorView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
