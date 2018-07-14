package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEid( 1202 );
	    employee.setEname( "Mangesh" );
	    employee.setSalary( 40000 );
	    employee.setDeg( "Technical Manager" );
		
	    entitymanager.persist( employee );
	    entitymanager.getTransaction( ).commit( );
	    
	    entitymanager.close( );
	    emfactory.close( );
	}

}
