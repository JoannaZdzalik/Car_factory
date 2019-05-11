package carfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarSeller {
    private Client client;
    private List<Car> carsForSale;
    private List<Car> soldCars;

    public CarSeller() {
        soldCars = new ArrayList<Car>();
    }

    public void bulkCarsAdditionForSale(Car car){
        carsForSale.add(car);
    }

    public void addCarForSale(List<Car> cars){
        for (Car car : cars) {
            car.setPrice(car.getPrice() * 1.2);
            carsForSale.add(car);
        }
    }

    public void sellCar(String carModel, int year, Client client){
        for (Car car : carsForSale) {
            if (car.getModel().equals(carModel) && car.getYear() == year){
                if (client.getWallet() >= car.getPrice()){
                    car.setOwner(client.getName());
                    car.setNumber(String.valueOf(new Random().nextInt(100)));
                    soldCars.add(car);
                    carsForSale.remove(car);
                } else {
                    System.out.println("Insufficient founds");
                }
            } else {
                System.out.println("Car not found");
            }
        }
    }

    public void showCarsForSale(){
        for (Car car : carsForSale) {
            System.out.println(car);
        }
    }
}
