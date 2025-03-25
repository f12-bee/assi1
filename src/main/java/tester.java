import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class tester {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		// data inserted
		Employee employee =new Employee();
		employee.setName("User");
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.print("Data inserted successfully");
		}

}
