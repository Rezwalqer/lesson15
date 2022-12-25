package transport;

import driver.D;

public class Bus<D extends driver.D> extends Transport{
    private D driver;
    public Bus(String brand, String model, double volume) {
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
        System.out.println(getBrand() + " " + getModel() + " остановился на пит-стоп. Это заняло 8 секунд");

    }

    @Override
    public void getBestCircleTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 59 секунд");
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

    public void info() {
        System.out.println("Водитель " + getDriver().getName() + " управляет автомобилем "+ getBrand() + " " + getModel() +  "и будет участвовать в заезде");
    }

}
