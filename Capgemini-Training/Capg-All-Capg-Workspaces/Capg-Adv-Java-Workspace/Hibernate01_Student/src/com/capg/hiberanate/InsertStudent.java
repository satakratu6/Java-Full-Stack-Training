package com.capg.hiberanate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class InsertStudent {

	public static void main(String[] args) {
		// 1. Start the hibernate framework
		Configuration cfg=new Configuration();
		cfg.configure();
		
		//2. Build SessionFactory
		SessionFactory factory=cfg.buildSessionFactory();
		//3. Open Session
		Session session=factory.openSession();
		//4. Begin Transaction
		Transaction tx=session.beginTransaction();
		
		try {
			//5. Create Student Object 1
			Student s1=new Student();
			s1.setSno(1);
			s1.setSname("Prateek");
			s1.setEmail("prateek@gmail.com");
			s1.setMobile(777777L);
			
			session.save(s1);
			
			//6. Create Student Object 2
			
			Student s2=new Student();
			s2.setSno(2);
			s2.setSname("Piyush");
			s2.setEmail("piyush@gmail.com");
			s2.setMobile(88888L);
			session.save(s2);
			
			//7. Commit Transaction
			tx.commit();
			System.out.println("Date inserted succesfully");
		} catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
