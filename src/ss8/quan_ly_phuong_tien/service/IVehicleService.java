package ss8.quan_ly_phuong_tien.service;

import ss8.quan_ly_phuong_tien.entity.*;
import java.util.ArrayList;

public interface IVehicleService {
    ArrayList<Truck> getXeTai();

    ArrayList<Car> getOto();

    ArrayList<Motorcycle> getXeMay();

    ArrayList<Manufacturer> getHangSanXuat();

    void addTruck(Truck truck);

    void addCar(Car car);

    void addMotorcycle(Motorcycle motorcycle);

    boolean deleteVehicle(String licensePlate);
}
