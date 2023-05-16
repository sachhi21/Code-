<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE hibernate-configuration PUBLIC

		"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
    
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
    
<hibernate-configuration>
  
    <session-factory>
      
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
      
        <property name="hibernate.connection.password">pass@word1</property>
      
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/book_store</property>
      
        <property name="hibernate.connection.username">root</property>
      
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>
      
        <property name="hbm2ddl.auto">create</property>
      
          <property name="show_sql">true</property>
          
           <mapping class="com.sachin.HibernatePrac.Book"/>
           
    </session-factory>
</hibernate-configuration>