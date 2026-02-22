import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ClientAccountDao.java
public class ClientStudentDao {
	public static void main(String[] args)  //Step :1
	{  
		
ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext_Dao.xml"); //Step :2
		
StudentDao stuDao = (StudentDao) factory.getBean("studentDao"); //Step :3

     // Bean
		Student student = new Student();  //Step 12
		student.setId(1124);             //Step 13
		student.setName("Rahul");
		student.setRollno(11);
		student.setAddress("Srirampur");
			//System.out.println(account);
		// save bean data into database 	
		stuDao.save(student);    // Step 14
			
		// retriving data form beans class         Step 17 
	    System.out.println("Student id : "+student.getId());
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student Roll no :"+student.getRollno());
		System.out.println("Student Address: " +student.getAddress());
		
		
	}  //Step 18 close main
}    //Step 19 close class
