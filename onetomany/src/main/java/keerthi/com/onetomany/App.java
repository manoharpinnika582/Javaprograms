package keerthi.com.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Department department=new Department("89", "Developer");
		
		Employee e1=new Employee("2345","siri");
		Employee e2=new Employee("7654", "nani");
		
		department.addEmployee(e1);
		department.addEmployee(e2);
		session.persist(department);
		
		
		
		session.getTransaction().commit();
		session.close();
    }
}
