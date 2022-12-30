package transport;

import driver.C;
import driver.DriverLicense;

public class Truck extends Transport<C> {

    public Truck(String brand, String model, double volume) {
        super(brand, model, volume);
    }

    public enum LoadCapacity {
        N1(null, 3.5f),

        N2(3.5f, 12f),
        N3(12f, null);
        private final Float from;
        private final Float to;

        LoadCapacity(Float from, Float to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            if (from == null) {
                return "Грузоподъемность автомобиля составляет " + to + " тонн.";
            } else if (to == null) {
                return "Грузоподъемность автомобиля составляет более " + from + " тонн.";
            } else {
                return "Грузоподъемность автомобиля составляет от " + from + " до " + to + " тонн.";
            }
        }
    }

    private LoadCapacity loadCapacity;
    private DriverLicense driverLicense = DriverLicense.C;


    public void start() {
        System.out.println(getBrand() + " " + getModel() + " начал движение.");
    }

    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " отсановился.");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " остановился на пит-стоп. Это заняло 5 секунд");

    }

    @Override
    public void getBestCircleTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 49 секунд");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " - 115 км/ч.");

    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }


    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public C getDriver() {
        return driver;
    }

    public void setDriver(C driver) {
        this.driver = driver;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void info() {
        System.out.println("Водитель " + getDriver().getName() + " управляет автомобилем " + getBrand() + " " + getModel() + "и будет участвовать в заезде");
    }

    @Override
    void printType() {
        System.out.println(loadCapacity.toString());
    }

    @Override
    public void getDiagnosed() {
        System.out.println("Транспортное средвство " + getBrand() + " " + getModel() + " прошло диагностику");
    }

    public void checkingLicense() throws IncorrectLicenseType {
        if (getDriver().getDriverLicense() == null) {
            throw new NullPointerException("Необходимо ввести тип прав");
        } else if (getDriver().getDriverLicense() != driverLicense) {
            throw new IncorrectLicenseType("Введите другой тип прав");
        }
    }
}
