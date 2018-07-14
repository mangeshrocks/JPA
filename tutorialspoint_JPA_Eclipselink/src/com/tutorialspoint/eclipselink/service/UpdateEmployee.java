package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	      
	    EntityManager entitymanager = emfactory.createEntityManager( );
	    entitymanager.getTransaction( ).begin( );
	    
	    Employee employee = entitymanager.find(Employee.class, 1202);
	    
	    //before update
	    System.out.println( employee );
	    employee.setEname("Nilesh");
	    employee.setSalary(46000);
	    employee.setDeg("Manager");
	    entitymanager.getTransaction().commit();
	    
	    //after update
	    System.out.println( employee );
	    entitymanager.close();
	    emfactory.close();
	}

}
