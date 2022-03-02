package controllerPackage.WelcomeServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daoPackage.extra.ForgotCredentialDao;
import modelPackage.NewAccount;

/**
 * Servlet implementation class ForgotCredentialServlet
 */
@WebServlet("/ForgotCredentialServlet")
public class ForgotCredentialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ForgotCredentialDao forgotDao=new ForgotCredentialDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotCredentialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/login/ForgotCredentials.jsp");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mobile=request.getParameter("mobile");
		
		List<NewAccount> list=forgotDao.getDataByMobileNumber(mobile);
		
		request.setAttribute("list",list);
		
		HttpSession session=request.getSession();
		session.setAttribute("mobile", mobile);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/login/ForgottenData.jsp");
		dispatcher.forward(request, response);
		
	}

}
