<%@ page import = "model.Bean.SinhVien" %>
<%@ page import = "model.Bean.Khoa" %>
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
		List<Khoa> khoas = (ArrayList<Khoa>)request.getAttribute("khoas"); 
	%>
	<form action="GetKhoaByIdKhoaServlet" method = "post">
		<select id="khoa" name="khoa">
		<% 
			for (Khoa k : khoas) {
		%>
			<option value=<%=k.getIdkhoa() %>><%=k.getTenkhoa() %></option>
		<%
			}
		%>
	</select>
	<input type = "submit" value = "Xem">
	</form>
	<a href = "InsertSinhVienServlet">Them moi</a>
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
			<th><a href = "CheckUpdateSinhVienServlet?masv=<%= s.getMasv()%>">xxx</a></th>
			<th><a href = "CheckRemoveSinhVienServlet?masv=<%= s.getMasv()%>">...</a></th>
		</tr>
		<%
			}
		%>
	</table>
	<button type = "button" name = "back" onClick="history.back()">Go back</button>
</body>
</html>