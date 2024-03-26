

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1")); 
		int num2 = Integer.parseInt(request.getParameter("num2")); 
		
		int soma = num1 + num2; 
		int sub = num1 - num2; 
		int multi = num1 * num2; 
		double divisao = (double) num1 / num2; 
		
		response.setContentType("text/html");
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h2>Resultados</h2>");
		response.getWriter().println("Soma: " + soma + "<br>");
		response.getWriter().println("Subtração: " + sub + "<br>");
		response.getWriter().println("Multiplicação: " + multi + "<br>");
		response.getWriter().println("Divisão: " + divisao + "<br>");
        response.getWriter().println("</body></html>");
	}

}
