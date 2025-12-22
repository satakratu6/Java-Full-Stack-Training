
public class Q11 {
    public static void main(String[] args) {
        char ch='a';
        boolean UC=ch>='A' && ch<='Z';
        boolean LC=ch>='a' && ch<='z';
        boolean alp=UC||LC;
        boolean dig=ch>='0' && ch<='9';
        boolean UCV=ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';        
        boolean LCV=ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
        // String res=((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))? ((ch>='A' && ch<='Z')? 
        // (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') ? "Uppercase Vowel":"Uppercase Consonant" :
        // (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')? "Lowercase Vowel":"Lowercase Consonant"):
        // (ch>='0' && ch<='9')?"Numbers":"Special Character";
        System.out.println(alp?"Alphabet: "+(UC?"UpprerCase: "+(UCV?"Vowel":"Consonant")
        :"Lowercase: "+(LCV? "Vowel":"Consonant")):(dig?"Number":"Special Character"));
    }
}
