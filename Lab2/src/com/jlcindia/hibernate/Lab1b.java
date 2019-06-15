package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.SessionFactory;

public class Lab1b {

	public static void main(String[] args) {

		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=(Customer)session.load(Customer.class,1);
			System.out.println(cust.getCid()+" "+cust.getCname()+" "+cust.getEmail()+" "+cust.getPhone()+" "+cust.getCity()+" "+cust.getBal());
			tx.commit();
			session.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}		
			
			
			
		
		
	}

}
