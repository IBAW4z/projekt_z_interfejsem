import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession; 

import main.java.dao.UserDao;
import main.java.model.User;
import main.java.model.MD5; 

public class RegisterController extends HttpServlet {  

    private UserDao dao;
	private MD5 md5;

    public RegisterController() {
        super();
        dao = new UserDao();
		md5 = new MD5();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        //request.getRequestDispatcher("link.html").include(request, response);  
          
        String email=request.getParameter("email");  
        String password=request.getParameter("password");  
        String password2=request.getParameter("password2"); 
		
		User user=new User();
		user=dao.getUserById(email, password);

        if(email!=null && password.equals(password2)){
			user.setLogin(email);
			user.setPassword(md5.getMD5(password));
			dao.addUser(user);
			out.print("Added");
        }  
        else{  
            out.print("Sorry, something went wrong. Try again.");  
            request.getRequestDispatcher("register.jsp").include(request, response);  
        }  
        out.close();  
    }  
}  