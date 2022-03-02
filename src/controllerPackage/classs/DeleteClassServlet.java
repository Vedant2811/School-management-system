package controllerPackage.classs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.classs.DeleteClassDao;

/**
 * Servlet implementation class DeleteClass
 */
@WebServlet("/DeleteClass")
public class DeleteClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private DeleteClassDao delDao=new DeleteClassDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/deleteClass.jsp");
		dispatcher.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int classCode=Integer.parseInt(request.getParameter("ClassCode"));
		
		int del=delDao.deleteClass(classCode);
				
		if(del==0) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/welcomeAndExtra/finalView.jsp");
			dispatcher.forward(request, response);
		}
		
		else {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/class/deletion2.jsp");
			dispatcher.forward(request, response);
		}
	}

}
