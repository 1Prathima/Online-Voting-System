

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class RegisterVoter
 */
public class RegisterVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		DbManager db = new DbManager();
		java.sql.Connection con = db.getConnection();
		
		String name = request.getParameter("uName");
		String number = request.getParameter("pNumber");
		String email = request.getParameter("email");
		String vNumber = request.getParameter("voterNumber");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		
		try {
			
			PreparedStatement st = con.prepareStatement("insert into voters(uName,pNumber,email,vNumber,dob,address) values('"+name+"','"+number+"','"+email+"','"+vNumber+"','"+dob+"','"+address+"')");
			st.executeUpdate();
			response.sendRedirect("adminWelcome.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
