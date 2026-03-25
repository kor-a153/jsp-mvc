package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.PostVO;

public class PostDAO {
   public SqlSession sqlSession;
   
   public PostDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public void insert(PostVO postVO) {
      sqlSession.insert("Post.insert", postVO);
   };
   
   public List<PostVO> selectAll() {
      List<PostVO> post = sqlSession.selectList("post.selectAll");
      return post;
   }
   
   public Optional<PostVO> select(Long id) {
      PostVO post = sqlSession.selectOne("post.select", id);
      return Optional.ofNullable(post);
   }

   public void update(PostVO postVO) {
      sqlSession.update("post.update", postVO);
   }
   
   public void delete(Long id) {
	   sqlSession.delete("post.delete", id);
   }
}
