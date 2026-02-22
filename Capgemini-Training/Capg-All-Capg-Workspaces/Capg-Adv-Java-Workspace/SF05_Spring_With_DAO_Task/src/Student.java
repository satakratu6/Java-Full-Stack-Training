import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private int rollno;
	private String address;
	Student(){
		
	}
//	public Student(int id, String name, int rollno, String address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.rollno = rollno;
//		this.address = address;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
