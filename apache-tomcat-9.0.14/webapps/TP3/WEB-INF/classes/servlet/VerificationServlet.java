package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import servlet.User;

@WebServlet("/verifier")
public class VerificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		HttpSession session = request.getSession(true); //dans vérification on reprends la session
		User user = (User) session.getAttribute("user_connecte"); //on recherche l'attribut user_connecte pour retrouver le mec qui s'est identifier avant
				
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
       
        out.println("<body bgcolor=\"white\">");

        if (user != null)       
        	out.println("<h1 style='color:green;'> Vous avez ete authentifié avec le login :"+ user.getLogin() + "</h1>");
        else
        	out.println("<h1 style='color:red;'> Vous n'avez pas ete authentifié. Veuillez vous identifier </h1>");
        
        out.println("</body>");
        out.println("</html>");
    }

}
