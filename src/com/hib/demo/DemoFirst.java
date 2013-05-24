package com.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.entities.Student;
import com.hib.init.HibernateUtil;

public class DemoFirst {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Student student = new Student();
		student.setFirstName("Nemanja");
		student.setAge(25);

		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
}
