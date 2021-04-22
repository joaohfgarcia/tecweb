package br.com.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.bank.model.Client;
import br.com.bank.service.ClientServiceImpl;

@WebServlet("/clientServlet")

public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClientServiceImpl service;
	
	public ClientServlet() {
		this.service = new ClientServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Response to client").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//PEGA OS DADOS DO REQUEST
		String name  = request.getParameter("name"); 
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		
		//MONTEI O MEU OBJETO CLIENT
		Client client = new Client();
		client.setName(name);
		client.setEmail(email);
		client.setPhone(phone);
		
		//SALVAR O MEU CLIENT	
		
			
		for (Client listClient : this.service.getAll()){
			
			if (name.equals("") || email.equals("")|| phone.equals("")) {
					
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				request.setAttribute("error", "Cadastro não realizado. Preencha todos os dados!");	
				rd.forward(request, response);
				
							
			}else if (listClient.getEmail().contains(email)){
				
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				request.setAttribute("error", "Email já está cadastrado!");	
				rd.forward(request, response);
				return;
	
				
			}else if (listClient.getPhone().contains(phone)) {
									
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				request.setAttribute("error", "Fone já está cadastrado!");
				rd.forward(request, response);
				return;
								
								
			}else {
	
				this.service.save(client);
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");	
				rd.forward(request, response);
			} 
			
		request.setAttribute("result", true);
		}
		
	}

}
