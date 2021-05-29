package br.com.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bank.model.User;
import br.com.bank.service.UserServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServiceImpl service;
	
	public LoginServlet () {
		this.service = new UserServiceImpl ();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("admin/login.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		User user = service.buscar(email, pass);
		
		if(user != null ) {
			
			RequestDispatcher rd = request.getRequestDispatcher("admin/dashboard/index.jsp");
			request.setAttribute("user",email);
			rd.forward(request, response);
			
		}else  {
			 
			
			RequestDispatcher rd = request.getRequestDispatcher("admin/login.jsp");
			request.setAttribute("error", "Erro, login ou senha inválidos");
			rd.forward(request, response);
		}
		
		
	}

}
