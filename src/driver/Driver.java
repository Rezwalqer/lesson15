package driver;

public abstract class Driver {
    protected final String name;
    protected boolean licence;
    protected int experience;

    public Driver(String name, boolean licence, int experience) {
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

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licence=" + licence +
                ", experience=" + experience +
                '}';
    }
}
