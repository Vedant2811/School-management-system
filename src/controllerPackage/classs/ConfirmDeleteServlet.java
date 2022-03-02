package controllerPackage.classs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.classs.DeleteClassDao;
import daoPackage.student.DeleteStudentDao;

/**
 * Servlet implementation class ConfirmDeleteServlet
 */
@WebServlet("/ConfirmDelete")
public class ConfirmDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

	private DeleteStudentDao delStudDao=new DeleteStudentDao();
	private DeleteClassDao delDao=new DeleteClassDao();

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/confirmDelete.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		int classCode=Integer.parseInt(request.getParameter("classcode"));
		
		delStudDao.deleteStudentClassCode(classCode);
		delDao.deleteClass(classCode);

		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/welcomeAndExtra/finalView.jsp");
		dispatcher.forward(request, response);
		
	}

}
