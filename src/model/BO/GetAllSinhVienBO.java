package model.BO;

import java.sql.SQLException;
import java.util.List;

import model.Bean.SinhVien;
import model.DAO.GetAllSinhVienDAO;

public class GetAllSinhVienBO {
	private GetAllSinhVienBO() {
	}

	public static List<SinhVien> getAllSinhVien() throws SQLException {
		return GetAllSinhVienDAO.getAllSinhVien();
	}

}
