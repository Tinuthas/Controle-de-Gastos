package br.com.fiap.scg.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.scg.beans.Conta;
import br.com.fiap.scg.beans.Gasto;
import br.com.fiap.scg.beans.Usuario;
import br.com.fiap.scg.dao.ContaDAO;
import br.com.fiap.scg.dao.GastoDAO;

public class adicionaGasto implements Logica{

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Gasto g = new Gasto();
		Conta c = new Conta();
		HttpSession session = req.getSession();
		
		c.setUsuario((Usuario) session.getAttribute("USUARIO"));
		g.setValorGasto(Double.parseDouble(req.getParameter("valorGasto")));
		g.setDescricao(req.getParameter("descricao"));
		g.setData(new Date().toString());
		g.setConta(c);
		
		GastoDAO daoGasto = new GastoDAO();
		daoGasto.inserirGasto(g);
		
		ContaDAO daoConta = new ContaDAO();
		daoConta.atualizarValorGasto(g);
		
		return "index.jsp";
	}

}
