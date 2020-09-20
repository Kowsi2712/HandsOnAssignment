package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;

/**
 * Servlet implementation class LoginServlet1
 */
//@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	    PrintWriter pw=response.getWriter();
	    String username=request.getParameter("username");
	    String password=request.getParameter("password");
	      
	    try
	    {
	    	Connection con=null;
		    ResultSet rs;
	     	con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcservlet2","student","kowsi2712");
	    	PreparedStatement ps=((java.sql.Connection) con).prepareStatement("select * from loginvalidation where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            rs=ps.executeQuery();
            int i=ps.executeUpdate();
            if(rs.next())
            {
            	if(i==1)
            	{
                  RequestDispatcher rd1=request.getRequestDispatcher("./SuccessLogin.html");
                  rd1.include(request,response);
            	}
            	
	        }
            else
        	{
        		 RequestDispatcher rd2=request.getRequestDispatcher("./Error.html");
                 rd2.include(request,response);
        	}
            	            
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	}
}
