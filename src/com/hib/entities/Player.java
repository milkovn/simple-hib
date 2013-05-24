package com.hib.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player {

	@Id
	@GeneratedValue
	private Integer id;

	private String lastname;

	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player() {
		super();
	}

	public Player(String lastname, Team team) {
		super();
		this.lastname = lastname;
		this.team = team;
	}

	public String toString() {
		return "(Player)[id = " + id + ", lastname = " + lastname + "]";
	}
}
