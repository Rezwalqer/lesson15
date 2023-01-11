package transport;

import driver.*;
import mechanic.Mechanic;
import org.w3c.dom.ls.LSOutput;
import transport.Bus;
import transport.Car;
import transport.Truck;

import java.util.*;

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

        List<Transport> allTransort = new ArrayList<>(); // Список всех автомобилей
        Collections.addAll(allTransort, mercedes, hyundai1, volvo, lada, audi, bmw, kia, truck1, truck2, truck3, truck4);

        truck1.pitStop();
        mercedes.stop();
        hyundai1.start();
        lada.getMaxSpeed();
        truck4.getBestCircleTime();

        B driver1 = new B("Иванов Сергей Сергеевич", true, 15, DriverLicense.B);
        B driver2 = new B("Иванов Степан Степанович", true, 11, DriverLicense.D);
        C driver3 = new C("Иванов Иван Андреевич", true, 15, DriverLicense.B);
        C driver4 = new C("Иванов Александр Сергеевич", true, 15, DriverLicense.C);
        D driver5 = new D("Иванов Владимир Владимирович", true, 25, DriverLicense.D);
        D driver6 = new D("Иванов Антон Антонович", true, 27, null);
        List<Driver> allDrivers = new ArrayList<>();

        truck1.setDriver(driver3);
        truck1.info();
        lada.setDriver(driver1);
        lada.info();
        ford.setDriver(driver6);
        ford.info();
        lada.setBodyType(Car.BodyType.SIDAN);
        lada.printType();
        truck1.setLoadCapacity(Truck.LoadCapacity.N3);
        truck1.printType();
        ford.setPeopleCapacity(Bus.PeopleCapacity.SIZE1);
        ford.printType();

//        lada.getDiagnosed();
//        truck1.getDiagnosed();
//        try {
//            ford.getDiagnosed();
//        } catch (DiagnosticException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            truck1.checkingLicense();
//        } catch (IncorrectLicenseType | NullPointerException e) {
//            System.out.println(e.getMessage());
//            ;
//        }
        Mechanic mechanic1 = new Mechanic("Иванов Иван Иванович", "Компания 1", CarType.B, CarType.D, CarType.C);
        Mechanic mechanic2 = new Mechanic("Иванов Олег Иванович", "Компания 2", CarType.B, CarType.C);
        Mechanic mechanic3 = new Mechanic("Иванов Сергей Иванович", "Компания 3", CarType.D, CarType.C);
        Mechanic mechanic4 = new Mechanic("Иванов Андрей Иванович", "Компания 4",  CarType.C);
        List<Mechanic> allMechanics = new ArrayList<>();
        Collections.addAll(allMechanics, mechanic1, mechanic2, mechanic3, mechanic4);


        List<Mechanic> ladaMechanics = new ArrayList<>();//список всех механиков, обслуживающих одну машину (Ладу)
        List<Mechanic> bmwMechanics = new ArrayList<>(); //список всех механиков, обслуживающих BMW.
        List<String> mechanic1Autos = new ArrayList<>(); // Все автомобили, которые обслуживает определенный механик
        List<String> mechanic2Autos = new ArrayList<>(); // Все автомобили, которые обслуживает определенный механик

        lada.addMechanic(mechanic1, ladaMechanics, mechanic1Autos);
        lada.addMechanic(mechanic2, ladaMechanics, mechanic2Autos);
        bmw.addMechanic(mechanic1,bmwMechanics, mechanic1Autos);
        System.out.println(ladaMechanics);
        System.out.println(mechanic1Autos);
        System.out.println(mechanic2Autos);
        System.out.println();
        mechanic1.fixAuto(lada);

        Map<Transport, Mechanic> transportMechanicMap = new HashMap<>();
        transportMechanicMap.put(lada, mechanic1);
        transportMechanicMap.put(lada, mechanic1); // для проверки;
        transportMechanicMap.put(bmw, mechanic2);
        transportMechanicMap.put(truck1, mechanic3);
        transportMechanicMap.put(ford, mechanic4);
        System.out.println(transportMechanicMap);


    }

}
