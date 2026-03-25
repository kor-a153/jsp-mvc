<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정 페이지</title>
</head>
<body>

<%
  PostVO post = (PostVO) request.getAttribute("post");
  if (post == null) {
%>
    <h3>게시글 정보를 불러오지 못했습니다.</h3>
    <p><a href="<%=request.getContextPath()%>/list.post">목록으로</a></p>
<%
    return;
  }
  String cp = request.getContextPath();
%>

<h2>게시글 수정</h2>
<p>게시글 번호: <b><%=post.getId()%></b></p>
<hr>

<form action="<%=cp%>/update-ok.post" method="post">
  <input name="id" type="hidden" value="<%=post.getId()%>">

  <h3>게시글 제목</h3>
  <p>
    <input name="postTitle" value="<%=post.getPostTitle()%>" size="60" required />
  </p>

  <h3>게시글 내용</h3>
  <p>
    <textarea name="postContent" rows="10" cols="80" required><%=post.getPostContent()%></textarea>
  </p>

  <h3>작성 시간</h3>
  <p>
    <input value="<%=post.getPostCreateAt()%>" readonly />
  </p>

  <hr>
  <p>
    <button type="submit">게시글 수정</button>
    <a href="<%=cp%>/read.post?id=<%=post.getId()%>">취소</a>
    <a href="<%=cp%>/list.post">목록</a>
  </p>
</form>

</body>
</html>