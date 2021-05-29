package br.com.bank.service;

import java.util.List;

import br.com.bank.dao.UserDaoImpl;
import br.com.bank.model.User;


public class UserServiceImpl implements UserService {
	
	private UserDaoImpl dao;
	
	public UserServiceImpl() {
		this.dao = new UserDaoImpl();
	}

	@Override
	public void salvar(User user) {
		this.dao.salvar(user);
	}
	
	@Override
	public void remover(Long id) {
		this.dao.remover(id);
		
	}

	@Override
	public List<User> list() {
		return this.dao.list();
	}
	
	
	@Override
	public void atualizar(User user) {
		this.dao.atualizar(user);
		
	}
		
	@Override
	public User editar(Long id) {
		return this.dao.editar(id);
		
	}
		
	@Override
	public User getUser(String email,String password)  {
		return this.dao.getUser(email, password);
		
	}
	
	

}
