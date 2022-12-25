import driver.B;
import driver.C;
import driver.D;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bus<driver.D> mercedes = new Bus<driver.D>("Mercedes", "Slinter II", 1.8);
        Bus<driver.D> hyundai1 = new Bus<driver.D>("Hyundai", "H350", 1.9);
        Bus<driver.D> volvo = new Bus<driver.D>("Volvo", "9500", 2.1);
        Bus<driver.D> ford = new Bus<driver.D>("Ford", "G-468", 2.2);

        Car<driver.B> lada = new Car<driver.B>("Lada", "Granta", 1.7);
        Car<driver.B> audi = new Car<driver.B>("Audi", "A8 50 L TDI quattro", 3.0);
        Car<driver.B> bmw = new Car<driver.B>("BMW", "Z8", 3.0);
        Car<driver.B> kia = new Car<driver.B>("Kia", "Sportage 4-го поколения", 2.4);

        Truck<driver.C> truck1 = new Truck<driver.C>("Mercedes-Benz", "Actros", 1.6);
        Truck<driver.C> truck2 = new Truck<driver.C>(" MAZ", "5440", 1.8);
        Truck<driver.C> truck3 = new Truck<driver.C>(" KrAZ", "6320", 1.9);
        Truck<driver.C> truck4 = new Truck<driver.C>("MAN", "TGX", 1.7);

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

        truck1.setDriver(driver3);
        truck1.info();
        lada.setDriver(driver1);
        lada.info();
        ford.setDriver(driver6);
        ford.info();
    }

}
