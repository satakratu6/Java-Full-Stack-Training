package MiniTextEditor;

import java.util.Stack;

public class TextEditor {
	private StringBuilder s=new StringBuilder();
	private Stack<String> undoStack=new Stack<String>();
	private Stack<String> redoStack = new Stack<String>();
	public void addText(String text) {
		undoStack.push(s.toString());
		s.append(text);
		redoStack.clear();
		System.out.println("Text added Succesfully");
	}
	public void deleteText(int n) {
		undoStack.push(s.toString());
		s.delete(s.length()-n, s.length());
		redoStack.clear();
		System.out.println("Text deleted successfully!\r\n"
				+ "");
	}
	public void searchWord(String word) {
		
	}
	public void replaceWord(String oldWord, String newWord) {
		undoStack.push(s.toString());
		String updated=s.toString().replace(oldWord,newWord);
		s= new StringBuilder(updated);
		redoStack.clear();
		System.out.println("Text replaced successfully!\r\n"
				+ "");
	}
	public void undo() {
		if(!undoStack.empty()) {
			redoStack.push(s.toString());
			s=new StringBuilder(undoStack.pop());
			System.out.println("Undo Succesfull");
		} else {
			System.out.println("Nothing to Undo");
		}
	}
	public void redo() {
		if(!redoStack.empty()) {
			undoStack.push(s.toString());
			s=new StringBuilder(redoStack.pop());
			System.out.println("Redo Succesfull");
		} else {
			System.out.println("Nothing to Undo");
		}
	}
	public void display() {
		System.out.println("Current Document: ");
		System.out.println(s);
	}
}
