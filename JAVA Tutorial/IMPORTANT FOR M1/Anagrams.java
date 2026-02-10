import java.util.*;

class Anagrams{

    static boolean checkAnagram(String str1, String str2){
        if(str1.length()!=str1.length()){
            return false;
        }
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int[] freq=new int[26];

        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean isCheck=checkAnagram(str1, str2);
        if(isCheck){
            System.out.println("Yes Anagram");
        } else{
            System.out.println("Not a anagram");
        }

    }
}