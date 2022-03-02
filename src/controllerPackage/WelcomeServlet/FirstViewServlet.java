package controllerPackage.WelcomeServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstViewServlet
 */
@WebServlet("/FirstViewServlet")
public class FirstViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/welcomeAndExtra/FirstView.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		if("student".equals(action)) {
			
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/student/StudentOption.jsp");
			dispatcher.forward(request, response);
			
			//response.sendRedirect("/WEB-INF/views/StudentOption.jsp");
		}
		
		else if("class".equals(action)){
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/classOption.jsp");
			dispatcher.forward(request, response);
		}
		
		else if("school".equals(action)) {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/school/schoolOption.jsp");
			dispatcher.forward(request, response);		}
	}
	
}
