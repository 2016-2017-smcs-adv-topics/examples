package smcs.microhtmleditor;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class DocumentManager {
	private Document document;
	private File file;
	
	public DocumentManager() {
		document = new PlainDocument();
	}
	
	/**
	 * Open a file in the document
	 * @param f The file to open
	 * @postcondition file refers to f
	 */
	public void open(File f) {
		/* TODO open file f and associate its contents with file and document */
	}
	
	/**
	 * Save contents of document into our current file
	 * @precondition file is a valid file (testable by fileReady())
	 * @throws IOException if no file ready to be saved to
	 */
	public void save() throws IOException {
		/* TODO save current document contents to file */
	}
	
	/**
	 * Test to see if there is a file ready to be saved to
	 * @return true if file is ready, false otherwise
	 */
	public boolean fileReady() {
		return false;
	}
	
	/**
	 * @return The document for this manager
	 */
	public Document getDocument() {
		return document;
	}
}
