package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Bean.Account;

public class CheckLoginDAO {
	private CheckLoginDAO() {
	}

	public static Account checkLogin(String username, String password) throws SQLException {
		Account a = null;

		// Connection con = DatabaseConnection.getConnection();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/test888";
		Connection con = DriverManager.getConnection(url, "root", "");
		Statement s = con.createStatement();
		String query = "Select * from account where username = '" + username + "' and password = '" + password + "'";

		ResultSet rs = s.executeQuery(query);
		while (rs.next()) {
			String usn = rs.getString("username");
			String pwd = rs.getString("password");
			a = new Account(usn, pwd);
		}

		return a;
	}
}
