package br.com.fiap.scg.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/controller")
public class Controller extends HttpServlet {
	
	private static final long serialVersionUID = -5116457042416088426L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String passagem = req.getParameter("enviar");
		System.out.println(passagem);
		if(passagem == null) {
			throw new IllegalArgumentException("Não encaminhado!");
		}
		
		passagem = "br.com.fiap.scg.web."+passagem;
		
		try {
		
		Class<?> instancia = Class.forName(passagem);
		Logica logica = (Logica) instancia.newInstance();
		String pagina = logica.executa(req, resp);
		
        req.getRequestDispatcher(pagina).forward(req, resp);
		
		
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

}
