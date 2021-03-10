package br.com.tecweb.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {	
	
	private Long id;
	private String number;
	private String agency;
	private Double balance;
	private Client client;
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
	
	public Double withdraw (Double value) {
		if (this.balance >= value) {
			this.balance -= value;
		}
		this.transactions.add(createTransaction(this, value, "Saque", LocalDateTime.now()));
		return this.balance;
	}
	
	
	public Double deposit (Double value) {	
		this.transactions.add(createTransaction(this, value, "Deposito", LocalDateTime.now()));
		return this.balance += value;	
	}
	
	public Double transfer (Account account, Double value) {
		if (this.balance >= value) {
			this.withdraw(value);
			account.deposit(value);
		}
		this.transactions.add(createTransaction(this, value, "Transferência", LocalDateTime.now()));
		return this.balance;
	}
	
	
	private Transaction createTransaction(Account account, Double value, String typeTransaction, 
			LocalDateTime localDateTime) {
		
		Transaction transaction = new Transaction();
		transaction.setAccount(account);
		transaction.setValue(value);
		transaction.setTypeTransaction(typeTransaction);
		transaction.setDateTimeTransaction(formatDate(LocalDateTime.now()));
		transaction.setCurrentBalance(balance);
		return transaction;
		
	}
	
	private String formatDate(LocalDateTime date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dateNow = date.format(formatter);
		
		return dateNow;
		
	}
	
	
	public void extract() {
			
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("EXTRATO     CONTA: "+ number  +"     AGENCIA: "+ agency );
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("   DATA     HORA            TRANSAÇÃO                 VALOR             SALDO");
			System.out.println("--------------------------------------------------------------------------------");
			for(int i=0 ;i<getTransactions().size() ;i++) { 
				System.out.println(getTransactions().get(i).getDateTimeTransaction() + "         " +
			    getTransactions().get(i).getTypeTransaction() + "              " +
			    getTransactions().get(i).getValue() +"          " +
				getTransactions().get(i).getCurrentBalance()); 
				System.out.println("----------------------------------------------------------------------------");
				
				
			}
			
			
	}


		


}


