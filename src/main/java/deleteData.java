import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteData {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=scanner.nextInt();
		Employee employee =session.get(Employee.class, id);
		session.delete(employee);
		
		transaction.commit();
		session.close();
		System.out.print("Data deleted successfully");

	}

}
