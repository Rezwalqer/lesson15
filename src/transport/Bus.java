package transport;

import driver.D;
import driver.DriverLicense;

public class Bus extends Transport<D>{

    public Bus(String brand, String model, double volume) {
        super(brand, model, volume);
    }

    public enum PeopleCapacity {
        SIZE1(null, 10),
        SIZE2(null, 25),
        SIZE3(40, 50),
        SIZE4(60, 80),
        SIZE5(100, 120);
        private final Integer from;
        private final Integer to;

        PeopleCapacity(Integer from, Integer to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            if (from == null) {
                return "Автобус данного типа вмещает в себя до  " + to + " человек.";
            } else {
                return "Автобус данного типа вмещает в себя от " + from + " до " + to + " человек.";
            }
        }
    }

    private PeopleCapacity peopleCapacity;
    private DriverLicense driverLicense = DriverLicense.D;

    public void start() {
        System.out.println(getBrand() + " " + getModel() + " начал движение.");
    }

    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " отсановился.");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " остановился на пит-стоп. Это заняло 8 секунд");

    }

    @Override
    void printType() {
        System.out.println(peopleCapacity.toString());
    }

    @Override
    public void getBestCircleTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 59 секунд");
    }

    public PeopleCapacity getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(PeopleCapacity peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " - 102 км/ч.");

    }

    @Override
    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void info() {
        System.out.println("Водитель " + getDriver().getName() + " управляет автомобилем "+ getBrand() + " " + getModel() +  "и будет участвовать в заезде");
    }

    @Override
    public void getDiagnosed() throws DiagnosticException {
        try {
            throw new DiagnosticException("Транспортное средство не подлежит диагностике");
        } catch (DiagnosticException e) {
            System.out.println(e.getMessage());
        }
    }
    public void checkingLicense() throws IncorrectLicenseType{
        if (getDriver().getDriverLicense() == null) {
            throw new NullPointerException("Необходимо ввести тип прав");
        } else if (getDriver().getDriverLicense() != driverLicense) {
            throw new IncorrectLicenseType("Введите другой тип прав");
        }
    }
}
