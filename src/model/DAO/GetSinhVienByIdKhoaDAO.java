package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bean.SinhVien;

public class GetSinhVienByIdKhoaDAO {

	public static List<SinhVien> getSinhVienByIdKhoa(String idKhoa) throws SQLException {
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
				String query1 = "SELECT (tenkhoa) from khoa where idkhoa = '"+ idKhoa +"'";
				ResultSet rs1 = s.executeQuery(query1);
				rs1.next();
				String tenkhoa = rs1.getString("tenkhoa");
				String query2 = "Select * from sinhvien where khoa = '" + tenkhoa +"'";

				ResultSet rs2 = s.executeQuery(query2);
				while (rs2.next()) {
					String masv = rs2.getString("masv");
					String hoten = rs2.getString("hoten");
					String gioitinh = rs2.getString("gioitinh");
					String khoa1 = rs2.getString("khoa");
					sinhviens.add(new SinhVien(masv, hoten, gioitinh, khoa1));
				}
		return sinhviens;
	}

}
