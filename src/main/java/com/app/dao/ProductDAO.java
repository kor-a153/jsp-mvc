package com.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.ProductVO;

public class ProductDAO {
   public SqlSession sqlSession;
   
   public ProductDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public void insert(ProductVO productVO) {
      sqlSession.insert("product.insert", productVO);
   };
   
   public List<ProductVO> selectAll() {
      List<ProductVO> products = sqlSession.selectList("product.selectAll");
      return products;
      
      public List<ProductVO> selectAll() {
    	  List<ProductVO> products = sqlSession.selectList("product.selectAll");
    	  return products;
    	  
	  public Read<ProductVO> select(Long id) {
		  Read<ProductVO> products = sqlSession.selectRead("product.selectAll");
		  return products;
		  
	  public Read<ProductVO> select() {
		  Read<ProductVO> products = sqlSession.selectRead("product.selectAll");
		  return products;
   }
}
