package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// uma configura��o para o Tomcat, o mapeamento
@WebServlet(urlPatterns = "/oi")
public class OiMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
			out.println("<body>");
				out.println("Primeiro servlet, exemplo.");
			out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet est� rodando");
	}

}
