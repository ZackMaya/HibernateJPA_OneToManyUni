package mx.edu.uacm.primerproyectohbm.HibernateJPA__OneToManyUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.edu.uacm.primerproyectohbm.HibernateJPA__OneToManyUni.domain.Person;
import mx.edu.uacm.primerproyectohbm.HibernateJPA__OneToManyUni.domain.Phone;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	//JPA proporciona dentro de la clase persistence un metodo createEntityManagerFactory que nos
    	//permite cargar el archivo de configuraciÃ³n 
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPA_OneToManyUni");
    	
    	//Creamos un EntityManager
    	//Similar al session de hibernate
    	EntityManager em = emf.createEntityManager();
    	
    	Person person= new Person();
    	Phone phone1 = new Phone("89855434");
    	Phone phone2 = new Phone("89855434");
    	
    	//agregar telefonos a la persona
    	
    	person.getPhones().add(phone1);
    	person.getPhones().add(phone2);
    	
	em.getTransaction().begin();
	
	
	//persist
	em.persist(person);
	em.flush();
	
	//person.getPhones().remove(phone1);
    	
    	em.getTransaction().commit();
	
    	//Metodos de cierre 
    	em.close();
    	emf.close();
    	
    }
}