<%@ page import = "model.Bean.Khoa" %>
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
		SinhVien sv = (SinhVien) request.getAttribute("sv");
		List<Khoa> khoas = (ArrayList<Khoa>)request.getAttribute("khoas"); 
	%>
	<form action="CheckUpdateSinhVienServlet" method="post">
		Ma SV <input type = "text" name = "masv"><br>
		Ho Ten <input type = "text" name = "hoten"><br>
		Gioi Tinh <input type = "text" name = "gioitinh"><br>
		Khoa <select id="khoa" name="khoa">
		<% 
			for (Khoa k : khoas) {
		%>
			<option value=<%=k.getIdkhoa() %>><%=k.getTenkhoa() %></option>
		<%
			}
		%>
	</select>
	<input type = "submit" value = "Them moi">
	</form>
	<button type = "button" name = "back" onClick="history.back()">Go back</button>
</body>
</html>