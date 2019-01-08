<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function() {

		$("#delet").click(function() {
			if (confirm("정말 삭제하시겠습니까?")) {
				location.href = "delet.do?no=" + $('#no').text();
			}

			return false;

		});
	})
</script>
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
#a{
	text-align: center;
	padding: 20px;
}

</style>
</head>
<body>
	<header>
		<jsp:include page="include/header.jsp" flush="false" />
	</header>
	<div id="a">
		<td id="no">${projManagement.proj_no }</td>
		<table>
			<tr>
				<td>프로젝트 이름</td>
				<td>${projManagement.proj_name }</td>
			</tr>
			<tr>
				<td>프로젝트 내용</td>
				<td>${projManagement.proj_cont }</td>
			</tr>
			<tr>
				<td>시작날짜</td>
				<td>${projManagement.start_date }</td>
			</tr>
			<tr>
				<td>종료날짜</td>
				<td>${projManagement.end_date }</td>
			</tr>
			<tr>
				<td>진행상태</td>
				<td>${projManagement.progress }</td>
			</tr>
		</table>
	<a href="List.do">[목록]</a>
	<a href="update.do?no=${projManagement.proj_no }">[수정]</a>
	<a href="delet.do?no=${projManagement.proj_no }">[삭제]</a>
	<footer>
	</div>
		<jsp:include page="include/footer.jsp" flush="false" />
	</footer>
</body>
</html>