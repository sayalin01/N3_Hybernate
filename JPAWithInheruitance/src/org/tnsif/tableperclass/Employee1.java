package org.tnsif.tableperclass;
import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//import org.hibernate.mapping.PrimaryKey;

@Entity
@Table(name="Emp_store")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)


//Programto demonstrate on Table perclass
public class Employee1 {

	private static final long serialVersionID=11;
	
	//datamembers
	
	private Integer ID;
	private String name;
	private Float salary;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
