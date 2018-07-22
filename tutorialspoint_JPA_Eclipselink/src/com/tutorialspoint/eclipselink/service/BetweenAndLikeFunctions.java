package com.tutorialspoint.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class BetweenAndLikeFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		//Betweeen
		Query query = entitymanager.createQuery("Select e "+"from Employee e"+" where e.salary "+"BETWEEN 30000 AND 40000");
		List<Employee> list = (List<Employee>)query.getResultList();
		
		for(Employee e:list)
		{
			System.out.print("Employee Name:"+e.getEname());
			System.out.print("\t\tEmployee ID:"+e.getEid());
			System.out.println("\t Employee Salary:"+e.getSalary());	
		}
		
		//LIKE
		Query query1 = entitymanager.createQuery("Select e from Employee e where e.ename LIKE 'M%'");
		List<Employee> list1 = query1.getResultList();
		
		for(Employee e:list1)
		{
			System.out.print("Employee ID:"+e.getEid());
			System.out.println("\t Employee name:"+e.getEname()	);
		}
		
		//Between
	      Query query2 = entitymanager.createQuery( "Select e " + "from Employee e " + "ORDER BY e.ename ASC" );

	      List<Employee> list2 = (List<Employee>)query.getResultList( );

	      for( Employee e:list2 ) 
	      {
	         System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee Name :" + e.getEname( ));
	      }
	         
	}

}
