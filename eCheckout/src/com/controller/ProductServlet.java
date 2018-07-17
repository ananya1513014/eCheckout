package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.ProductBO;
import com.dao.ProductDAO;
import com.google.gson.Gson;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductServlet() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
     {
    	String command = request.getParameter("command");
    	System.out.println(command);
    	
    	response.setContentType("application/json");
    	PrintWriter out = response.getWriter();    	
		Gson gson = new Gson();
    	
    	switch(command) {
    			case "getallprod":
    		    	try {
    		    		List<ProductBO> list = ProductDAO.viewAllProducts();
    			    	for(ProductBO product :list)
    			    	{
    			    	   String jsonStr = gson.toJson(product);
    			           out.println(jsonStr);
    			       }
    		    	} catch (ClassNotFoundException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    		    		break;
    			case "getcarpet":
    		    	try {
    		    		List<ProductBO> list = ProductDAO.viewAllCarpets();
    			    	for(ProductBO product :list)
    			    	{
    			    	   String jsonStr = gson.toJson(product);
    			           out.println("Carpet");
    			           out.println(jsonStr);
    			       }
    		    	} catch (ClassNotFoundException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    		    		break;
    			case "getshawl":
    		    	try {
    		    		List<ProductBO> list = ProductDAO.viewAllShawls();
    			    	for(ProductBO product :list)
    			    	{
    			    	   String jsonStr = gson.toJson(product);
    			           out.println(jsonStr);
    			       }
    		    	} catch (ClassNotFoundException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    		    		break;
    	}
     }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
    	
    }}