package MiniTextEditor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TextEditor t=new TextEditor();
		System.out.println("=== MINI TEXT EDITOR ===\r\n"
				+ "");
		System.out.println("1. Add Text\r\n"
				+ "2. Delete Text\r\n"
				+ "3. Search Word\r\n"
				+ "4. Replace Word\r\n"
				+ "5. Undo\r\n"
				+ "6. Redo\r\n"
				+ "7. Display Document\r\n"
				+ "8. Exit");
		while(true) {
			System.out.print("Choose: ");
			int choice=sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter tex: ");
				String text=sc.nextLine();
				t.addText(text);
				break;
			case 7:
				t.display();
				break;
			case 4:
				System.out.print("Enter word to replace: ");
				String oldWord=sc.nextLine();
				System.out.print("Enter replacement: ");
				String newWord=sc.nextLine();
				t.replaceWord(oldWord, newWord);
				break;
			case 2:
				System.out.print("Enter number of characters to delete: ");
				int n=sc.nextInt();
				t.deleteText(n);
				break;
			case 5:
				t.undo();
				break;
			case 6:
				t.redo();
				break;
			case 8:
				System.out.println("Exiting Editor...");
				System.exit(0);
			default:
				break;
			}
		}
	}
}
