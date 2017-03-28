package br.com.mercadorias.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercadorias.bo.MercadoriaBO;
import br.com.mercadorias.entity.Mercadoria;
import br.com.mercadorias.entity.TipoNegocio;

/**
 * Servlet implementation class ServletMarcadoria
 */
@WebServlet("/ServletMercadoria")
public class ServletMarcadoria extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletMarcadoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("page").equals("cadastrarMercadoria.jsp")) {
			request.setAttribute("page", request.getParameter("page"));
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if (request.getParameter("page").equals("listaOper.jsp")) {
			System.out.println(request.getParameter("page"));
			request.setAttribute("page", request.getParameter("page"));
			listarOperacoes(request, response);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("origem").equals("cadastroNegoc")) {
			cadastraNegocio(request, response);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if (request.getParameter("origem").equals("listaOper")) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	private void listarOperacoes(HttpServletRequest request, HttpServletResponse response) {
		Mercadoria m = new Mercadoria();
		m.setCodigo(0);
		MercadoriaBO bo = new MercadoriaBO();
		request.setAttribute("objOper", bo.listar(m.getCodigo()));
	}

	private void cadastraNegocio(HttpServletRequest request, HttpServletResponse response) {
		Mercadoria m = new Mercadoria();
		m.setCodigo(0);
		m.setNome(request.getParameter("nmMercadoria"));
		m.setPreco(Float.parseFloat(request.getParameter("vlrMercadoria")));
		m.setQtd(Integer.parseInt(request.getParameter("qtdMercadoria")));
		m.setTipo(request.getParameter("tpoMercadoria"));
		if (request.getParameter("tpoNegociacao").equals("compra")) {
			m.setTipoNegocio(TipoNegocio.COMPRA);
		} else {
			m.setTipoNegocio(TipoNegocio.VENDA);
		}
		MercadoriaBO bo = new MercadoriaBO();
		bo.cadastrar(m);
	}

}
