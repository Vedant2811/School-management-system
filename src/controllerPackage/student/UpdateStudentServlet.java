package controllerPackage.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.student.UpdateStudentDao;
import modelPackage.Student;

/**
 * Servlet implementation class EditStudentServlet
 */
@WebServlet("/EditStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UpdateStudentDao updateStud=new UpdateStudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  RequestDispatcher dispatcher=request.getRequestDispatcher( "/WEB-INF/views/student/EditStudent.jsp"); 
		  dispatcher.forward(request,response);
				  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException {
	  
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
				updateStud.updateStudent(student);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/finalView.jsp");
			dispatcher.forward(request, response);
	
	
	  }
	 
}
