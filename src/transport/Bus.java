package transport;

import driver.D;

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

    public void info() {
        System.out.println("Водитель " + getDriver().getName() + " управляет автомобилем "+ getBrand() + " " + getModel() +  "и будет участвовать в заезде");
    }

}
