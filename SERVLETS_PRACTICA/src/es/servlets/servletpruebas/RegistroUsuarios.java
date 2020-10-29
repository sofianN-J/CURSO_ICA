package es.servlets.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroUsuarios
 */
@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salidaInfo = response.getWriter();
		salidaInfo.println("<html><body>");
		salidaInfo.println("Nombre introducido " + request.getParameter("nombre"));
		salidaInfo.println("<br><br>");
		salidaInfo.println("Apellido introducido " + request.getParameter("apellido"));
		salidaInfo.println("</html></body>");
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		//se puede enviar en formato html, bienario, etc....
		//muy importante setContentType
		response.setContentType("text/html"); //para especificar el fomato de la respuesta
		PrintWriter salidaInfo = response.getWriter();
		salidaInfo.println("<html><body>");
		salidaInfo.println("Nombre introducido " + request.getParameter("nombre"));
		salidaInfo.println("<br><br>");
		salidaInfo.println("Apellido introducido " + request.getParameter("apellido"));
		salidaInfo.println("</html></body>");
	}

}
