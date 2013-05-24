package com.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.entities.Author;
import com.hib.entities.Biography;
import com.hib.init.HibernateUtil;

public class OneToOneTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Author author = new Author();
		author.setName("Nemanja");

		session.persist(author);

		Biography biography = new Biography();
		biography.setInformation("Nemanja MIlkov je car!");
		biography.setAuthorId(author.getId());

		author.setBiography(biography);

		session.save(author);

		session.getTransaction().commit();

		session.close();
	}
}
