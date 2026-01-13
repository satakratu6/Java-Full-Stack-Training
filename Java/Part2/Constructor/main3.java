package Constructor;

public class main3 {
	static int a;
	int b;
	main3(){
		System.out.println("No args constructor");
	}
	main3(int a){
		this();
		main3.a=a;
	}
	main3(int a, int b){
		this(a);
		this.b=b;
	}
	public static void main(String[] args) {
		main2 a1=new main2(50,200);
		System.out.println(main3.a);
		System.out.println(a1.b);
		
	}
}
