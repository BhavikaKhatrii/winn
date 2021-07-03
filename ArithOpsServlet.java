import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithOpsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException , ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double result = 0;
		
		String opr = req.getParameter("opr");
		if(opr.equals("+")) 
			result = n1+n2;
		if(opr.equals("-"))
			result = n1-n2;
		if(opr.equals("*"))
			result = n1*n2;
		if(opr.equals("/"))
			result = n1/n2;
		pw.println("<body style='background-color:#E0E0E0;'"
				+ "<h1><center><b>RESULT<b></center></h1>" +
				
		"<h4> "
		+ "<center><table border='1' padding='10px' width='30%'> <th>Num1 </th><th>Num2 </th><th> = </th><th>Ans</th>"
		+ "<tr><td>"
				+ num1
				+ "</td>"
				+ "<td>"
				+ opr + "</td>"+
				"<td>"
				+ num2 + "</td>"
				+ "<td>"
				+ result + "</td></tr></table></center></h4>"
				+ "</body>"
				);
	}
}
