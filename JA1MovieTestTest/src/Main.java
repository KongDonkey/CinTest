import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
//		SessionFactory factory = new Configuration().addAnnotatedClass(Schedule.class).addAnnotatedClass(Seance.class).configure().buildSessionFactory();
//		Session session = factory.openSession();
		
//		
//		Schedule schedule = new Schedule();
//		Seance seance = new Seance("Akula", 2, 11, 10, 15, 1);
//		schedule.getSchedule().add(seance);
//		session.persist(schedule);
		
		
		session.getTransaction().commit();

		session.close();

		factory.close();
		

	}
}
