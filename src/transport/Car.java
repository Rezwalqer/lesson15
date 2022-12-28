package transport;

import driver.B;

import java.time.LocalDate;

public class Car extends Transport<B> {
    private B driver;

    @Override
    public B getDriver() {
        return driver;
    }

    public void setDriver(B driver) {
        this.driver = driver;
    }

    public Car(String brand, String model, double volume) {
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
    public void getBestCircleTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 41 секунд");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " - 195 км/ч.");
    }

    public void info() {
        System.out.println("Водитель " + getDriver().getName() + " управляет автомобилем "+ getBrand() + " " + getModel() +  "и будет участвовать в заезде.");
    }

}
