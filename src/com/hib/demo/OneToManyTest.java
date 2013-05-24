package com.hib.demo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.entities.Player;
import com.hib.entities.Team;
import com.hib.init.HibernateUtil;

public class OneToManyTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Team team = new Team();
		team.setName("Barcelona");
		Set<Player> players = new HashSet<Player>();

		Player p1 = new Player();
		p1.setLastname("Messi");
		Player p2 = new Player();
		p2.setLastname("Xavi");

		p1.setTeam(team);
		p2.setTeam(team);
		
		players.add(p1);
		players.add(p2);

		team.setPlayers(players);

		session.save(team);
		session.getTransaction().commit();
		session.close();
	}
}
