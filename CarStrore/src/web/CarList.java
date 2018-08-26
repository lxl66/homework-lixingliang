package web;

import dao.CarDAo;
import dao.CarInMenmary;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CarList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CarDAo cardao = new CarInMenmary();
        List<Car> cars = cardao.listAll();
        req.setAttribute("cars",cars);
        req.getRequestDispatcher("jsp/car_list.jsp").forward(req,resp);
    }
}
