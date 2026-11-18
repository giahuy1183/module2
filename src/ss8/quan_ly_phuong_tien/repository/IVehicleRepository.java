package ss8.quan_ly_phuong_tien.repository;

import ss8.quan_ly_phuong_tien.entity.Car;
import ss8.quan_ly_phuong_tien.entity.Manufacturer;
import ss8.quan_ly_phuong_tien.entity.Motorcycle;
import ss8.quan_ly_phuong_tien.entity.Truck;
import java.util.ArrayList;

public interface IVehicleRepository {
    ArrayList<Truck> getXeTai();

    ArrayList<Car> getOto();

    ArrayList<Motorcycle> getXeMay();

    ArrayList<Manufacturer> getHangSanXuat();

    void addTruck(Truck truck);

    void addCar(Car car);

    void addMotorcycle(Motorcycle motorcycle);

    boolean deleteVehicle(String licensePlate);
}
