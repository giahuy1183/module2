package ss8.quan_ly_phuong_tien.entity;

public class Manufacturer {
    private String id;
    private String name;
    private String country;

    public Manufacturer(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + country;
    }
}

