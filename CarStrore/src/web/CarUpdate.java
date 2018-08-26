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

@WebServlet("/update")
public class CarUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        CarDAo carDAo = new CarInMenmary();
        Car car = carDAo.getCarById(id);
        req.setAttribute("car",car);
        req.getRequestDispatcher("jsp/car_update.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Float price = Float.parseFloat(req.getParameter("price"));
        String color = req.getParameter("color");
        String manufacturer = req.getParameter("manufacturer");
        Car car = new Car(id, name, price, color, manufacturer);
        CarDAo carDAo = new CarInMenmary();
        carDAo.update(car);
        resp.sendRedirect("/dtail?id=" + id);
    }
}
