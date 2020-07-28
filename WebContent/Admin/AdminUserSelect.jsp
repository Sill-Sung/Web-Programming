<%@page language = "java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@page import = "test.MemberDO" %>
<%@page import = "java.util.ArrayList" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="AdminUserSelect.css">
</head>

<body>
    <center>
        <div id="header">
            <div id="ProjectSubject">Software Distribute</div>
        </div>

        <div id="container">
            <table>
                <tr>
                    <td class="tableTop">회원등급</td>
                    <td class="tableTop">이름</td>
                    <td class="tableTop">ID</td>
                    <td class="tableTop">Birthday</td>
                    <td class="tableTop">성별</td>
                    <td class="tableTop">주소</td>
                    <td class="tableTop">연락처</td>
                    <td class="tableTop">E-mail</td>
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
                </tr>
                <% } %>
            
            </table>
        </div>
        <div id="footer"></div>
    </center>
</body>

</html>