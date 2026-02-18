import java.util.*;

public class String3 {
	public static String transform(String str) {
		for(char ch:str.toCharArray()) {
			if(!Character.isLetter(ch)) {
				return null;
			}
		}
		String[] list=str.trim().split("\\s+");
		StringBuilder sm=new StringBuilder();
		if(list.length%2!=0) {
			for(String m:list) {
				StringBuilder string =new StringBuilder(m);
				sm.append(string.reverse().toString()).append(" ");
				
			}
		} else {
			for(int i=list.length-1;i>=0;i--) {
				sm.append(list[i]).append(" ");
			}
		}
		return sm.toString();
	}
	public static void main(String[] args) {
		System.out.println(transform("Hello My World"));
		System.out.println(transform("Top Brains"));

	}

}
