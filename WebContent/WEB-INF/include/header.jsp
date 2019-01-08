<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	 $(function() {	
		 <%if (session.getAttribute("AUTH") != null) {
				String id = (String) session.getAttribute("AUTH");%>
				/* alert("로그인 성공");
				location.href="Home.jsp"; */
				$("#a").attr("href","logOutResult.jsp");
				$("#a").text("로그아웃");
				$("#b").text("<%=id%>
	환영합니다");
<%} else {%>
	/* alert("로그인 실패");
		history.go(-1); */
<%}%>
	})
</script>
<style type="text/css">
#head {
	background: black;
	height: 60px;
	line-height: 60px;
}

h3 {
	margin: 5px;
	color: white;
}
</style>
</head>
<body>
	<div id="head">
		<h3>SPMS(Simple Project Management System)</h3>
	</div>
</body>
</html>