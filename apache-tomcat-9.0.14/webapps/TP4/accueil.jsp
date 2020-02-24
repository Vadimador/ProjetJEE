<%@ page import="java.util.Date" %> 
 <%   
	Date today = new Date();
	String nom = request.getParameter("nom");
	String sexe = request.getParameter("sexe");
	String civilite = "Madame";
	
	if(sexe.equalsIgnoreCase("m")) {
		civilite = "Monsieur";
	}
	else if(sexe.equalsIgnoreCase("f")) {
		civilite = "Madame";
	}
 %>

<html>
<body>

<h1> Bonjour toi (<%= civilite %> <%= nom %>), nous sommes le <%= today.toString() %>  probablement un Lundi. </h1>

</body>
</html>