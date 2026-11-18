package ss8.quan_ly_phuong_tien.service;

import ss8.quan_ly_phuong_tien.entity.*;
import ss8.quan_ly_phuong_tien.repository.IVehicleRepository;
import ss8.quan_ly_phuong_tien.repository.VehicleRepository;
import java.util.ArrayList;

public class VehicleService implements IVehicleService {

    private IVehicleRepository vehicleRepository = new VehicleRepository();

    @Override
    public ArrayList<Truck> getXeTai() {
        return vehicleRepository.getXeTai();
    }

    @Override
    public ArrayList<Car> getOto() {
        return vehicleRepository.getOto();
    }

    @Override
    public ArrayList<Motorcycle> getXeMay() {
        return vehicleRepository.getXeMay();
    }

    @Override
    public ArrayList<Manufacturer> getHangSanXuat() {
        return vehicleRepository.getHangSanXuat();
    }

    @Override
    public void addTruck(Truck truck) {
        vehicleRepository.addTruck(truck);
    }

    @Override
    public void addCar(Car car) {
        vehicleRepository.addCar(car);
    }

    @Override
    public void addMotorcycle(Motorcycle motorcycle) {
        vehicleRepository.addMotorcycle(motorcycle);
    }

    @Override
    public boolean deleteVehicle(String licensePlate) {
        return vehicleRepository.deleteVehicle(licensePlate);
    }
}
