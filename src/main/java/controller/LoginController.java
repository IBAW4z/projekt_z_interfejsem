import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession; 

import main.java.dao.UserDao;
import main.java.model.User; 

public class LoginController extends HttpServlet {  

    private UserDao dao;

    public LoginController() {
        super();
        dao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        //request.getRequestDispatcher("link.html").include(request, response);  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
        
		User user=new User();
		user=dao.getUserById(name, password);

        if(user.getLogin()!=null){  
			//out.print("Welcome, "+name);  
			HttpSession session=request.getSession();  
			session.setAttribute("userID",user.getUserId());
			String forward="indexuser.jsp";
			RequestDispatcher view = request.getRequestDispatcher(forward);
			view.forward(request, response);			
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("index.jsp").include(request, response);  
        }  
        out.close();  
    }  
}  