package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.dao.ProductDAO;
import com.app.post.exception.PostNotFoundException;

public class PostUpdateController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		
		Long id = Long.parseLong(req.getParameter("id"));
		req.setAttribute("post", postDAO.select(id).orElseThrow(PostNotFoundException::new));
		
//		포워드, 어디로
		result.setPath("/update.jsp");
		
		return result;
	}

}
