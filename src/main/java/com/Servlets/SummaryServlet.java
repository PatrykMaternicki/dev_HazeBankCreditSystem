/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import com.Services.ServiceMenager;
import com.domainModels.Credit;
import com.domainModels.Data;
import com.domainModels.Instalment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Patryk
 */
@WebServlet ("/summary")
public class SummaryServlet extends HttpServlet {
    private List<String> data = new ArrayList<String>();
    private ServiceMenager serviceMenager = new ServiceMenager();
    private List<Instalment> resultList = new ArrayList<Instalment>();
    public void doPost (HttpServletRequest request , HttpServletResponse response ) throws IOException, ServletException{
     
        data.clear();
        resultList.clear();
        data.add(request.getParameter("summaryCredit"));
        data.add(request.getParameter("stock"));
        data.add(request.getParameter("percentCredit"));
        data.add(request.getParameter("constantFee"));
        data.add(request.getParameter("select"));
        data.add(request.getParameter("getPdf"));
        buildView(response,request);
    }
    public void buildView (HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException{
        serviceMenager.setData(data);
        if (!serviceMenager.init()){
           response.sendRedirect("errorMessage");
           return;
        }
       resultList = serviceMenager.getResultList();
       if (!serviceMenager.getCredit().isHadPdf().equals("Get Pdf")){
           responseHTML(response);
           }
       else {
           responsePDF(response,request);
       }
         }
    public void responseHTML (HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
       response.setCharacterEncoding("UTF-8");
       response.getWriter().print (
               "<table>"
              + "<tbody>"
              + "<tr>"
              +"<th> Numer Raty </th>"
              +"<th> Czeœæ kapita³owa </th>"
              +"<th> Czeœæ odsetkowa</th>"
              +"<th> Op³ata sta³a </th>"
              +"<th> Wysokoœæ raty</th>"
              +"</tr>" 
       );
       for (Instalment element : resultList){
          
           response.getWriter().print(
              "<tr>"
              +"<td>"+element.getId()+"</td>"
              +"<td>"+element.getPartCapital()+"</td>"
              +"<td>"+element.getPartInterest()+"</td>"
              +"<td>"+element.getPartConstantFee()+"</td>"
              +"<td>"+element.getFinalInterest()+"</td>"
              +"</tr>"
           );
         
       }
         response.getWriter().print(
                    "</tbody>"
                    +"</table>" );
    }
    	private void responsePDF(HttpServletResponse response, HttpServletRequest request) throws ServletException,
			IOException {

		String pdfFileName = "raport.pdf";
		String contextPath = getServletContext().getRealPath("raport.pdf");
                serviceMenager.setLinkToFilePDF(contextPath);
                serviceMenager.runPdfBuilder();
               
                
		File pdfFile = new File(contextPath);
		response.setContentType("application/pdf");
                response.setCharacterEncoding("UTF-8");
		response.addHeader("Content-Disposition", "attachment; filename=" + pdfFileName);
		response.setContentLength((int) pdfFile.length());

		FileInputStream fileInputStream = new FileInputStream(pdfFile);
		OutputStream responseOutputStream = response.getOutputStream();
		int bytes;
		while ((bytes = fileInputStream.read()) != -1) {
			responseOutputStream.write(bytes);
		}

	}
}   

