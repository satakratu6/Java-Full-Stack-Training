package lambdEexpressions;
import java.util.*;
public class Lambda7_MethodRef {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Sattu", "Prateek", "Rahul");
		//lambda way
		names.forEach(name->System.out.println(name.toUpperCase()));
		
		//method reference way (even shorter)
		
		names.forEach(System.out::println);
	}

}
