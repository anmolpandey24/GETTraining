package com.coforge.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Author;
import com.coforge.entities.Book;
import com.coforge.util.HibernateUtil;

public class AuthorDao {
	
	public void getAll(){
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
		    session.createQuery("From Author",Author.class).list().forEach(System.out::println);
		    
		}
	}
	
	public void save(Author author) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			session.persist(author);
			tx.commit();
		}
	}
	
	public Author getById(long aid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
		
			return session.get(Author.class, aid);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void removeBookFromAuthor(long aid,long bid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			Book delbook=null;
			
			
			Author author=session.get(Author.class, aid);
			if(author!=null) {
				System.out.println("no deletion");
			for(Book book:author.getBookList()) {
				if(book.getBookId()==bid) {
					delbook=book;
					
				}
			}
			if(delbook!=null) {
				author.removeBook(delbook);
			tx.commit();
		}
			else {
				System.out.println("book not found for this author");
				}
			}
			else {
				System.out.println("Author not found");
			}
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}

	 public void update(Author author) {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            Transaction tx = session.beginTransaction();
	            session.merge(author);
	            tx.commit();
	        }
	    }
	 

	 public void delete(long aid) {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            Transaction tx = session.beginTransaction();
	            Author author = session.get(Author.class, aid);
	            if (author != null) {
	                session.remove(author);
	                tx.commit();
	            } else {
	                System.out.println("Author not found");
	            }
	        }


}
}
