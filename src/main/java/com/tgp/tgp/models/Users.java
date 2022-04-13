package com.tgp.tgp.models;


import javax.persistance.*;
import javax.validation.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, unique = true)
	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Invalid email, please try again")
	private String email;
	
	@Column(length = 50)
	@NotBlank(message = "First name cannot be blank")
	@Size(min = 1, message = "First name must be at least 1 character")
	private String firstName;
	
	@Column(length = 50)
	private String lastName;

	public Users() {}

	public Users(long id, String email, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	