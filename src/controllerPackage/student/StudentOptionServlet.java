package controllerPackage.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentOptionServlet
 */
@WebServlet("/StudentOptionServlet")
public class StudentOptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentOptionServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/student/StudentOption.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		if("create".equals(action)) {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/student/createStudent.jsp");
			dispatcher.forward(request, response);
			
			//response.sendRedirect("/WEB-INF/views/student/createStudent.jsp");
			
		}
		
		else if("delete".equals(action)){
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/student/deleteStudent.jsp");
			dispatcher.forward(request, response);
		
			//response.sendRedirect("/WEB-INF/views/student/deleteStudent.jsp");

			
		}
		
		else {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/student/fetchStudent.jsp");
			dispatcher.forward(request, response);
			
			//response.sendRedirect("/WEB-INF/views/student/fetchStudent.jsp");

			
		}
		
	}

}
