package com.College.buy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Student;
import com.College.buy.*;
/**
 * 支付计算机等级考试费用
 * @author me
 *
 */
public class BuyMaexam extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sno=req.getParameter("sno");
		Integer macost=Integer.parseInt(req.getParameter("macost"));
		BuyRegister buyRegister=new BuyRegister();
		Student student=buyRegister.GetCard(Sno);
		int card=student.getCard();
		if(card-macost>0)
		{
			System.out.println(card-macost);
			int num=buyRegister.UpdateCard(Sno, card-macost);
			if(num>0){
				req.getRequestDispatcher("Users/BuyScuess.jsp").forward(req, resp);
			}
		}
		else{
			System.out.println(card-macost);
			System.out.println("欠费");
			req.getRequestDispatcher("Users/BuyFailure.jsp").forward(req, resp);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
