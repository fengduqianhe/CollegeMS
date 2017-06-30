package com.College.search;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.NewStudent;
import com.CollegeMS.util.SDBmanger;
import com.CollegeMS.util.SEManger;

public class SearchNewStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sname=req.getParameter("search");
		if(Sname==null){
			Sname="";
		}
		else{
			Sname="%"+Sname+"%";
		}
		SEManger seManger= new SEManger();
		List<NewStudent> newstudent =seManger.getPartNewStudent(Sname);
		req.setAttribute("newstudent", newstudent);
		req.getRequestDispatcher("NewStudentManger/NewStudentMessage.jsp").forward(req,
				resp);
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}
	
}
