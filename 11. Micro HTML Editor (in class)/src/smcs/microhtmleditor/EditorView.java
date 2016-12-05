package smcs.microhtmleditor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.SpringLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditorView extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmOpen, mntmSave;
	private JEditorPane editorPane, previewPane;

	/**
	 * Create the frame.
	 */
	public EditorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmOpen = new JMenuItem("Open…");
		mnFile.add(mntmOpen);
		
		mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		sl_contentPane.putConstraint(SpringLayout.NORTH, splitPane, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, splitPane, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, splitPane, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, splitPane, 0, SpringLayout.EAST, contentPane);
		contentPane.add(splitPane);
		
		JScrollPane scrollPaneLeft = new JScrollPane();
		splitPane.setLeftComponent(scrollPaneLeft);
		
		editorPane = new JEditorPane();
		scrollPaneLeft.setViewportView(editorPane);
		
		JScrollPane scrollPaneRight = new JScrollPane();
		splitPane.setRightComponent(scrollPaneRight);
		
		previewPane = new JEditorPane();
		previewPane.setEditable(false);
		scrollPaneRight.setViewportView(previewPane);
		previewPane.setEditorKit(new HTMLEditorKit());
	}
	
	public void registerOpenMenuHandler(EditorController controller) {
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.open();
			}
		});
	}
	
	public void registerSaveMenuHandler(EditorController controller) {
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.save();
			}
		});
	}

	public void setEditorDocument(Document d) {
		editorPane.setDocument(d);
		editorPane.getDocument().addDocumentListener(new PreviewSync(previewPane));
	}
}
