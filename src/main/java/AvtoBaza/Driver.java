package AvtoBaza;

public class Driver {
    private long id;
    private String name;
    private String bus;

    public Driver(long id, String name, String bus) {
        this.id = id;
        this.name = name;
        this.bus = bus;
    }

    public Driver() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}
