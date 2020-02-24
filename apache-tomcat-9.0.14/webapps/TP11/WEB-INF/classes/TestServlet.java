import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/testServlet")

public class TestServlet extends HttpServlet {



    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
		
		String nomPersonne = request.getParameter("nom");
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		
        response.setContentType("text/html");

        out.println("<html>");
        out.println("<head>");

	    String title = "bonjour" + nomPersonne;

	    out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");

        out.println("<h1>" + title + " big boss" + "</h1>");
        out.println("<h1> aujourd'hui nous somme le : " + date + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
