package br.com.tecweb.model;

import lombok.Data;

@Data
public class ManagerAccount {
	
	public static void main(String[] args) {
		
		Client client = new Client();
		client.setId(1L);
		client.setEmail("cliente1@gmail.com");
		client.setPhone("8399990000");
		client.setName("Nome1");
		
		Account account = new Account();
		account.setId(1L);
		account.setAgency(001);
		account.setNumber(100);
		account.setBalance(1000);
		account.setClient(client);
		
		Client client2 = new Client();
		
		System.out.println(">>>" +client);
		System.out.println(">>>" +account);
		System.out.println(">>>" +client2);
	}

}
