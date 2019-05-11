package carfactory;

public class Car {

    private String number;
    private double price;
    private String owner;
    private String brand;
    private String model;
    private int year;
    private String colour;


    public Car(String number, int price, String owner) {
        this.number = number;
        this.price = price;
        this.owner = owner;
    }

    public Car(String brand, String model, int year, String colour, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price=price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Brand " + this.brand + " model " + this.model + " year " + this.year + " Price " + this.price;
    }
}
