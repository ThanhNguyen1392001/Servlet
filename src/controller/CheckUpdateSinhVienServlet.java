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

import model.BO.GetAllKhoaBO;
import model.BO.GetAllSinhVienBO;
import model.BO.UpdateSinhVienBO;
import model.Bean.Khoa;
import model.Bean.SinhVien;

@WebServlet("/CheckUpdateSinhVienServlet")
public class CheckUpdateSinhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckUpdateSinhVienServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String masv = request.getParameter("masv");
			String hoten = request.getParameter("hoten");
			String gioitinh = request.getParameter("gioitinh");
			String idkhoa = request.getParameter("khoa");

			if (UpdateSinhVienBO.updateSinhVien(masv, hoten, gioitinh, idkhoa)) {
				List<SinhVien> sinhviens = new ArrayList<SinhVien>();
				List<Khoa> khoas = new ArrayList<Khoa>();
				khoas = GetAllKhoaBO.getAllKhoa();
				sinhviens = GetAllSinhVienBO.getAllSinhVien();
				request.setAttribute("sinhviens", sinhviens);
				request.setAttribute("khoas", khoas);
				request.getRequestDispatcher("Home.jsp").forward(request, response);
			} else {
				response.sendRedirect("InsertSinhVien.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
