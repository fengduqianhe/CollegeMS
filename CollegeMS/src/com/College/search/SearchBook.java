package com.College.search;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Book;
import com.CollegeMS.bean.Student;
import com.CollegeMS.util.SEManger;

public class SearchBook extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String major=req.getParameter("major");
		String name=req.getParameter("name");
		String message=req.getParameter("message");
		
		System.out.println(major);
		System.out.println(name);
		System.out.println(message);
		
		if(major==null){
			major="";
		}
		else{
			major="%"+major+"%";
		}
		if(name==null){
			name="";
		}
		else{
			name="%"+name+"%";
		}
		if(message==null){
			message="";
		}
		else{
			message="%"+message+"%";
		}
		System.out.println(major);
		System.out.println(name);
		System.out.println(message);
		
		SEManger seManger= new SEManger();
		List<Book> book =seManger.getPartBook(major, name, message);
		req.setAttribute("book",book);
		req.getRequestDispatcher("BookManger/BookMessage.jsp").forward(req,
				resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
