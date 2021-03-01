package br.com.tecweb.model;

import lombok.Data;

@Data
public class Account {	
	
	private Long id;
	private Integer number;
	private Integer agency;
	private float balance;
	private Client client;
	
		
	public float transfer(float transferValue, String typeValue) {
		float currentBalance = 0;
		float newBalance = 0;
		
		if (typeValue.equals("C")){
			currentBalance = this.balance;
			newBalance = currentBalance + transferValue;
			this.balance = newBalance;
		
		}else if (typeValue.equals("D")) { 
			currentBalance = this.balance;
			newBalance = currentBalance - transferValue;
			this.balance = newBalance;
			
		}
				
		return newBalance;

		
	}	
	

}


