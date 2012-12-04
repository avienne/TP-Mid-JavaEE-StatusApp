package statusapp.presentation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.ejb.EJB; 


import statusapp.components.Statuses;

@WebServlet(urlPatterns = "/status")
public class StatusServlet extends HttpServlet{
	
	@EJB
	Statuses statuse; 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				request.setAttribute("statuslist", statuse.getStatus()); 
		        request.getServletContext().getRequestDispatcher("/WEB-INF/views/status.jsp").forward(request, response);

	}

}