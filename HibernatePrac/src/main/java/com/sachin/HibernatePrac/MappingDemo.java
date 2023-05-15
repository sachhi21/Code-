package com.sachin.HibernatePrac;



import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sachin.HibernatePrac.Employee;

public class MappingDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * Equipment eq = new Equipment(); eq.setEqid(101); eq.setName("Apple Macbook");
		 * 
		 * 
		 * 
		 * 
		 * Equipment eq1 = new Equipment(); eq1.setEqid(102); eq1.setName("Windows");
		 * 
		 * 
		 * List<Equipment> list = Arrays.asList(eq, eq1);
		 * 
		 * EmployeeName name = new EmployeeName(); 
		 * name.setFname("nkdebug");
		 * name.setLname("blr");
		 * 
		 * Employee emp = new Employee(); 
		 * emp.setId(105); emp.setCountry("IN");
		 * emp.setName(name); 
		 * // emp.setEquipment(eq); emp.setEquipments(list);
		 * 
		 * 
		 * eq.getEmployees().add(emp);
		 * 
		 * 
		 * Configuration config = new
		 * Configuration().configure().addAnnotatedClass(Employee.class).
		 * addAnnotatedClass(Equipment.class);
		 * 
		 * //ServiceRegistry sr = new
		 * ServiceRegistryBuilder().applySettings(config.getProperties()).
		 * buildServiceRegistry();
		 * 
		 * SessionFactory factory = config.buildSessionFactory();
		 * 
		 * Session session = factory.openSession();
		 * 
		 * session.beginTransaction();
		 * 
		 * session.save(eq); 
		 * session.save(eq1);
		 * 
		 * session.save(emp);
		 * 
		 * session.getTransaction().commit();
		 */
		
		Employee  e = null;
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		
		SessionFactory f = config.buildSessionFactory();
		Session s = f.openSession();
		
		s.beginTransaction();
		Query q = s.createQuery("from Employee where id =105");
		q.setCacheable(true);
		
		
		e = (Employee)q.uniqueResult();
		//e = session.get(Employee.class, 105);
		//e =q;
		
		System.out.println(e);
		s.getTransaction().commit();
		s.close();
		
		Session s2  =f.openSession();
		s.beginTransaction();
		
		Query q1 = s2.createQuery("from Employee where id=105");
		q1.setCacheable(true);
		e = (Employee)q1.uniqueResult();
		
		System.out.println(e);
		
		s2.getTransaction().commit();
		s2.close();
		
		

	}

}
