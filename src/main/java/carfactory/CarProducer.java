package carfactory;

import java.util.ArrayList;
import java.util.List;

public class CarProducer {


    private Car car;
    private List<Car> producedCars;

    public CarProducer() {
        producedCars = new ArrayList<Car>();
    }

    public void produceCar(String brand, String model, int year, String colour, int price) {
        producedCars.add(new Car(brand, model, year, colour, price));
    }

    public List<Car> getAvailableCars(){
        return producedCars;
    }
}
