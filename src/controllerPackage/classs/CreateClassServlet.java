package controllerPackage.classs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.classs.CreateClassDao;
import modelPackage.Class;


/**
 * Servlet implementation class CreateClass
 */
@WebServlet("/CreateClass")
public class CreateClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CreateClassDao classDao=new CreateClassDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/createStudent.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int classCode =Integer.parseInt(request.getParameter("ClassCode"));
		String className =request.getParameter("ClassName");
		String section =request.getParameter("Section");
		String classTeacher =request.getParameter("ClassTeacher");
		String coClassTeacher =request.getParameter("CoClassTeacher");
		int schoolCode =Integer.parseInt(request.getParameter("SchoolCode"));
		
		Class classs=new Class();
		classs.setClassCode(classCode);
		classs.setClassName(className);
		classs.setSection(section);
		classs.setClassTeacher(classTeacher);
		classs.setCoClassTeacher(coClassTeacher);
		classs.setSchoolCode(schoolCode);
		
		classDao.createClass(classs);
		
		//response.sendRedirect("");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/welcomeAndExtra/finalView.jsp");
		dispatcher.forward(request, response);
	}

}
