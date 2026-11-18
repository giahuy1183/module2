package ss8.quan_ly_phuong_tien.entity;

public abstract class Vehicle {
    private String licensePlate;
    private Manufacturer manufacturer;
    private int year;
    private String owner;

    public Vehicle(String licensePlate, Manufacturer manufacturer, int year, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.year = year;
        this.owner = owner;
    }

    public Vehicle() {

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getOwner() {
        return owner;
    }

    public abstract String getType();

    public void displayInfo() {
        System.out.println(
                "Bien so: " + licensePlate
                        + ", Hang: " + manufacturer.getName()
                        + ", Nam SX: " + year
                        + ", Chu so huu: " + owner
                        + ", Loai xe: " + getType()
        );
    }

}

