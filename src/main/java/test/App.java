package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(p);
        tx.commit();
    }
}
