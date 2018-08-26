package web;

import dao.CarDAo;
import dao.CarInMenmary;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dtail")
public class CarDtail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        CarDAo carDAo = new CarInMenmary();
        Car car = carDAo.getCarById(id);
        req.setAttribute("car",car);
        req.getRequestDispatcher("jsp/car_dtail.jsp").forward(req,resp);
    }
}
