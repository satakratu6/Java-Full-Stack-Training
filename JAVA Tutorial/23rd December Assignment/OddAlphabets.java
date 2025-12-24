public class OddAlphabets {
    public static void main(String[] args) {
        long product=1;
        for(int i='A';i<='Z';i++){
            if(i%2!=0){
                product*=i;
            }
        }
        for(int i='a';i<='z';i++){
            if(i%2!=0){
                product*=i;
            }
        }
        System.out.println(product);
    }
}
