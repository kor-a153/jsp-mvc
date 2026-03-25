package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.vo.PostVO;

public class PostWriteOkController implements Action {

   @Override
   public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
      Result result = new Result();
      PostDAO postDAO = new PostDAO();
      PostVO postVO = new PostVO();      
      
//      서비스 기능 
      postVO.setPostTitle(req.getParameter("postTilte"));
      postVO.setPostContent(req.getParameter("postContent"));
      postVO.setPostCreateAt(req.getParameter("postCreateAt"));

      postDAO.insert(postVO);
      
//      어디로
      result.setPath("list.post");
//      어떻게
      result.setRedirect(true);
      return result;
   
   }

}
