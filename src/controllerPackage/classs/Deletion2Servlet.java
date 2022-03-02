package controllerPackage.classs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Deletion2Servlet
 */
@WebServlet("/Deletion")
public class Deletion2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deletion2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/deletion2.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		
		if("yes".equals(action)) {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/confirmDelete.jsp");
			dispatcher.forward(request, response);
			
		}
		
		else {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/welcomeAndExtra/FirstView.jsp");
			dispatcher.forward(request, response);
			
		}
	}

}
