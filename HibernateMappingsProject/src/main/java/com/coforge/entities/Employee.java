package com.coforge.entities;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
	
	
	@Id //primary key purpose
	@GeneratedValue(strategy = GenerationType.AUTO) //auto increment
	private long eid;
	@Size(min=3,message="ename should have atleast 3 charas")
	@NotBlank
	private String ename;
	
	@NotBlank
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,3}$")
	private String email;
	
	@NotBlank
	@Pattern(regexp="[6789][0-9]{9}",message="Invalid mobile number,mobile no must start with 6/7/8/9 with exact length of 10 digits")
	private String mobile;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="aid",referencedColumnName = "aid")
	private Address address;
	public Employee(String ename, String email, String mobile, Address address) {
		super();
		this.ename = ename;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	
	

}
