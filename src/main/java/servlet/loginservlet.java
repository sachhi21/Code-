package servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Userdatabase;
import user.Userlogin;

/**
 * servlet implementation class loginservlet
 */
@WebServlet("/login")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Userlogin userlogin = new Userlogin();
		userlogin.setUsername(username);
		userlogin.setPassword(password);
		Userdatabase userdatabase = new Userdatabase();
		
		
		if (userdatabase.validate(userlogin))
		{
			response.sendRedirect("loginsuccess.jsp");
			
		}
		else 
		{
			//HttpSession session = request.getSession();
			
			response.sendRedirect("login.jsp");
			
		}
		
	}

}
