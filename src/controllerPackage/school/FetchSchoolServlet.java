package controllerPackage.school;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.school.FetchSchoolDao;
import modelPackage.Class;

/**
 * Servlet implementation class FetchSchoolServlet
 */
@WebServlet("/FetchSchoolServlet")
public class FetchSchoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FetchSchoolDao fetchDao=new FetchSchoolDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchSchoolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("//WEB-INF/views/school/fetchSchool.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int schoolCode=Integer.parseInt(request.getParameter("SchoolCode"));
		List<Class> list=fetchDao.getClassBySchoolCode(schoolCode);
		
		request.setAttribute("list",list);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/school/classDataSchoolCode.jsp");
		dispatcher.forward(request, response);
	}

}
