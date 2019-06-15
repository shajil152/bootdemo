package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.SessionFactory;

public class Lab1A {

	public static void main(String[] args) {

		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust= new Customer("sri","sri@jlc",1234567,"blore",20000.0);
			session.save(cust);
			tx.commit();
			session.close();
			System.out.print("record inserted");		
		
		}
		catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}		
			
			
			
		
		
	}

}
