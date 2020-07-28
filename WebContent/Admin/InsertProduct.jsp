<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>

	<jsp:useBean id="ProductDO" class="test.ProductDO" />
	<jsp:setProperty property="*" name="ProductDO" />
	
	<jsp:useBean id="ProductDAO" class="test.ProductDAO" />
	<%
	try{
		ProductDAO.InsertProductData(ProductDO);
		out.println("<script>alert('insert complete'); location.href='SelectProduct.jsp';</script>");
	} catch(Exception e){
		System.out.println(e.getMessage());
	}
	%>
</body>
</html>