package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.GetAllKhoaBO;
import model.BO.GetSinhVienByMaSvBO;
import model.Bean.Khoa;
import model.Bean.SinhVien;

@WebServlet("/UpdateSinhVienServlet")
public class UpdateSinhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateSinhVienServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String masv = request.getParameter("masv");
		try {
			SinhVien sinhvien = GetSinhVienByMaSvBO.getSinhVienByMaSv(masv);
			List<Khoa> khoas = new ArrayList<Khoa>();
			khoas = GetAllKhoaBO.getAllKhoa();
			request.setAttribute("sinhvien", sinhvien);
			request.setAttribute("khoas", khoas);
			request.getRequestDispatcher("UpdateSinhVien.jsp").forward(request, response);;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
