import java.util.LinkedList;
import java.util.Scanner;

public class M1Collections2 {
	private LinkedList<String> playList=new LinkedList<String>();
	
	public void addSong(String songName) {
		playList.addLast(songName);
	}
	public void removeSong(String songName) {
		if(playList.contains(songName)) {
			playList.remove(songName);
		}
	}
	public void moveToTop(String songName) {
		if(playList.contains(songName)) {
			playList.remove(songName);
			playList.addFirst(songName);
		}
	}
	public void getAllSongs() {
		for(int i=0;i<playList.size();i++) {
			System.out.print(playList.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		M1Collections2 c=new M1Collections2();
		for(int i=0;i<n;i++) {
			String input=sc.nextLine();
			String parts[]=input.split(" ");
			String command=parts[0];
			switch(command) {
			case "ADD":
				c.addSong(parts[1]);
				break;
			case "REMOVE":
				c.removeSong(parts[1]);
				break;
			case "MOVE":
				c.moveToTop(parts[1]);
				break;
			case "PRINT":
				c.getAllSongs();
				break;
			}
		}
	}
}
