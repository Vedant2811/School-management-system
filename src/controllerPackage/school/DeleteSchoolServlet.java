package controllerPackage.school;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.school.DeleteSchoolDao;

/**
 * Servlet implementation class DeleteSchoolServlet
 */
@WebServlet("/DeleteSchool")
public class DeleteSchoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DeleteSchoolDao delDao=new DeleteSchoolDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSchoolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/school/deleteSchool.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int schoolCode=Integer.parseInt(request.getParameter("SchoolCode"));
		
		delDao.deleteSchool(schoolCode);
				
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/finalView.jsp");
		dispatcher.forward(request, response);
		
	}

}
