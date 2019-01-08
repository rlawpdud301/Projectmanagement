<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<jsp:include page="include/header.jsp" flush="false" />
	</header>
	<form action="update.do" method="post" id="f1">
		<input type="hidden" value="${projManagement.proj_no }" name="proj_no">
		<p>
			<label>프로젝트 이름</label> <input type="text"
				value="${projManagement.proj_name }" name="proj_name">

		</p>
		<p>
			<label>프로젝트 내용</label> <input type="text"
				value="${projManagement.proj_cont }" name="proj_cont">
		</p>
		<p>
			<label>시작날짜</label> <input type="text"
				value="${projManagement.start_date }" name="start_date">
		</p>
		<p>
			<label>종료날짜</label> <input type="text"
				value="${projManagement.end_date }" name="end_date">
		</p>
		<p>
			<label>상태</label> 
			<select name="progress">
				<option value="준비">준비</option>
				<option value="진행중">진행중</option>
				<option value="종료">종료</option>
				<option value="보류">보류</option>
			</select>
		</p>
		<p>
			<input type="submit" value="수정"> <input type="reset"
				value="취소">
		</p>
	</form>

	<footer>

		<jsp:include page="include/footer.jsp" flush="false" />
	</footer>
</body>
</html>