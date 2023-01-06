

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;


public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		DbManager db = new DbManager();
		java.sql.Connection con = db.getConnection();
		
		String name = request.getParameter("uName");
		String number = request.getParameter("pNumber");
		String email = request.getParameter("email");
		String comment = request.getParameter("comment");
//		response.sendRedirect("index.jsp");
		
		try {
			
	    PreparedStatement st = con.prepareStatement("insert into contact(uName,pNumber,email,comment)values('"+name+"','"+number+"','"+email+"','"+comment+"')");
		st.executeUpdate();
		response.sendRedirect("index.jsp");
		
		}catch(Exception e) {
			System.out.println(name);
			e.printStackTrace();
		}	
	}
}