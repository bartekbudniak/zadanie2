package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Application;
import repositories.ApplicationRepository;
import repositories.DumyApplicationRepository;

/**
 * Servlet implementation class ProfilApplicantServlet
 */
@WebServlet("/ProfilApplicantServlet")
public class ProfilApplicantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilApplicantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
	
		((Application)session.getAttribute("logged")).getPassword();
		response.getWriter().print("<h1>Profil:</h1>"
				+ "<p> Username: "
				+ ((Application)session.getAttribute("loged")).getUsername()
				+ "</p> <p>Email: "
				+ ((Application)session.getAttribute("loged")).getEmail()
				+ "</p> <p>Premium: "
				+ ((Application)session.getAttribute("loged")).getPremium()
				+ "</p>");
	}



}
