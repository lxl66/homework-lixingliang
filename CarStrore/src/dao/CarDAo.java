package dao;

import entity.Car;

import java.util.List;

public  interface CarDAo {
    List<Car> listAll();
    Car getCarById(int id);
    List<Car> getCarsByName(String name);
    boolean update(Car car);
    boolean delete(int id);
    Car add(Car car);
}
