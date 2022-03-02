package controllerPackage.school;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.school.CreateSchoolDao;
import modelPackage.School;

/**
 * Servlet implementation class CreateSchoolServlet
 */
@WebServlet("/CreateSchool")
public class CreateSchoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CreateSchoolDao schoolDao=new CreateSchoolDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSchoolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/school/createSchool.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int schoolCode =Integer.parseInt(request.getParameter("SchoolCode"));
		String schoolName =request.getParameter("SchoolName");
		String principalName =request.getParameter("PrincipalName");
		String vicePrincipalName =request.getParameter("VicePrincipalName");
		
		School school=new School();
		school.setSchoolCode(schoolCode);
		school.setSchoolName(schoolName);
		school.setPrincipalName(principalName);
		school.setVicePrincipalName(vicePrincipalName);
		
		schoolDao.createSchool(school);
		
		//response.sendRedirect("");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/finalView.jsp");
		dispatcher.forward(request, response);
	}

}
