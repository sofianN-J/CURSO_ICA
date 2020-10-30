package com.grupoica.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaServlet
 */
//@WebServlet("/Hola")
public class HolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("<h1>Hola desde POST servlet, mi nombre es SOFIANE</h1> at: ").append(request.getContextPath());
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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("<h1>Hola desde GET servlet, mi nombre es SOFIANE</h1> at: ").append(request.getContextPath());
		
		PrintWriter salidaInfo = response.getWriter();
		salidaInfo.println("<html><body>");
		salidaInfo.println("Numero introducido " + request.getParameter("numero"));
		if(request.getParameter("numero") == null || "".equals(request.getParameter("numero"))) {
			salidaInfo.println("<p2>PON EL NUMERO</p2>");
		}else {
			   
			String a = request.getParameter("numero");
			int iTest = Integer.valueOf(a);
			//int j = iTest;
			for(int i = 0; i <= iTest ; i++ ) {
			
				salidaInfo.println(" -" + i + " " + iTest++  + " pos "+ i++);
				
			}
		}
		
		
		salidaInfo.println("<br><br>");
		salidaInfo.println("Apellido introducido " + request.getParameter("apellido"));
		salidaInfo.println("</html></body>");
	
	
	
	}

}



