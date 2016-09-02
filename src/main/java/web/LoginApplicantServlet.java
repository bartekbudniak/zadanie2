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
 * Servlet implementation class LoginApplicantServlet
 */
@WebServlet("/LoginApplicantServlet")
public class LoginApplicantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginApplicantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		Application application = new DumyApplicationRepository().getApplicationByUsername(username, password);
		if(application == null){
			response.sendRedirect("login.jsp");
		}
		else{
			HttpSession session = request.getSession();
			session.setAttribute("logged", application);   
			response.sendRedirect("profil.jsp");
		}
	
	}



}
