package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class ProductWriteOkController implements Action {

   @Override
   public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
      Result result = new Result();
      ProductDAO productDAO = new ProductDAO();
      ProductVO productVO = new ProductVO();      
      
//      서비스 기능 
      productVO.setProductName(req.getParameter("productName"));
      productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice")));
      productVO.setProductStock(Integer.parseInt(req.getParameter("productStock")));

      productDAO.insert(productVO);
      
//      어디로
      result.setPath("list.product");
//      어떻게
      result.setRedirect(true);
      return result;
   
   }

}
