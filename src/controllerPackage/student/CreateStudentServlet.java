package controllerPackage.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.student.CreateStudentDao;
import modelPackage.Student;


/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/createStudent")
public class CreateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CreateStudentDao studDao=new CreateStudentDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateStudentServlet() {
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
	
		int ScholarNumber =Integer.parseInt(request.getParameter("ScholarNumber"));
		String StudentName =request.getParameter("StudentName");
		String FatherName =request.getParameter("FatherName");
		String MotherName =request.getParameter("MotherName");
		String MobileNumber =request.getParameter("MobileNumber");
		String Aadhar =request.getParameter("Aadhar");
		String Address =request.getParameter("Address");
		int ClassCode =Integer.parseInt(request.getParameter("ClassCode"));
		
		Student student=new Student();
		student.setScholarNumber(ScholarNumber);
		student.setStudentName(StudentName);
		student.setFatherName(FatherName);
		student.setMotherName(MotherName);
		student.setMobileNumber(MobileNumber);
		student.setAadhar(Aadhar);
		student.setAddress(Address);
		student.setClassCode(ClassCode);
		
		try {
			studDao.createStudent(student);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/welcomeAndExtra/finalView.jsp");
		dispatcher.forward(request, response);
		
		//response.sendRedirect("/WEB-INF/views/finalView.jsp");
		
	}

}
