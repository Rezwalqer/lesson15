package driver;

public abstract class Driver {
    protected final String name;
    protected boolean licence;
    protected int experience;
    protected DriverLicense driverLicense;

    public Driver(String name, boolean licence, int experience, DriverLicense driverLicense) {
        if (name == null || name.isEmpty()) {
            this.name = "Иванов Иван Иванович";
        } else {
            this.name = name;
        }
        this.licence = licence;
        if (experience <= 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
        this.driverLicense = driverLicense;
    }

    public void toTopUp() {
    }

    public void stopDriving() {
    }

    public void startDriving() {
    }

    public String getName() {
        return name;
    }

    public boolean isLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licence=" + licence +
                ", experience=" + experience +
                '}';
    }


}


