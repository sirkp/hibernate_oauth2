package com.example.hibernate.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "username", unique = true, nullable = false, length = 100)
	private String userName;

	@Column(name = "password", unique = false, nullable = false, length = 100)
	private String password;
	
	@Column(name = "first_name", unique = false, nullable = false, length = 100)
	private String firstName;
	
	@Column(name = "last_name", unique = false, nullable = false, length = 100)
	private String lastName;

	@Column(name = "role", unique = false, nullable = false, length = 100)
	private String role;

	@Override
	public String toString() {
		return String.format("UserInfo [id=%s, userName=%s, password=%s, role=%s]"
			, id, userName, password, role);
	}


}