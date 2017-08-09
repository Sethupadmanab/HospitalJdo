package com.example.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import javax.jdo.PersistenceManager;
import java.util.List;
import javax.jdo.Query;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
 

@SuppressWarnings("serial")
public class InPatientRequest extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException,ServletException
			 {
	 
		PrintWriter out=resp.getWriter();   
		String patientId1=req.getParameter("patientid");
		String patientName1=req.getParameter("patientname");
		 PersistenceManager pm = PMF.get().getPersistenceManager();
	        Query q = pm.newQuery(InPatientData.class);
	        q.setFilter("patientid == '"+ patientId1 +"' && patientname == '" +patientName1+"'");
		try {
				List<InPatientData> results = (List<InPatientData>) q.execute();
	
				System.out.println(results);
				//System.out.println(patientId1);
				/*if((patientId1.equals("")) && (UserName.equals(null))){
					resp.sendRedirect("/login.html");
				}
				else
				{*/
					if (!(results.isEmpty())) {   
						for (InPatientData p1 : results) {
	//						System.out.println(p1.getName());
	//						p.println(p1.getName());
							req.setAttribute("patientid", p1.getPatientId());
							req.setAttribute("patientname", p1.getPatientName());
							req.setAttribute("patientage", p1.getPatientAge());
							req.setAttribute("patientdob",p1.getPatientDob() );
							req.setAttribute("patientaddress", p1.getPatientAddress());
							req.setAttribute("patientphone", p1.getPatientPhone());
							req.setAttribute("patientmail", p1.getPatientMail());
							req.setAttribute("patientward", p1.getPatientWard());
							//req.setAttribute("Id", p1.getId());
							//resp.sendRedirect("/newpatient.html");
//							int i=1;
//							if(i!=0){
//								out.println("<pre>");
//								out.println(patientId1);
//								out.println(patientName1);
//								out.println("</pre>");
//							}
							
							req.getRequestDispatcher("profile.jsp").forward(req, resp);
						}
					}  
					
				} 
		
				catch( Exception e)
				{
					e.printStackTrace();
				}
		 
	}
	
  }
		
	



