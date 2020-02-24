package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import servlet.User;

@WebServlet("/sidentifier")
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("mdp");
		
		User user = new User (login, password);
		
		HttpSession session = request.getSession(true);		
		session.setAttribute("user_connecte", user);		//on met un attribut dans la session, c'est un User contenant le mdp et le login
				
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
       
        out.println("<body bgcolor=\"white\">");

        out.println("<h1> Connexion réussie avec le login :"+ user.getLogin() + "</h1>");
        
        out.println("</body>");
        out.println("</html>");
    }

}
