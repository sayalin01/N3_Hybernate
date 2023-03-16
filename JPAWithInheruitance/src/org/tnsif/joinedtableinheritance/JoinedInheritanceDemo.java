package org.tnsif.joinedtableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first student
		Student e3=new Student();
		e3.setRollno(1001);
		e3.setName("Sayali");
		e3.setPercentage(35f);
		em.persist(e3);
		
		//second student
		Student e4=new Student();
		e4.setRollno(17);
		e4.setName("Om");
		e4.setPercentage(91f);
		em.persist(e4);
		
		//first citizen
		Citizen m1=new Citizen();
		m1.setRollno(150);
		m1.setName("Aakash");
		m1.setPercentage(80f);
		m1.setCitizenType("India");
		m1.setPassportno(1687);
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}

}
