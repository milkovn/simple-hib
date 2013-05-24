package com.hib.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {

	@Id
	@GeneratedValue
	@Column(name="team_id", nullable=false)
	private Integer id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
	private Set<Player> players = new HashSet<Player>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	public Team() {
		super();
	}

	public Team(String name, Set<Player> players) {
		super();
		this.name = name;
		this.players = players;
	}

	public String toString() {
		return "(Team)[id = " + id + ", name = " + name + "]";
	}
}
