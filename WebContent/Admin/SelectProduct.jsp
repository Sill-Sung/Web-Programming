<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.ArrayList" import="test.ProductDO"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="SelectProduct.css">
</head>

<body>
    <center>
        <div id="header">
            <div id="ProjectSubject">Software Distribute</div>
        </div>
        <div id="container">
            <table>
            <jsp:useBean id="ProductDAO" class="test.ProductDAO" />
            <% ArrayList<ProductDO> list = ProductDAO.SelectAllData(); %>
                <tr>
                    <th>Index</th>
                    <th>Subject</th>
                    <th>Price</th>
                    <th>Release Date</th>
                    <th>[ Edit ]</th>
                </tr>
                <% for(ProductDO data : list) {%>
                <tr>
                    <td><%=data.getPro_index() %></td>
                    <td><%=data.getPro_subject() %></td>
                    <td><%=data.getPro_price() %></td>
                    <td><%=data.getPro_release() %></td>
                    <a href = 'DataOfProduct?product_index=<%=data.getPro_index() %>'><td>view</td></a> 
                </tr>
                <%} %>
            </table>
        </div>
        <div id = "footer"></div>
    </center>
</body>

</html>