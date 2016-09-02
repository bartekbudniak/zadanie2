package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Application;
import repositories.DumyApplicationRepository;

/**
 * Servlet implementation class UsersListApplicantServlet
 */
@WebServlet("/UsersListApplicantServlet")
public class UsersListApplicantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersListApplicantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	
		HttpSession session = request.getSession();
	
		if(((Application)session.getAttribute("logged")).getPremium() == "admin"){
			response.getWriter().print("<table><caption>Lista u¿ytkowników:</caption>"
					+ "<tr><th>Username</th><th>Email</th><th>Premium</th></tr>");
			
			List<Application> db = ((DumyApplicationRepository)session.getAttribute("logged")).getList();
			for(Application application: db){
				response.getWriter().print("<tr>"
				+ "<td> Username: "
				+ application.getUsername()
				+ "</td> <td>Email: "
				+ ((Application)session.getAttribute("loged")).getEmail()
				+ "</td> <td>Premium: "
				+ ((Application)session.getAttribute("loged")).getPremium()
				+ "</td></tr>");
			}
			response.getWriter().print("</table>");
		}
	}
}
