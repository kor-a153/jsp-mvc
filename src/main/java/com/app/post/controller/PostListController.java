package com.app.post.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.vo.PostVO;

public class PostListController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		 Result result = new Result() ;
		 PostDAO postDAO = new PostDAO();
		 
		 List<PostVO> posts = postDAO.selectAll();
		 
		 req.setAttribute("posts", posts);
//		 포워드
		 result.setPath("/list.jsp");
		 
		 
		 
		return result;
	}

}
