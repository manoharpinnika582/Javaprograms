package kod.manu.HibernateOneToOne;

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
		configuration.configure("hibernate.cfg.xml");
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Employee e=new Employee("6600", "nani", "57000", "male", "21");
		Address a=new Address("5232", "Bangalure", e);
		e.setAddess(a);
		session.persist(e);
		
		
		session.getTransaction().commit();
		session.close();
    }
}
