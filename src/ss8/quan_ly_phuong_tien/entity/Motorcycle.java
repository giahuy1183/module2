package ss8.quan_ly_phuong_tien.entity;

public class Motorcycle extends Vehicle {
    private double power;

    public Motorcycle(String licensePlate, Manufacturer manufacturer, int year, String owner, double power) {
        super(licensePlate, manufacturer, year, owner);
        this.power = power;
    }

    public Motorcycle() {
        super();
    }

    @Override
    public String getType() {
        return "Xe may";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cong suat: " + power + " cc");
    }
}

