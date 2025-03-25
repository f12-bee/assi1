import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DisplayData {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session = factory.openSession();
		Query query=session.createQuery("FROM Employee");
		List<Employee> list= query.list();
		
		for(Employee employee:list) {
			System.out.println(employee.getId()+" "+employee.getName());
		}
		
	}

}
