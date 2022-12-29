package transport;

import driver.B;
import driver.C;
import driver.D;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bus mercedes = new Bus("Mercedes", "Slinter II", 1.8);
        Bus hyundai1 = new Bus("Hyundai", "H350", 1.9);
        Bus volvo = new Bus("Volvo", "9500", 2.1);
        Bus ford = new Bus("Ford", "G-468", 2.2);

        Car lada = new Car("Lada", "Granta", 1.7, Car.BodyType.OFFROAD);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.COUPE);
        Car bmw = new Car("BMW", "Z8", 3.0, Car.BodyType.HETCHBACK);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, Car.BodyType.MINIVAN);

        Truck truck1 = new Truck("Mercedes-Benz", "Actros", 1.6);
        Truck truck2 = new Truck(" MAZ", "5440", 1.8);
        Truck truck3 = new Truck(" KrAZ", "6320", 1.9);
        Truck truck4 = new Truck("MAN", "TGX", 1.7);

        truck1.pitStop();
        mercedes.stop();
        hyundai1.start();
        lada.getMaxSpeed();
        truck4.getBestCircleTime();

        B driver1 = new B("Иванов Сергей Сергеевич", true, 15);
        B driver2 = new B("Иванов Степан Степанович", true, 11);
        C driver3 = new C("Иванов Иван Андреевич", true, 15);
        C driver4 = new C("Иванов Александр Сергеевич", true, 15);
        D driver5 = new D("Иванов Владимир Владимирович", true, 25);
        D driver6 = new D("Иванов Антон Антонович", true, 27);

//        truck1.setDriver(driver3);
//        truck1.info();
//        lada.setDriver(driver1);
//        lada.info();
//        ford.setDriver(driver6);
//        ford.info();
        lada.setBodyType(Car.BodyType.SIDAN);
        lada.printType();
        truck1.setLoadCapacity(Truck.LoadCapacity.N3);
        truck1.printType();
        ford.setPeopleCapacity(Bus.PeopleCapacity.SIZE1);
        ford.printType();
    }

}
