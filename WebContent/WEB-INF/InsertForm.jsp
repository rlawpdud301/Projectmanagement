<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
label {
	width: 120px;
	float: left;
}

.error, .error2 {
	color: red;
	font-size: 12px;
	display: none;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<header>
		<jsp:include page="include/header.jsp" flush="false" />
	</header>
	<form action="insert.do" method="post" id="f1">
		<p>
			<label>프로젝트이름</label> <input type="text" name="proj_name">
		</p>
		<p>
			<label>프로젝트 내용</label>
			<textarea rows="10" cols="50" name="proj_cont"></textarea>

		</p>
		<p>
			<label>시작 날짜</label> <input type="text" name="start_date">

		</p>
		<p>
			<label>마감 날짜</label> <input type="text" name="end_date">

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
			<input type="submit" value="저장"> 
			<input type="reset"	value="취소">
		</p>
	</form>
	<footer>
		<jsp:include page="include/footer.jsp" flush="false" />
	</footer>
</body>
</html>