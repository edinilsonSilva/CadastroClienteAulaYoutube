package br.ed;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet(urlPatterns="/clienteServlet")

public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		
		GerenciadorCliente gc = new GerenciadorCliente();
		gc.salvar(cliente);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		GerenciadorCliente gc = new GerenciadorCliente();
		List<Cliente> clientes = gc.getClientes();
		
		req.setAttribute("clientes", clientes);
		
		RequestDispatcher view = req.getRequestDispatcher("clientes.jsp");
		view.forward(req, resp);
	}
}
