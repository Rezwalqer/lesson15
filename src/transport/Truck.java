package transport;

import driver.C;

public class Truck<C extends driver.C> extends Transport{
    private C driver;
    public Truck(String brand, String model, double volume) {
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

    @Override
    public C getDriver() {
        return driver;
    }

    public void setDriver(C driver) {
        this.driver = driver;
    }

    public void info() {
        System.out.println("Водитель " + getDriver().getName() + " управляет автомобилем "+ getBrand() + " " + getModel() +  "и будет участвовать в заезде");
    }



}
