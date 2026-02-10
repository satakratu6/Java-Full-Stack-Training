package lambdEexpressions;
@FunctionalInterface
interface Calculator{
	int calculate(int a, int b);
}
public class Lambda4_Body {

	public static void main(String[] args) {
		Calculator c=(a,b)->{
			System.out.println("Multiplying");
			return a*b;
		};
		System.out.println(c.calculate(2, 20));
	}

}
