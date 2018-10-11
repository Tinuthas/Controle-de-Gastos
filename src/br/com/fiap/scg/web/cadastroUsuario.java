package br.com.fiap.scg.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.scg.beans.Usuario;
import br.com.fiap.scg.dao.UsuarioDAO;

public class cadastroUsuario implements Logica{
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Usuario u = new Usuario();
		
		u.setNome(req.getParameter("nome"));
		u.setEmail(req.getParameter("email"));
		u.setSenha(req.getParameter("senha"));
		
		UsuarioDAO dao =  new UsuarioDAO();
		dao.adicionar(u);
		
		HttpSession session = req.getSession();
		session.setAttribute("USUARIO", u);
		
		return "index.jsp";
	}
}
