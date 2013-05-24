package com.hib.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.entities.Student;
import com.hib.init.HibernateUtil;

public class DemoSecond {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<Student> students = session.createQuery("from Student").list();

		session.clear();

		for (Student s : students) {
			System.out.println(s);
		}
	}
}
