package br.com.bank.service;

import java.util.List;

import br.com.bank.model.User;


public interface UserService {
	
	void salvar(User user);
	
	void remover(Long id);
	
	List<User> list();
	
	void atualizar(User user);
	
	User editar(Long id);
	
	User getUser(String email,String password);
	

}
