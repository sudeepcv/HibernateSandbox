package test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
        Person p=new Person(); 
        p.setName("sudeep");
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Person.class);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
            configuration.getProperties()). buildServiceRegistry();
        SessionFactory sf=configuration.buildSessionFactory(serviceRegistry);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(p);
        tx.commit();
    }
}
