package topbrainsfunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class StudentPerformanceFilter {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		String[] names = {"Smith", "Allen", "King", "Alice","Mathews"};
		int[] marks = {84, 67, 96, 52, 32};
		for(int i=0;i<names.length;i++) {
		    list.add(new Student(names[i], marks[i]));
		}
		list.stream().filter(s->s.marks>80).forEach(s->System.out.println(s.name+" "+s.marks));
}
}
class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return name + marks ;
	}
	
}
