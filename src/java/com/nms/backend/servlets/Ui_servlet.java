package com.nms.backend.servlets;

import com.nms.backend.Logic.LogicController;
import com.nms.backend.model.Messages;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.JFreeChart;
 import java.awt.*;
 import java.io.*;
 import org.jfree.chart.*;
 import org.jfree.chart.axis.*; 
  import org.jfree.chart.entity.*;
 import org.jfree.chart.labels.*;
  import org.jfree.chart.plot.*;
 import org.jfree.chart.renderer.category.*; 
 import org.jfree.chart.urls.*; 
 import org.jfree.data.category.*; 
 import org.jfree.data.general.*;

public class Ui_servlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3135651835438741337L;
 protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        OutputStream out = resp.getOutputStream();
        
        try {
            resp.setContentType("image/png");
            
            JFreeChart chart = null;
            // Create your chart here...
            final double[][] data = new double[][]{
                {210, 300, 320, 265, 299},
                {200, 304, 201, 201, 340}
            };

            final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                    "Team ", "", data);

           
            BarRenderer renderer = null;
            CategoryPlot plot = null;


            final CategoryAxis categoryAxis = new CategoryAxis("Match");
            final ValueAxis valueAxis = new NumberAxis("Run");
            renderer = new BarRenderer();

            plot = new CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
            plot.setOrientation(PlotOrientation.VERTICAL);
            chart = new JFreeChart("Srore Bord", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

            chart.setBackgroundPaint(new Color(249, 231, 236));

            Paint p1 = new GradientPaint(
                    0.0f, 0.0f, new Color(16, 89, 172), 0.0f, 0.0f, new Color(201, 201, 244));
            renderer.setSeriesPaint(1, p1);

            Paint p2 = new GradientPaint(
                    0.0f, 0.0f, new Color(255, 35, 35), 0.0f, 0.0f, new Color(255, 180, 180));
            renderer.setSeriesPaint(2, p2);

            plot.setRenderer(renderer);

            
            int width = 870;
            int height = 400;
            ImageIO.write(chart.createBufferedImage(width,height), "png", out);
        } finally { 
            out.close();
        }
    } 

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                 
		String infor_path = req.getPathInfo();

		
                
//              action= "/newuser"
                
                // localhost:8080/nms/
		System.out.println(infor_path);
		if (infor_path == null) {
			resp.sendError(404);
			return;
		}
		switch (infor_path.substring(1)) {
		case "newuser":
                    LogicController.addUser( req.getParameter("fname"), req.getParameter("lname"), req.getParameter("email"));
//                    resp.getWriter().append(infor_path);
			break;
		case "newregion":
                     resp.getWriter().append("hello   guys"+ req.getParameter("test"));
//                     resp.getWriter().append("hello   guys"+ req.getParameter("regionname"));
                    try{
                    String region = req.getParameter("regionname");
                    
                    LogicController.addRegion(region);
                    }catch(NullPointerException e){ e.printStackTrace();}
			break;
		
//		case "getregion":
//                    LogicController.getRegion();
//                    
//			break;
		case "getdisttricts":
                    
                    LogicController.getDistrict();
			break;
		case "getzones":
			
                    LogicController.getZones();
		case "getdistribution":
                    
                     LogicController.getDistribution();
                     
			break;
		case "messages":
                       LogicController.getMessages();              
		case "viewcconsumption":
                    
                    LogicController.getDistribution();
			break;
		case "viewhfccconsumption2":
                    
                    LogicController.gethfcDistribution();
			break;
		case "getallstockin":
                     LogicController.getallstockin();
			break;
		case "getallstockout":
                    
                    LogicController.getallstockout();
			break;
		case "getuserMessages":
                    
                    LogicController.getuserMessages();
			break;
                case "getdistrictDistribution":
                    
                    LogicController.getdistrictDistribution();
			break;   
                case "barchart":
                    processRequest(req, resp);
			break;
                    
                    
		default:
		}


	}
      
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

             processRequest(req, resp);
            String infor_path = req.getPathInfo();

		
                
//              action= "/newuser"
                
                // localhost:8080/nms/
		System.out.println(infor_path);
		if (infor_path == null) {
			resp.sendError(404);
			return;
		}
		switch (infor_path.substring(1)) {
		
		case "newregion":
                      resp.getWriter().append("hello   guys"+ req.getParameter("test"));
//                    LogicController.addRegion(req.getParameter("regionname"));
			break;
		case "selectregion":
                  LogicController.addUser(req.getParameter("fname"), req.getParameter("lname"), req.getParameter("email"));

			break;
		case "adddistribution":
                    
                    System.out.println(req.getParameter("testkits")+"    "+req.getParameter("artenum"));
              
//                  LogicController.addDistribution(req.getParameter("healthfacility"),req.getParameter("panadol"), req.getParameter("ceptrine"),req.getParameter("testkits"), req.getParameter("gloves"), req.getParameter("artenum"),req.getParameter("coartem"), req.getParameter("cetamol"));
                  LogicController.addDistribution(req.getParameter("recieved"),req.getParameter("optionsRadios"),Integer.parseInt(req.getParameter("distributionlist")),req.getParameter("panadol"), req.getParameter("ceptrine"), req.getParameter("testkits"), req.getParameter("gloves"), req.getParameter("artenum"),req.getParameter("coartem"), req.getParameter("cetamol"));
                   
			break;
		case "normalmsg":
                    
                    LogicController.sendmessage1(req.getParameter("subject"),req.getParameter("message"),Integer.parseInt(req.getParameter("messagetype")));
			break;
		case "addhealthoff":                    
                  try{
                    LogicController.addhealthoff(req.getParameter("fname"), req.getParameter("lname"),Integer.parseInt(req.getParameter("level")), req.getParameter("username"), req.getParameter("password"),Integer.parseInt(req.getParameter("healthfac")),Integer.parseInt(req.getParameter("district")));
			}catch(NullPointerException e){ e.printStackTrace();}
			break;
		case "addhealthfacility":
                    LogicController.addHealthFacility(Integer.parseInt(req.getParameter("level")), req.getParameter("loaction"),req.getParameter("hfname") ,Integer.parseInt(req.getParameter("zone")), Integer.parseInt(req.getParameter("district")));
                    req.getRequestDispatcher("GetDistribution.jsp");
			break;
		case "adminmsg":
                    
                     LogicController.adminmessage1(req.getParameter("subject"), Integer.parseInt(req.getParameter("inout")), req.getParameter("message"), Integer.parseInt(req.getParameter("healthfac")),  Integer.parseInt(req.getParameter("type")), Integer.parseInt(req.getParameter("zone")), Integer.parseInt(req.getParameter("district")));
			break;
		case "deliverydetails":
                    LogicController.addDelivery(req.getParameter("message"), Integer.parseInt(req.getParameter("phone")), req.getParameter("exptime"), req.getParameter("datedelivered"), Integer.parseInt(req.getParameter("district")), Integer.parseInt(req.getParameter("healthfac")));
                    
			break;
		case "confirmdelivery":
                    LogicController.confirmDelivery(req.getParameter("confirm"));
                                 
                    
			break;
		case "getallstockin":
                    
                    
			break;
		case "adcategory":
			break;
		case "barchart":
                    processRequest(req, resp);
			break;
		default:
		}
		
	}
        
        
         public String getServletInfo() {
        return "Short description";
    }
}
