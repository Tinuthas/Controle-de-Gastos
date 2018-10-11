package br.com.fiap.scg.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.scg.beans.Conta;
import br.com.fiap.scg.beans.Gasto;
import br.com.fiap.scg.beans.Usuario;
import br.com.fiap.scg.dao.ContaDAO;
import br.com.fiap.scg.dao.GastoDAO;
import br.com.fiap.scg.dao.UsuarioDAO;

public class login implements Logica {
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		session.removeAttribute("USUARIOINVALIDO");
		Usuario u = new Usuario();
		
		u.setEmail(req.getParameter("email"));
		u.setSenha(req.getParameter("senha"));
		
		UsuarioDAO dao = new UsuarioDAO();
		u = dao.login(u);
				
		Conta c = new Conta();
		GastoDAO daoGasto = new GastoDAO();
		Map<String, Gasto> listaGasto = daoGasto.buscaGasto(u);
		ContaDAO daoConta = new ContaDAO();
		c = daoConta.buscaConta(u);
		
		String passagem = null;
		
		if(u != null) {
			session.setAttribute("LISTAGASTO", listaGasto);
			session.setAttribute("CONTA", c);
			session.setAttribute("USUARIO", u);
			passagem = "index.jsp";
		}else {
			session.setAttribute("USUARIOINVALIDO", u);
			passagem = "login.jsp";
		}
		
		
		return passagem;
	}

}
