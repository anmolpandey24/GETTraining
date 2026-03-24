package com.coforge.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.coforge.entities.Book;
import com.coforge.util.HibernateUtil;

public class BookDao {
	
	public void getAll(){
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
		    session.createQuery("From Book",Book.class).list().forEach(System.out::println);
		    
		}
	}
	
	public void save(Book book) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			session.persist(book);
			tx.commit();
		}
	}
	
	public Book getById(long bid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
		
			return session.get(Book.class, bid);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		
	}

	 public void update(Book book) {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            Transaction tx = session.beginTransaction();
	            session.merge(book);
	            tx.commit();
	        }
	    }
	 

    public void delete(long bid) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Book book = session.get(Book.class, bid);

            if (book != null) {
                session.remove(book);
                tx.commit();
            } else {
                System.out.println("Book not found");
            }
        }



}
}
