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
	System.out.println(products);
%>

<!-- 테이블 화면 출력 -->



</body>
</html>