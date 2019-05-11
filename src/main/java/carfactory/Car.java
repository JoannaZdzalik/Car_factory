package carfactory;

public class Car {

    private String number;
    private int price;
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
}
