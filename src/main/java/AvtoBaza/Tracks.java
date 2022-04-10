package AvtoBaza;

public class Tracks {
    private int id;
    private String name;
    private String driver;
    private String status;

    public Tracks(int id, String name, String driver, String status) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.status = status;
    }

    public Tracks() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tracks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver='" + driver + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
