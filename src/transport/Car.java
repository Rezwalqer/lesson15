package transport;

import driver.B;
import driver.DriverLicense;
import mechanic.MechanicCategory;

import java.time.LocalDate;

public class Car extends Transport<B> {
    private final CarType mechanicCategory = CarType.B;
    public enum BodyType {
        SIDAN("Сидан"),
        HETCHBACK("Хэчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }


        @Override
        public String toString() {
            return "Тип кузова: " + bodyType;
        }
    }

    private BodyType bodyType;
    private DriverLicense driverLicense = DriverLicense.B;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public B getDriver() {
        return driver;
    }

    public CarType getMechanicCategory() {
        return mechanicCategory;
    }

    public void setDriver(B driver) {
        this.driver = driver;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Car(String brand, String model, double volume, BodyType bodyType) {
        super(brand, model, volume);
    }

    public void start() {
        System.out.println(getBrand() + " " + getModel() + " начал движение.");
    }

    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " отсановился.");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " остановился на пит-стоп. Это заняло 6 секунд");

    }

    @Override
    void printType() {
        System.out.println(bodyType.toString());
    }

    @Override
    public void getBestCircleTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 41 секунд");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " - 195 км/ч.");
    }

    public void info() {
        System.out.println("Водитель " + getDriver().getName() + " управляет автомобилем " + getBrand() + " " + getModel() + "и будет участвовать в заезде.");
    }

    @Override
    public void getDiagnosed() {
        System.out.println("Транспортное средвство " + getBrand() + " " + getModel() + " прошло диагностику");
    }


    public void checkingLicense() throws IncorrectLicenseType{
        if (getDriver().getDriverLicense() == null) {
            throw new NullPointerException("Необходимо ввести тип прав");
        } else if (getDriver().getDriverLicense() != driverLicense) {
            throw new IncorrectLicenseType("Введите другой тип прав");
        }
    }
}
