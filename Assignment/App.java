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
public class App {
	public static void main(String[] args) {

		Configuration config = new Configuration().configure().addAnnotatedClass(Book.class)
				.addAnnotatedClass(User.class);
		SessionFactory factory = config.buildSessionFactory();

		
		  try (Session session = factory.openSession()) { Transaction transaction =
		 session.beginTransaction();
		 
		  User user = new User(); user.setName("Sanmay"); user.setId(1);
		  user.setEmail("snamay@gmail.com");
		 
		  Book book = new Book(); book.setTitle("The Marvel Guy"); book.setId(1);
		  book.setAuthor("sachin"); book.setPrice(5000); user.setBook(book);
		  book.setUser(user);
		 
		  Session s = factory.openSession();
			long userId = 1l;
			User user1 = s.get(User.class, userId);
			if (user != null) {
				System.out.println("User: " + user.getName());
				Book book1 = user.getBook();
				if (book != null) {
					System.out.println("Book: " + book.getTitle());
				} else {
					System.out.println("No associated book found for the user.");
				}
			} else {
				System.out.println("User not found.");
			}
			s.close();
		 
		 session.save(user); session.save(book); transaction.commit(); } catch
		  (Exception e) {
		  
		 e.printStackTrace(); 
		 }
		  finally { factory.close();
		  }
		 

	/*	try {
			Session s = factory.openSession();
			// long userId = 1l;
			User user = s.get(User.class, 1);
			if (user != null) {
				System.out.println("User: " + user.getName());
				Book book = user.getBook();
				if (book != null) {
					System.out.println("Book: " + book.getTitle());
				} else {
					System.out.println("No associated book found for the user.");
				}
			} else {
				System.out.println("User not found.");
			}
			s.close();

		} finally {
			// TODO: handle finally clause
			factory.close();
		}

		/*
		 * for(int i=0; i<10; i++) { Book book = new Book(); book.setId(i);
		 * book.setTitle("author" + i); book.setAuthor("Author" + 1);
		 * book.setPrice(5000+i);
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

	}
}
