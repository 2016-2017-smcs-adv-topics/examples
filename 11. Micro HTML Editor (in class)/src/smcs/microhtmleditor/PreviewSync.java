package smcs.microhtmleditor;

import javax.swing.JEditorPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class PreviewSync implements DocumentListener{

	private JEditorPane preview;
	
	public PreviewSync(JEditorPane e) {
		preview = e;
	}

	private void syncToPreviewPane(Document d) {
		try {
			preview.setText(d.getText(0, d.getLength()));
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		syncToPreviewPane(e.getDocument());
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		syncToPreviewPane(e.getDocument());
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		syncToPreviewPane(e.getDocument());
	}

}
