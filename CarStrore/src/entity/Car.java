package entity;

public class Car {
    private int id;
    private String name;
    private float price;
    private String color;
    private String manufacturer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car() {

    }

    public Car(int id, String name, float price, String color, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
