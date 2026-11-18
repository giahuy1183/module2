package ss8.quan_ly_phuong_tien.entity;

public class Car extends Vehicle {
    private String carType;
    private int seats;

    public Car(String licensePlate, Manufacturer manufacturer, int year, String owner, String carType, int seats) {
        super(licensePlate, manufacturer, year, owner);
        this.carType = carType;
        this.seats = seats;
    }

    public Car() {

    }

    @Override
    public String getType() {
        return "O to";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Kieu xe: " + carType);
        System.out.println(", So cho ngoi: " + seats);
    }
}
