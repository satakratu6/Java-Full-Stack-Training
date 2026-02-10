package lambdEexpressions;
@FunctionalInterface
interface Adder{
	int add(int a, int b);
}
@FunctionalInterface
interface AdderTwo{
	double add(double a, double b);
}
public class Lambda3Multiparam {

	public static void main(String[] args) {
		Adder sum=(x,y)->x+y;
		System.out.println(sum.add(5, 7));
		AdderTwo sum2=(x,y)->x+y;
		System.out.println(sum2.add(7.8, 8.6));
	}

}
