package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.GetSinhVienByIdKhoaBO;
import model.Bean.SinhVien;

@WebServlet("/GetKhoaByIdKhoaServlet")
public class GetKhoaByIdKhoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetKhoaByIdKhoaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idKhoa = request.getParameter("khoa");
		List<SinhVien> sinhviens = new ArrayList<SinhVien>();
		try {
			sinhviens = GetSinhVienByIdKhoaBO.getSinhVienByIdKhoa(idKhoa);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("sinhviens", sinhviens);
		request.getRequestDispatcher("ListSinhVienThuocKhoa.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
