package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSinhVienDAO {

	public static boolean updateSinhVien(String masv, String hoten, String gioitinh, String idkhoa)
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
			String query = "update nhanvien set hoten = '" + hoten + "', gioitinh = '" + gioitinh + "', khoa = '"
					+ tenkhoa + " where masv = '" + masv + "'";
			check = s.executeUpdate(query) != 0;

			// get data

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return check;
	}

}
