package com.coforge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Account {
	@Id
	
	private long accountId;
	private String accountHolderName;
	private double balance;

}
