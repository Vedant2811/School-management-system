package controllerPackage.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.student.FetchStudentDao;
import modelPackage.Student;

/**
 * Servlet implementation class FetchStudentServlet
 */
@WebServlet("/FetchStudentServlet")
public class FetchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FetchStudentDao fetchStud=new FetchStudentDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/student/fetchStudent.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int scholar=Integer.parseInt(request.getParameter("ScholarNumber"));
		
		Student s= fetchStud.getStudentByScholarNumber(scholar);
		
		request.setAttribute("list",s);
		
		response.sendRedirect("/WEB-INF/views/student/StudentOnlyData.jsp");
		
	}

}
