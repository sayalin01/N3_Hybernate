//Driver class
package org.tnsif.client;

import java.util.Scanner;

import org.tnsif.entities.Student;
import org.tnsif.service.StudentService;
import org.tnsif.service.StudentServiceImpl;

public class Client {
	public static void main(String[]args) {
		StudentService service = new StudentServiceImpl();
		Scanner s=new Scanner(System.in);
		
		Student s1=new Student();
		
		//add
		/*System.out.println("Enter students roll no and name: ");
		s1.setRollno(s.nextInt());
		s1.setName(s.nextLine());
		service.add(s1);
		
		System.out.println("student added successfully");*/
		//Updation
		/*System.out.println("Enter the roll no for that you want to update the data ..");
		s1=service.get(s.nextInt()); 
		
		System.out.println("Enter the name that u want to update");
		
		s1.setName(s.next());
		service.update(s1);
		System.out.println("Updated Successfully");*/
		
		//retrieve
		/*System.out.println("Enter the roll no for retrieve");
		s1.service.get(s.nextInt());
		System.out.println("rolno: "+s1.getRollno());
		System.out.println("rolno: "+s1.getName());
		System.out.println("Successfully done");*/
	
		//remove
		System.out.println("Enter the roll number you want to delete");
		s1=service.get(s.nextInt());
		service.delete(s1);
		System.out.println("Deleted successfully");
		
	}

}
