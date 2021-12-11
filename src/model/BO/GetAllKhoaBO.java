package model.BO;

import java.sql.SQLException;
import java.util.List;

import model.Bean.Khoa;
import model.DAO.GetAllKhoaDAO;

public class GetAllKhoaBO {

	public static List<Khoa> getAllKhoa() throws SQLException {
		return GetAllKhoaDAO.getAllKhoa();
	}

}
