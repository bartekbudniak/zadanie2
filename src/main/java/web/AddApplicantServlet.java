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
 * Servlet implementation class AddApplicantServlet
 */
@WebServlet("/AddApplicantServlet")
public class AddApplicantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Application retriveApplicationFromRequest(HttpServletRequest request){
		Application result = new Application();
		result.setUsername(request.getParameter("username"));
		result.setPassword(request.getParameter("password"));
		result.setEmail(request.getParameter("email"));
		result.setPremium("zwykle");
		return result;
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddApplicantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		HttpSession session = request.getSession();
		//if(session.getAttribute("conf") != null){
		//	response.sendRedirect("profil.jsp");
		//}
		
		Application application = retriveApplicationFromRequest(request);
		ApplicationRepository repository = new DumyApplicationRepository();
		session.setAttribute("conf", application);   //klucz, wartoœæ
		
		repository.add(application);
		response.sendRedirect("profil.jsp");
	}



}
