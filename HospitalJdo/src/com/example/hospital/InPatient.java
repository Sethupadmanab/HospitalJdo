package com.example.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import javax.jdo.PersistenceManager;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class InPatient extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	 {
		String patientId=req.getParameter("patientid");
		String patientName=req.getParameter("patientname");
		String age=req.getParameter("age");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		String phoneNumber=req.getParameter("phonenumber");
		String mailId=req.getParameter("mailid");
		String wardNo=req.getParameter("wardno");
		
      PrintWriter p=resp.getWriter();
		
		/*p.println("Data is "+patientId);
		p.println("Data is "+patientName);
		p.println("Data is "+ age);
		p.println("Data is "+dob);
		p.println("Data is "+address);
		p.println("Data is "+phoneNumber);
		p.println("Data is "+mailId);
		p.println("Data is "+wardNo);*/
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		InPatientData e = new InPatientData();
		e.setPatientId(patientId);
		e.setPatientName(patientName);
		e.setPatientAge(age);
		e.setPatientDob(dob);
		e.setPatientAddress(address);
		e.setPatientPhone(phoneNumber);
		e.setPatientMail(mailId);
		e.setPatientWard(wardNo);
		try{
			pm.makePersistentAll(e);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("success");
		resp.sendRedirect("/successful.html");
		
		
		 
		
		 
}
}
