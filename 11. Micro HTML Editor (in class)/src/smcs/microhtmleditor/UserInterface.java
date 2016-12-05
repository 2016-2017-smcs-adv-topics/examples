package smcs.microhtmleditor;

public class UserInterface implements EditorController{
	private DocumentManager documentManager;
	private EditorView editorView;
	
	public UserInterface(DocumentManager dm, EditorView ev) {
		documentManager = dm;
		editorView = ev;
		editorView.registerOpenMenuHandler(this);
		editorView.registerSaveMenuHandler(this);
		editorView.setEditorDocument(documentManager.getDocument());
	}

	public void open() {
		System.out.println("Open");
	}
	
	public void save() {
		System.out.println("Save");
		
	}
}
