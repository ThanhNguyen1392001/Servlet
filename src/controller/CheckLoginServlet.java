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

import model.BO.CheckLoginBO;
import model.BO.GetAllKhoaBO;
import model.BO.GetAllSinhVienBO;
import model.Bean.Account;
import model.Bean.Khoa;
import model.Bean.SinhVien;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckLoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Account a;
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			a = CheckLoginBO.checkLogin(username, password);
			if (a == null) {
				response.sendRedirect("Login.jsp");
			} else {
				request.getSession().setAttribute("account", a);
				List<SinhVien> sinhviens = new ArrayList<SinhVien>();
				List<Khoa> khoas = new ArrayList<Khoa>();
				khoas = GetAllKhoaBO.getAllKhoa();
				sinhviens = GetAllSinhVienBO.getAllSinhVien();
				request.setAttribute("sinhviens", sinhviens);
				request.setAttribute("khoas", khoas);
				request.getRequestDispatcher("Home.jsp").forward(request, response);
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
