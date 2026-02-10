package TopBrainsCollections;

import java.util.Stack;

public class AdvancedTextEditor {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor("Hello World ");
        editor.display();

        editor.performAction(new InsertAction("Insert" ," Java", 11));
        editor.display();

        editor.performAction(new DeleteAction("Delete",6, 5,"World"));
        editor.display();

        editor.performAction(new ReplaceAction("Replace",0,5,"Hi","Hello"));
        editor.display();

        System.out.println("\nUndo operations:");
        editor.undo();
        editor.display();

        editor.undo();
        editor.display();

        System.out.println("\nRedo operation:");
        editor.redo();
        editor.display();
	}

}
abstract class EditorAction{
    private String actionType;
    
    public EditorAction(String actionType) {
		super();
		this.actionType = actionType;
	}
	public abstract void execute(TextEditor editor);
    public abstract void undo(TextEditor editor);
}

class InsertAction extends EditorAction{

	private String text;
	private int position;
	

	public InsertAction(String actionType, String text, int position) {
		super(actionType);
		this.text = text;
		this.position = position;
	}

	@Override
	public void execute(TextEditor editor) {
		editor.insertText(text, position);
		
	}

	@Override
	public void undo(TextEditor editor) {
		editor.deleteText(position, text.length());
	}
	
}

class DeleteAction extends EditorAction{
	private int position;
	private int length;
	private String deletedText;
	public DeleteAction(String actionType, int position, int length, String deletedText) {
		super(actionType);
		this.position = position;
		this.length = length;
		this.deletedText = deletedText;
	}

	@Override
	public void execute(TextEditor editor) {
		deletedText=editor.getContent().substring(position,position+length);
		editor.deleteText(position, length);
	}

	@Override
	public void undo(TextEditor editor) {
		editor.insertText(deletedText, position);
	}
	
}
class ReplaceAction extends EditorAction{
	private int position;
	private int length;
	private String newText;
	private String oldText;
	
	

	public ReplaceAction(String actionType, int position, int length, String newText, String oldText) {
		super(actionType);
		this.position = position;
		this.length = length;
		this.newText = newText;
		this.oldText = oldText;
	}

	@Override
	public void execute(TextEditor editor) {
		oldText=editor.getContent().substring(position, position+length);
		editor.replaceText(position, length, newText);
	}

	@Override
	public void undo(TextEditor editor) {
		editor.replaceText(position, newText.length(), oldText);
	}
}
class TextEditor{
	private StringBuilder s;
	
	public TextEditor(String initialText) {
		s=new StringBuilder(initialText);
	}
	private Stack<EditorAction> undoStack=new Stack<>();
	private Stack<EditorAction> redoStack=new Stack<>();
	public void performAction(EditorAction action) {
		action.execute(this);
		undoStack.push(action);
		redoStack.clear();
	}
	public void undo() {
		if(!undoStack.empty()) {
			EditorAction e=undoStack.pop();
			e.undo(this);
			redoStack.push(e);
		}
	}
	public void redo() {
		if(!redoStack.empty()) {
			EditorAction e=redoStack.pop();
			e.execute(this);
			undoStack.push(e);
		}
	}
	public void insertText(String text, int position) {
		s.insert(position, text);
	}
	public void deleteText(int position, int length) {
		s.delete(position, position+length);
	}
	public void replaceText(int position, int length, String newText) {
		s.replace(position, position+length, newText);
		
	}
	public void display() {
		System.out.println("Editor Content: "+s);
	}
	public String getContent() {
		return s.toString();
	}
}
