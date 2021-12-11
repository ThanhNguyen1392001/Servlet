package model.BO;

import java.sql.SQLException;

import model.DAO.UpdateSinhVienDAO;

public class UpdateSinhVienBO {

	public static boolean updateSinhVien(String masv, String hoten, String gioitinh, String idkhoa) throws SQLException {
		return UpdateSinhVienDAO.updateSinhVien( masv,  hoten,  gioitinh,  idkhoa);
	}

}
