package ObjectClass;

import java.util.Objects;

class Book{
	String bname;
	int id;

	public Book(String bname) {
		super();
		this.bname = bname;
	}

	@Override
	public int hashCode() {
		return bname.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return this.bname.equals(other.bname);
//		return Objects.equals(bname, other.bname);
	}
	
}
public class EqualsMethod {
	public static void main(String[] args) {
		Book b1=new Book("Java");
		Book b2=new Book("SQL");
		Book b3=new Book("SQL");
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
	}
}
