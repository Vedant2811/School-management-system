package controllerPackage.classs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassOptionServlet
 */
@WebServlet("/ClassOptionServlet")
public class ClassOptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassOptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/classOption.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		if("create".equals(action)) {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/createClass.jsp");
			dispatcher.forward(request, response);
			
			//response.sendRedirect("/WEB-INF/views/student/createStudent.jsp");
			
		}
		
		else if("delete".equals(action)){
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/deleteClass.jsp");
			dispatcher.forward(request, response);
		
			//response.sendRedirect("/WEB-INF/views/student/deleteStudent.jsp");

			
		}
		
		else {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/fetchClass.jsp");
			dispatcher.forward(request, response);
			
			//response.sendRedirect("/WEB-INF/views/student/fetchStudent.jsp");

			
		}
		
	}

}
