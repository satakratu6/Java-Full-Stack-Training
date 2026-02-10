package Constructor;

public class main2 {
	int a;
	int b;
	main2(){
		System.out.println("No args constructor");
	}
	main2(int a){
		this();
		this.a=a;
	}
	main2(int a, int b){
		this(a);
		this.b=b;
	}
	public static void main(String[] args) {
		main2 a1=new main2(50,200);
		System.out.println(a1.a);
		System.out.println(a1.b);
	}
}
