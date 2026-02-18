
//2. Password Generation:
//"TECH_" followed by concatenating the sum of ascii values of first 4 characters of username after converting it to lowercase with the last 2 digits of username.
//Example: Assume the username to be MICH@110
//Explanation: Here "TECH_" will be common for all generated passwords, 417 is the sum of ascii values of all characters in mich(converting to lowercase) i.e., m-109, i-105, c-99, h-104. So total of 417, 10 is the last 2 digits of course id.
//Password: TECH_41710


public class String4 {
	public static String passWord(String userName) {
		int sum=0;
		for(int i = 0; i < 4 && i < userName.length(); i++){
		    sum += Character.toLowerCase(userName.charAt(i));
		}
		StringBuilder sm=new StringBuilder("TECH_");
		sm.append(sum);
		sm.append(userName.substring(userName.length()-2));
		return sm.toString();
	}
	public static void main(String[] args) {
		System.out.println(passWord("MICH@110"));
	}
}
