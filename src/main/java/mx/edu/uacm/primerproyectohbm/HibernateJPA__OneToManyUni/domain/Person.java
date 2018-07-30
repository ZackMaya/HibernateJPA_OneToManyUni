package mx.edu.uacm.primerproyectohbm.HibernateJPA__OneToManyUni.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Person {

	
	@Id
	@GeneratedValue
	//Por default genera ID
	private long id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)	
	//@OneToMany(cascadeType.ALL.orphanRemoval = true)
	private List<Phone> phones = new ArrayList();
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the phones
	 */
	public List<Phone> getPhones() {
		return phones;
	}



	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}


	
}
