package ObjectClass;
class A{
	public String name;
	public int age;
	public long contactNumber;
	public String address;
	
	public A(String name, int age, long contactNumber, String address) {
		super();
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	@Override
	public String toString() {
//		return "A [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address + "]";
		System.out.println("Name: "+ name+", age: "+age+", ContactNumber: "+contactNumber+", Address: "+address);
		return " ";
	}
}
public class ToStringExample {
	public static void main(String[] args) {
		A a=new A("Satakratu",22,797326380,"Panihati");
		System.out.println(a.toString());
	}
}
