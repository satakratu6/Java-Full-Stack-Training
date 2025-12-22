import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is the logic round cleared?");
        boolean isLogicRoundCleared=sc.nextBoolean();
        System.out.println("Is the coding round cleared?");
        boolean isCodingRoundCleared=sc.nextBoolean();
        System.out.println("Is there any referral?");
        boolean isReferral =sc.nextBoolean();
        String res=((isCodingRoundCleared && isLogicRoundCleared)|| isReferral)?"Clears the Coding Test":"Didn't clear Coding Test";
        System.out.println(res);
    }
}
