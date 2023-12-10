package manu.com.HibernateDelete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();

		//congigure hibernate.cfg.xml
		configuration.configure("hibernate.cfg.xml");
		//create service registry
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.build();
		//build session factory
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);


		Session session=sessionFactory.openSession();
		session.beginTransaction();

		String id="456";
		Employee emp=(Employee) session.get(Employee.class, id);
		
		session.delete(emp);
		
		session.getTransaction().commit();
		session.close();
    }
}
