<%@page import="com.app.vo.PostVO"%>
<%@page import="java.util.List"%>
<%@page import="com.app.vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 페이지</title>
</head>
<body>

<%
   List<ProductVO> products = (List<ProductVO>)request.getAttribute("products");
   List<PostVO> posts = (List<PostVO>)request.getAttribute("posts");

   if(products == null) products = java.util.Collections.emptyList();
   if(posts == null) posts = java.util.Collections.emptyList();

   System.out.println(products);
   System.out.println(posts);
%>
<!-- 
   테이블 화면 출력
-->

   <table border="1">
   <tr>
      <th>상품번호</th>
      <th>상품명</th>
      <th>상품가격</th>
      <th>상품재고</th>
   </tr>
   <%
      for(ProductVO product : products) {
   %>
      <tr>
         <td><%=product.getId() %></td>
         <td>
            <a href="/mvc/read.product?id=<%=product.getId() %>">
               <%=product.getProductName() %>
            </a>
         </td>
         <td><%=product.getProductPrice() %></td>
         <td><%=product.getProductStock() %></td>
      </tr>
   <% 
      }
   %>
   </table>
   
   
      <table border="1">
   <tr>
      <th>게시글 번호</th>
      <th>게시글 제목</th>
      <th>게시글 내용</th>
      <th>작성시간</th>
   </tr>
   <%
      for(PostVO post : posts) {
   %>
      <tr>
         <td><%=post.getId() %></td>
         <td>
            <a href="/mvc/read.post?id=<%=post.getId() %>">
               <%=post.getPostTitle() %>
            </a>
         </td>
         <td><%=post.getPostContent() %></td>
        <td><%= post.getPostCreateAt() %></td>
      </tr>
   <% 
      }
   %>
   </table>

</body>
</html>