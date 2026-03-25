<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록 페이지</title>
</head>
<body>
	<form action = "/mvc/write-ok.post" method = "post">
		<div>
			<span>게시글 제목</span>
			<input name = "postTitle" />
		</div>
		<div>
			<span>게시글 내용</span>
			<input name = "postContent" />
		</div>
		<div>
			<span>작성 시간</span>
			<input name = "postCreateAt" />
		</div>
	<button>게시글 등록</button>
	</form>

</body>
</html>