package lambdEexpressions;
@FunctionalInterface
interface Greeting {
	void sayHello();
}
public class Lambda1 {

	public static void main(String[] args) {
		Greeting g=new Greeting() {public void sayHello() {System.out.println("Hello !");
		System.out.println("Hi");}};
//		Greeting g=()->System.out.println("Hello From Sattu");
		g.sayHello();
	}

}
