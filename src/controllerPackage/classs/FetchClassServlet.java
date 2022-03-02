
package controllerPackage.classs;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.classs.FetchClassDao;
import modelPackage.Student;

/**
 * Servlet implementation class FetchClass
 */
@WebServlet("/FetchClass")
public class FetchClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FetchClassDao fetchClass=new FetchClassDao();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/fetchClass.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.sendRedirect("/WEB-INF/views/class/studentDataClassCode.jsp");
		
		int classCode=Integer.parseInt(request.getParameter("classCode"));
		List<Student> list=fetchClass.getStudentByClassCode(classCode);
		
		
		request.setAttribute("list",list);
		

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/studentDataClassCode.jsp");
		dispatcher.forward(request, response);
	}

}
