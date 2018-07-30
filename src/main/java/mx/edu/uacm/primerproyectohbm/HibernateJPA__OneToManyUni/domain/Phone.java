package mx.edu.uacm.primerproyectohbm.HibernateJPA__OneToManyUni.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	private long id;
	private String number;
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Phone (String number) {
		this.number= number;
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
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}



}

