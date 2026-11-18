package ss8.quan_ly_phuong_tien.controller;

import ss8.quan_ly_phuong_tien.entity.*;
import ss8.quan_ly_phuong_tien.service.IVehicleService;
import ss8.quan_ly_phuong_tien.service.VehicleService;

public class VehicleController {

    private IVehicleService vehicleService = new VehicleService();

    public VehicleController() {
    }

    public java.util.ArrayList<Manufacturer> getHangSanXuat() {
        return vehicleService.getHangSanXuat();
    }

    public Manufacturer chooseManufacturer(int choice) {
        return vehicleService.getHangSanXuat().get(choice - 1);
    }

    public void addTruck(String licensePlate, Manufacturer manufacturer,
                         int year, String owner, double load) {
        Truck truck = new Truck(licensePlate, manufacturer, year, owner, load);
        vehicleService.addTruck(truck);
    }

    public void addCar(String licensePlate, Manufacturer manufacturer,
                       int year, String owner, String carType, int seats) {
        Car car = new Car(licensePlate, manufacturer, year, owner, carType, seats);
        vehicleService.addCar(car);
    }

    public void addMotorcycle(String licensePlate, Manufacturer manufacturer,
                              int year, String owner, double power) {
        Motorcycle motorcycle = new Motorcycle(
                licensePlate, manufacturer, year, owner, power
        );
        vehicleService.addMotorcycle(motorcycle);
    }

    public void displayTruck() {
        for (Truck truck : vehicleService.getXeTai()) {
            truck.displayInfo();
            System.out.println("--------------------");
        }
    }

    public void displayCar() {
        for (Car car : vehicleService.getOto()) {
            car.displayInfo();
            System.out.println("--------------------");
        }
    }

    public void displayMotorcycle() {
        for (Motorcycle motorcycle : vehicleService.getXeMay()) {
            motorcycle.displayInfo();
            System.out.println("--------------------");
        }
    }

    public boolean deleteVehicle(String licensePlate) {
        return vehicleService.deleteVehicle(licensePlate);
    }
}