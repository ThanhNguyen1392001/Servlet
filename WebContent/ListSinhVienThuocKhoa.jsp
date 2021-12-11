<%@ page import = "model.Bean.SinhVien" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		List<SinhVien> sinhviens = (ArrayList<SinhVien>)request.getAttribute("sinhviens"); 
	%>
	<table border="1"  width="100%" style = "text-align: center">
		<caption>Danh sach sinh vien</caption>
		<tr>
			<th>MSV</th>
			<th>Ho va ten</th>
			<th>Gioi tinh</th>
			<th>Khoa</th>
			<th>Sua</th>
			<th>Xoa</th>
		</tr>
		<% 
			for (SinhVien s : sinhviens) {
		%>
		<tr>
			<th><%= s.getMasv()%></th>
			<th><%= s.getHoten() %></th>
			<th><%= s.getGioitinh() %></th>
			<th><%= s.getKhoa() %></th>
			<th><a href = "UpdateSinhVienServlet">xxx</a></th>
			<th><a href = "RemoveSinhVienServlet">...</a></th>
		</tr>
		<%
			}
		%>
	</table>
	<button type = "button" name = "back" onClick="history.back()">Go back</button>
</body>
</html>