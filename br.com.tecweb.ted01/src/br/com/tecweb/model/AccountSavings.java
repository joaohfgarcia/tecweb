package br.com.tecweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountSavings extends Account{
	
	private double tax;
	
			
	public double aplyTax () {
		
		super.setBalance(super.getBalance() * tax/100 + super.getBalance());
		return super.getBalance();
		
		
	}
	
	
}
