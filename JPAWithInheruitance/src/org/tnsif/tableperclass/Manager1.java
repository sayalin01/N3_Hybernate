package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Manager_store")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Manager1 extends Employee1{
	
	private  Integer DeptID;
	private String Deptname;
	public Integer getDeptID() {
		return DeptID;
	}
	public void setDeptID(Integer deptID) {
		DeptID = deptID;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
	@Override
	public String toString() {
		return "Manager1 [DeptID=" + DeptID + ", Deptname=" + Deptname + "]";
	}

	

}
