public class EvenAlphabets {
    public static void main(String[] args) {
        for(int i='A';i<='Z';i++){
            if(i%2==0){
                System.out.print(" "+(char)i);
            }
        }
         for(int i='a';i<='z';i++){
            if(i%2==0){
                System.out.print(" "+(char)i);
            }
        }
    }
}
