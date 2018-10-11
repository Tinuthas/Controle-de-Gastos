package br.com.fiap.scg.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.scg.beans.Usuario;
import br.com.fiap.scg.dao.ContaDAO;

public class adicionaValor implements Logica{
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Usuario u = new Usuario();
		ContaDAO daoConta = new ContaDAO();
		Double valor = Double.parseDouble(req.getParameter("addValor"));
		HttpSession session = req.getSession();
		u = (Usuario) session.getAttribute("USUARIO"); 
		
		
		
		if(valor != 0) {
			daoConta.atualizarValorSoma(valor, u);
		}
		
		return "index.jsp";
	}
	
}
