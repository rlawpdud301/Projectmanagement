<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="">
table {
	border-collapse: collapse;
	border: 1px solid black;
	width: 900px;
	text-align: center;
	margin: 0 auto;
}
td,th{
	border: 1px solid black;
}
#table >a{
	float: right;
}
</style>
</head>
<body>
	<header>
		<jsp:include page="include/header.jsp" flush="false" />
	</header>
		
			

	<div id="table">
	<a href="insert.do">[새 프로젝트 등록]</a>
		<table>		
			<tr>
				<th>프로젝트이름</th>
				<th>시작날짜</th>
				<th>종료날짜</th>
				<th>상태</th>
			</tr>
			<c:forEach items="${list }" var="projManagement">
				<tr>
					<td><a href="read.do?no=${projManagement.proj_no }">${projManagement.proj_name }</a></td>
					<td>${projManagement.start_date }</td>
					<td>${projManagement.end_date }</td>
					<td>${projManagement.progress }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<footer>
		<jsp:include page="include/footer.jsp" flush="false" />
	</footer>
</body>
</html>