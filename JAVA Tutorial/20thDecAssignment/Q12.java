
public class Q12 {
    public static void main(String[] args) {
        boolean IsLogicRoundCleared=true;
        boolean IsCodingRoundCleared=true;
        boolean IsReferral =false;
        String res=((IsCodingRoundCleared && IsLogicRoundCleared)|| IsReferral)?"Clears the Coding Test":"Didn't clear Coding Test";
        System.out.println(res);
    }
}
