package com.gamedoora.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_skills")
public class UserSkills implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

//	@ManyToOne
//	@JoinColumn(name = "skills_id")
//	Skills skills;

	@ManyToOne
	@JoinColumn(name = "user_id")
	Users users;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public Skills getSkills() {
//		return skills;
//	}
//
//	public void setSkills(Skills skills) {
//		this.skills = skills;
//	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
