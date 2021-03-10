package br.com.tecweb.view;

import br.com.tecweb.model.Account;
import br.com.tecweb.model.AccountSavings;
import br.com.tecweb.model.Client;
import lombok.Data;

@Data
public class Main {

	public static void main(String[] args) {
			
			Client client = new Client();
			client.setId(1L);
			client.setEmail("cliente1@gmail.com");
			client.setPhone("8399990000");
			client.setName("Nome1");
			
			Account account = new Account();
			account.setId(1L);
			account.setAgency("001");
			account.setNumber("100-0");
			account.setBalance(100.0);
			account.setClient(client);
			
			AccountSavings savings = new AccountSavings();
			savings.setId(2L);
			savings.setAgency("001");
			savings.setNumber("100-1");
			savings.setBalance(0.0);
			savings.setClient(client);
			savings.setTax(1.5);

					
			account.deposit(150.0);
			account.withdraw(10.0);
			account.transfer(savings, 50.0);
			
			account.extract();
			savings.extract();
			
			savings.aplyTax();
			
			
			System.out.println("Projeção de saldo da poupança após 30d :  " +savings.getBalance());
			
		
		}
	
	


}
