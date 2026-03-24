package com.app.product.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class ProductReadController {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		 Result result = new Result() ;
		 
		 ProductDAO productDAO = new ProductDAO();
		 Read<ProductVO> products = productDAO.selectAll();
		 
		 req.setAttribute("products", products);
//		 포워드
//		 만 정의하면 됨.
		 result.setPath("/read.jsp");
		 
		 
		 
		return result;
	}
	
}

