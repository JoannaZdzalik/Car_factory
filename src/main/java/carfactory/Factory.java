package carfactory;

public class Factory {

    public static void main(String[] args) {
        CarProducer carProducer = new CarProducer(); //fabryka
        carProducer.produceCar("toyota", "auris", 2015, "white");
        carProducer.produceCar("toyota", "yaris", 2015, "white");
        carProducer.produceCar("toyota", "avensis", 2000, "white");
        carProducer.produceCar("toyota", "rav4", 2015, "white");
        carProducer.produceCar("toyota", "auris", 2019, "white");
        carProducer.produceCar("toyota", "yaris", 2018, "white");

    }
}
