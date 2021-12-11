package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bean.SinhVien;

public class GetAllSinhVienDAO {

	public static List<SinhVien> getAllSinhVien() throws SQLException {
		List<SinhVien> sinhviens = new ArrayList<SinhVien>();
		// Connection con = DatabaseConnection.getConnection();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				String url = "jdbc:mysql://localhost:3306/test888";
				Connection con = DriverManager.getConnection(url, "root", "");
				Statement s = con.createStatement();
				String query = "Select * from sinhvien";

				ResultSet rs = s.executeQuery(query);
				while (rs.next()) {
					String masv = rs.getString("masv");
					String hoten = rs.getString("hoten");
					String gioitinh = rs.getString("gioitinh");
					String khoa = rs.getString("khoa");
					sinhviens.add(new SinhVien(masv, hoten, gioitinh, khoa));
				}
		return sinhviens;
	}

}
