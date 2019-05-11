package carfactory;

public class Factory {

    public static void main(String[] args) {
        CarProducer carProducer = new CarProducer(); //fabryka

        carProducer.produceCar("toyota", "auris", 2015, "white", 870);
        carProducer.produceCar("toyota", "yaris", 2015, "white", 870);
        carProducer.produceCar("toyota", "avensis", 2000, "white", 870);
        carProducer.produceCar("toyota", "rav4", 2015, "white", 870);
        carProducer.produceCar("toyota", "auris", 2019, "white", 870);
        carProducer.produceCar("toyota", "yaris", 2018, "white", 870);

        Client client = new Client("Jacek", 1000);

        CarSeller carSeller = new CarSeller();

        carSeller.addCarForSale(carProducer.getAvailableCars());

        carSeller.showCarsForSale();

        carSeller.sellCar("auris", 2019, client);

        carSeller.showCarsForSale();

        carSeller.showCarsForSale();
    }
}
