package com.College.search;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.NewStudent;
import com.CollegeMS.bean.Student;
import com.CollegeMS.util.SEManger;

public class SearchStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sno=req.getParameter("sno");
		String Sname=req.getParameter("sname");
		if(Sname==null){
			Sname="";
		}
		else{
			Sname="%"+Sname+"%";
		}
		if(Sno==null){
			Sno="";
		}
		else{
			Sno="%"+Sno+"%";
		}
		System.out.println(Sno);
		System.out.println(Sname);
		SEManger seManger= new SEManger();
		List<Student> student =seManger.getPartStudent(Sno,Sname);
		req.setAttribute("student",student );
		req.getRequestDispatcher("StudentManger/StudentMessage.jsp").forward(req,
				resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
