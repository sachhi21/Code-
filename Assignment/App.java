package com.sachin.HibernatePrac;

/**
 * Hello world!
 *
*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.sachin.HibernatePrac.Book;
import com.sachin.HibernatePrac.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(User.class);
   	    SessionFactory factory = config.buildSessionFactory();

   	 try (Session session = factory.openSession()) {
         Transaction transaction = session.beginTransaction();
         
         User user = new User();
         user.setName("Sanmay");
         user.setId(1);
         user.setEmail("snamay@gmail.com");
         
         Book book = new Book();
         book.setTitle("The Marvel Guy");
         book.setId(1);
         book.setAuthor("sachin");
         book.setPrice(5000);
         user.setBook(book);
        book.setUser(user);
         
         
         session.save(user);
         session.save(book);
         transaction.commit();
     } catch (Exception e) {
         e.printStackTrace();
     } finally {
         factory.close();
     }
         
    	
         
         /*for(int i=0; i<10; i++) {
    	Book book = new Book();
    	  book.setId(i);
          book.setTitle("author" + i);
          book.setAuthor("Author" + 1);
          book.setPrice(5000+i);
    	  
        
    	 
    	
    	}*/
    	
    	
    	
    	
    }
}
