<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입-나용</title>
</head>
<body>
    <h3>회원가입</h3>
    <form action="/views/member/memeberJoin.jsp" method="post">
		<fieldset>
			<legend>회원 가입</legend>
			회원 ID : <input type="text" name="userId" placeholder="ID를 입력하세요"><br>
			비밀 번호 : <input type="password" name="userPwd" placeholder="PW를 입력하세요"><br>
			비밀 번호(re) : <input type="password" name="userPwd_re" placeholder="PW를 재입력하세요"><br>
			이름 : <input type="text" name="userName" placeholder="이름을 입력하세요"><br>
			나이 : <input type="text" name="age" size=3>세<br>
			이메일 : <input type="email" name="email" size=30 placeholder="@ 형식의 이메일을 입력하세요"><br>
			휴대폰 : <input type="text" name="phone" placeholder="폰번호를 입력하세요"><br>
			주소 : <input type="text" name="address" placeholder="주소를 입력하세요"><br>
			성별 : <input type="radio" name="gender" value="M" checked>남 
			<input type="radio" name="gender" value="F">여<br>
			<input type="submit" value="가입하기" id="joinBtn"> <input type="reset" value="다시 입력하기"><br><br>
			<a href="/">메인 페이지로 돌아가기</a>
		</fieldset>
	
	</form>
		
</body> 
</html>
