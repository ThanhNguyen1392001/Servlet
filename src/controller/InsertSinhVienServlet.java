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
import model.Bean.Khoa;

@WebServlet("/InsertSinhVienServlet")
public class InsertSinhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertSinhVienServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Khoa> khoas = new ArrayList<Khoa>();
		try {
			khoas = GetAllKhoaBO.getAllKhoa();
			request.setAttribute("khoas", khoas);
			request.getRequestDispatcher("InsertSinhVien.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
