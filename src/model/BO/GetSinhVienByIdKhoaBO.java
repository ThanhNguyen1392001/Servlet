package model.BO;

import java.sql.SQLException;
import java.util.List;

import model.Bean.SinhVien;
import model.DAO.GetSinhVienByIdKhoaDAO;

public class GetSinhVienByIdKhoaBO {

	public static List<SinhVien> getSinhVienByIdKhoa(String idKhoa) throws SQLException {
		return GetSinhVienByIdKhoaDAO.getSinhVienByIdKhoa(idKhoa);
	}

}
