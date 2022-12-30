package transport;

import driver.Driver;

import javax.tools.DiagnosticCollector;

public abstract class Transport<T extends Driver> implements Competitive {
    protected final String brand;
    protected final String model;

    protected final double volume;
    protected T driver;

    public Transport(String brand, String model, double volume) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (volume <= 0) {
            this.volume = Math.abs(volume);
        } else {
            this.volume = volume;
        }
    }

    public abstract void start();

    public abstract void stop();

    public abstract void pitStop();

    public abstract void getBestCircleTime();

    public abstract void getMaxSpeed();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    abstract void info();

    abstract void printType();

    public abstract void getDiagnosed() throws DiagnosticException;



}

