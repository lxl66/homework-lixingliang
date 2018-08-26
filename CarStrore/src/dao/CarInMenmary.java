package dao;

import entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarInMenmary implements CarDAo {
    private static List<Car> CarDB = new ArrayList<>();

    static {
        Car b1 = new Car(1, "保时捷911", 900000, "黑", "德国大众汽车集团");
        Car b2 = new Car(2, "宝马z4", 800000, "蓝", "巴伐利亚机械制造厂股份公司");
        Car b3 = new Car(3, "奥迪Q4", 400000, "红", "德国大众汽车集团子公司奥迪汽车公司");
        Car b4 = new Car(4, "劳斯莱斯幻影", 5000000, "红", "劳斯莱斯汽车公司");
        Car b5 = new Car(5, "兰博基尼", 4000000, "粉", "兰博基尼汽车公司");
        Car b6 = new Car(6, "大众", 100000, "黑", "大众");
        Car b7 = new Car(7, "路虎", 120000, "绿", "路虎");
        Car b8 = new Car(8, "凯迪拉克", 70000, "银", "美国通用汽车集团");
        Car b9 = new Car(9, "法拉利", 4500000, "红", "德国大众汽车集团");


        CarDB.add(b1);
        CarDB.add(b2);
        CarDB.add(b3);
        CarDB.add(b4);
        CarDB.add(b5);
        CarDB.add(b6);
        CarDB.add(b7);
        CarDB.add(b8);
        CarDB.add(b9);
    }

    @Override
    public List<Car> listAll() {
        return CarDB;
    }

    @Override
    public  Car getCarById(int id) {
        for (Car car : CarDB) {
            if(car.getId()==id){
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getCarsByName(String name) {

        //创建一个集合
        ArrayList<Car> cars = new ArrayList<>();
        for (Car car : CarDB) {
            String realName = car.getName().toLowerCase();
            if(realName.contains(name.toLowerCase())){
                cars.add(car);
            }

        }
        return null;
    }

    @Override
    public boolean update(Car car) {
        for (Car carupdate : CarDB) {
            //根据id判断是否存在这个数据，存在则修改
            if(carupdate.getId()==car.getId()){
                carupdate.setName(car.getName());
                carupdate.setPrice(car.getPrice());
                carupdate.setColor(car.getColor());
                carupdate.setManufacturer(car.getManufacturer());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        //遍历循环取全部数据
        for (Car car : CarDB) {
            //判断取出数据的id是否为数据的id，是则删除一个数据
            if(car.getId()==id){
                return CarDB.remove(car);
            }
        }
        return false;
    }

    @Override
    public Car add(Car car) {
        return null;
    }
}
