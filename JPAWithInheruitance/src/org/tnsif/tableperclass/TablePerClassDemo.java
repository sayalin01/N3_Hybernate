package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//firstemp
		Employee1 em1 = new Employee1();
		em1.setID(102);
		em1.setName("saam");
		em1.setSalary(100000.0F);
		em.persist(em1);
		
		//first Manager
		Manager1 m1 = new Manager1();
		m1.setID(420);
		m1.setName("Raghuram");
		m1.setSalary(444555F);
		m1.setDeptID(332);
		m1.setDeptname("poojari");
		em.persist(m1);
		em.getTransaction().commit();
		
		

	}

}
