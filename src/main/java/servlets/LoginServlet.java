package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.LoginModel;


@WebServlet()
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if(login == null || login.isEmpty() || login.isBlank() ||pass == null || pass.isEmpty() || pass.isBlank()) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "informe o Login e a Senha corretamente!");
			rd.forward(request, response);
			
		} else {
			LoginModel loginModel = new LoginModel(login, pass);
			System.out.println(loginModel);
		}
		
		
	}

}
