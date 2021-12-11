package model.BO;

import java.sql.SQLException;

import model.Bean.Account;
import model.DAO.CheckLoginDAO;

public class CheckLoginBO {
	private CheckLoginBO() {
	}

	public static Account checkLogin(String username, String password) throws SQLException {
		return CheckLoginDAO.checkLogin(username, password);
	}
}
