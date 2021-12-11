package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bean.Khoa;

public class GetAllKhoaDAO {

	public static List<Khoa> getAllKhoa() throws SQLException {
		List<Khoa> khoas = new ArrayList<Khoa>();
		// Connection con = DatabaseConnection.getConnection();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				String url = "jdbc:mysql://localhost:3306/test888";
				Connection con = DriverManager.getConnection(url, "root", "");
				Statement s = con.createStatement();
				String query = "Select * from khoa";

				ResultSet rs = s.executeQuery(query);
				while (rs.next()) {
					String idkhoa = rs.getString("idkhoa");
					String tenkhoa = rs.getString("tenkhoa");
					khoas.add(new Khoa(idkhoa, tenkhoa));
				}
		return khoas;
	}

}
