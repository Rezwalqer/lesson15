package mechanic;

import transport.CarType;
import transport.Transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mechanic {
    private final String name;
    private String company;
    private List<CarType> carTypes;
    private List<Transport> transports;

    public Mechanic(String name, String company, CarType... carTypes) {
        this.name = name;
        this.company = company;
        this.carTypes = new ArrayList<>();
        Collections.addAll(this.carTypes, carTypes);
    }

    public void carryOutMaintenance(Transport transport) {
        System.out.println(this.getName() + " произвел теходслуживание у автомобиля " + transport.getBrand() + " " + transport.getModel());
    }

    public void fixAuto(Transport transport) {
        System.out.println(this.getName() + " отремонтировал автомобиль " + transport.getBrand() + " " + transport.getModel());
    }

    public String getName() {
        return name;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    public List<CarType> getCarTypes() {
        return carTypes;
    }

    public void setCarTypes(List<CarType> carTypes) {
        this.carTypes = carTypes;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "Имя механика: " + name + '\'' +
                ", компания: " + company + '\'' +
                ", категория авто: " + carTypes +
                '}';
    }
}
