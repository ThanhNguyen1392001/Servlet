package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Bean.SinhVien;

public class GetSinhVienByMaSvDAO {

	public static SinhVien getSinhVienByMaSv(String masv) throws SQLException {

		SinhVien sv = null;
		
		try {
			// connect to database
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement s = con.createStatement();

			// Create and execute query
			String query = "select * from sinhvien where masv = '" + masv + "'";
			ResultSet rs = s.executeQuery(query);

			// get data
			while (rs.next()) {
				String gioitinh = rs.getString("gioitinh");
				String hoten = rs.getString("hoten");
				String khoa = rs.getString("khoa");
				sv = new SinhVien(masv, hoten, gioitinh, khoa);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return sv;
	}

}
