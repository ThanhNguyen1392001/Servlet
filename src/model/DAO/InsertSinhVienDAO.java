package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSinhVienDAO {

	public static boolean insertSinhVien(String masv, String hoten, String gioitinh, String idkhoa)
			throws SQLException {
		boolean check = false;
		try {
			// connect to database
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test888";
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement s = con.createStatement();

			// Create and execute query
			String query1 = "SELECT (tenkhoa) from khoa where idkhoa = '" + idkhoa + "'";
			ResultSet rs1 = s.executeQuery(query1);
			rs1.next();
			String tenkhoa = rs1.getString("tenkhoa");
			String query2 = "select * from sinhvien where masv = '" + masv + "'";
			ResultSet rs = s.executeQuery(query2);
			if (rs.next()) {
				check = false;
			} else {
				String query3 = "insert into sinhvien values" + "('" + masv + "', '" + hoten + "', '" + gioitinh
						+ "', '" + tenkhoa + "')";
				check = s.executeUpdate(query3) != 0;
			}
			// get data

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return check;
	}

}
