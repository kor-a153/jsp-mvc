package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.vo.PostVO;

public class PostUpdateOkController implements Action {

   @Override
   public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
      Result result = new Result();
      
      PostDAO postDAO = new PostDAO();
      PostVO postVO = new PostVO();
      
//      화면에서 받은 값을 DB에 반영
      String id = req.getParameter("id");
      String postTitle = req.getParameter("postTitle");
      String postContent = req.getParameter("postContent");
      String postCreateAt = req.getParameter("postCreateAt");
      
      postVO.setId(Long.parseLong(id));
      postVO.setPostTitle(postTitle);
      postVO.setPostContent(postContent);
      postVO.setPostCreateAt(postCreateAt);
      
      postDAO.update(postVO);
      
//      어디로, 어떻게 정의
      result.setPath("/mvc/read.post?id=" + id);
      result.setRedirect(true);
      return result;
   }

}
