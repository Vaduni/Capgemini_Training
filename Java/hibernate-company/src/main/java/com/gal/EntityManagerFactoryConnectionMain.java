package com.gal;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class EntityManagerFactoryConnectionMain {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("company_db_pu");

        System.out.println(emf);

        emf.close();
    }
}
   