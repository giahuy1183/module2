package ss8.quan_ly_phuong_tien.entity;

public class Truck extends Vehicle {
    private double load;

    public Truck(String licensePlate, Manufacturer manufacturer, int year, String owner, double load) {
        super(licensePlate, manufacturer, year, owner);
        this.load = load;
    }

    public Truck() {

    }

    @Override
    public String getType() {
        return "Xe tai";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Trong tai: " + load + " tan");
    }
}

