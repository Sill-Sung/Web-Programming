<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="test.MemberDO"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select and Update</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>회원등급</th>
				<th>이름</th>
				<th>ID</th>
				<th>Birthday</th>
				<th>성별</th>
				<th>주소</th>
				<th>연락처</th>
				<th>E-mail</th>
				<th>수정여부</th>
			</tr>
			<%-- MemberDAO의 인스턴스를 만든 것과 다름없음 --%>
			<jsp:useBean id="dao" class="test.MemberDAO" />
			<%
				ArrayList<MemberDO> list = dao.getMemberlist();
			                    for(MemberDO mb : list){
			%>
			<tr>
				<td><%=mb.getUserGrade() %></td>
				<td><%=mb.getUserName() %></td>
				<td><%=mb.getUserId() %></td>
				<td><%=mb.getUserBirth() %></td>
				<td><%=mb.getUserSex() %></td>
				<td><%=mb.getUserAddress() %></td>
				<td><%=mb.getUserPhone() %></td>
				<td><%=mb.getUserEmail() %></td>
				<td><input type = "button" value ="button" onclick = "location.href='updatemember.jsp?id=<%=mb.getUserId() %>'"/></td>
			</tr>
			<% } %>
		</table>
	</div>
</body>
</html>