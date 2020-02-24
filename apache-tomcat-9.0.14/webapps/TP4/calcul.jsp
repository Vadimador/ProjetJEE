<%@ page import="java.util.*" %> 
<% 
	String calcul = request.getParameter("calcul");
	String operateur = request.getParameter("operateur");
	
	int chiffre1 = Integer.parseInt(request.getParameter("ch1"));
	int chiffre2 = Integer.parseInt(request.getParameter("ch2"));
	
	int res = 0;
	if(operateur.equals("+")) {
		res = chiffre1 + chiffre2;
	}
	else if(operateur.equals("-")) {
		res = chiffre1 - chiffre2;

	}
	else if (operateur.equals("*")) {
		res = chiffre1 * chiffre2;
	}
	
%>

<html>
<body>

<h1> Omg ton calcul est trop dur, heureusement que mon cerveau est trop gros : <%= res %></h1>

</body>
</html>