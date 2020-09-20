package com.pack;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		 response.setContentType("text/html");
         PrintWriter pw=response.getWriter();
         String Fname=request.getParameter("fname");
         pw.println("First Name: "+Fname+"<br/>");
         String Lname=request.getParameter("lname");
         System.out.println("Last Name: "+Lname);
         String addr=request.getParameter("address");
         System.out.println("Address: "+addr);
         String Emailid=request.getParameter("email");
         System.out.println("Email ID:"+Emailid);
         String City=request.getParameter("city");
         System.out.println("City:"+City);
         String State=request.getParameter("state");
         System.out.println("State: "+State);
         String Petname=request.getParameter("petname");
         System.out.println("PetName:"+Petname);
          long Phone=Long.parseLong(request.getParameter("phone"));
         System.out.println("Phone Number:"+Phone);      
         String Pettype=request.getParameter("pettype");
         System.out.println("PetType:"+Pettype);
         int Petage=Integer.parseInt(request.getParameter("petage"));
         System.out.println("PetAge:"+Petage);
         Connection con=null;
         try
         {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcservlet1","student","kowsi2712");
        	 PreparedStatement ps=con.prepareStatement("insert into PetRegister(Fname,Lname,addr,Emailid,City,State,Petname,Phone,Pettype,Petage)values(?,?,?,?,?,?,?,?,?,?)");
        	ps.setString(1,Fname);
        	ps.setString(2, Lname);
        	ps.setString(3, addr);
        	ps.setString(4,Emailid);
        	ps.setString(5,City);
        	ps.setString(6, State);
        	ps.setString(7, Petname);
        	ps.setLong(8, Phone);
        	ps.setString(9, Pettype);
        	ps.setInt(10, Petage);
        	int i=ps.executeUpdate();
        	if(i==1)
        	{
        		RequestDispatcher rd=request.getRequestDispatcher("/Success.html");
        		rd.forward(request,response);
        	}
        	
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
	}

}
