package main.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
	
import main.java.dao.FridgeDao;
import main.java.model.Fridge;

public class FridgeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT_PRODUCT = "fridge.jsp";
    private static String LIST_FRIDGE = "listFridge.jsp";
    private FridgeDao dao;

    public FridgeController() {
        super();
        dao = new FridgeDao();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);  
        if(session!=null){
			String forward="";
			String action = request.getParameter("action");
			System.out.println("a: " + action);
			try{
			int ID= (Integer) session.getAttribute("userID");
			//System.out.println("ID: " + ID);
			if (action!=null && action.equalsIgnoreCase("delete")){
				int productId = Integer.parseInt(request.getParameter("productId"));
				dao.deleteProduct(productId);
				forward = LIST_FRIDGE;			
				request.setAttribute("products", dao.getAllProducts(ID));
			} else if (action!=null && action.equalsIgnoreCase("edit")){
				forward = INSERT_OR_EDIT_PRODUCT;
				int productId = Integer.parseInt(request.getParameter("productId"));
				Fridge fridge = dao.getProductById(productId);
				request.setAttribute("fridge", fridge);
			} else if (action!=null && action.equalsIgnoreCase("listFridge")){
				forward = LIST_FRIDGE;
				request.setAttribute("products", dao.getAllProducts(ID));
			} else {
				forward = INSERT_OR_EDIT_PRODUCT;
			}

			RequestDispatcher view = request.getRequestDispatcher(forward);
			view.forward(request, response);
			}
			catch (Exception e){
				System.out.println("Login first");
				request.getRequestDispatcher("index.jsp").include(request, response); 
			};
		}
		else{  
            System.out.println("Please login first");  
            request.getRequestDispatcher("index.jsp").include(request, response);  
        }  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);  
        if(session!=null){
			int ID= (Integer) session.getAttribute("userID");
			//System.out.println("ID post: " + ID);
			Fridge fridge = new Fridge();
			fridge.setName(request.getParameter("name"));
			try {
				int amount = Integer.parseInt(request.getParameter("amount"));
				fridge.setAmount(amount);
			} catch (Exception e) {
				e.printStackTrace();
			};
			fridge.setUserID(ID);
			String productId = request.getParameter("productId");
			if(productId == null || productId.isEmpty())
			{
				dao.addProduct(fridge);
			}
			else
			{
				fridge.setProductID(Integer.parseInt(productId));
				dao.updateFridge(fridge);
			}
			RequestDispatcher view = request.getRequestDispatcher(LIST_FRIDGE);
			request.setAttribute("products", dao.getAllProducts(ID));
			view.forward(request, response);
		}
		else{  
		System.out.println("Please login first");  
		request.getRequestDispatcher("index1.jsp").include(request, response);  
		}  
	}
}


