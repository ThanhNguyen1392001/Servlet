package model.BO;

import java.sql.SQLException;

import model.Bean.SinhVien;
import model.DAO.GetSinhVienByMaSvDAO;

public class GetSinhVienByMaSvBO {

	public static SinhVien getSinhVienByMaSv(String masv) throws SQLException {
		return GetSinhVienByMaSvDAO.getSinhVienByMaSv(masv);
	}

}
