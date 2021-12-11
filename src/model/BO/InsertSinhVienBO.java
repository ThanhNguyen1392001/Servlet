package model.BO;

import java.sql.SQLException;

import model.DAO.InsertSinhVienDAO;

public class InsertSinhVienBO {

	public static boolean insertSinhVien(String masv, String hoten, String gioitinh, String idkhoa) throws SQLException {
		return InsertSinhVienDAO.insertSinhVien(masv, hoten, gioitinh, idkhoa);
	}

}
