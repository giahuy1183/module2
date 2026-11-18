package ss8.quan_ly_phuong_tien.repository;

import ss8.quan_ly_phuong_tien.entity.*;
import java.util.ArrayList;

public class VehicleRepository implements IVehicleRepository {

    private ArrayList<Truck> xeTai = new ArrayList<>();
    private ArrayList<Car> oto = new ArrayList<>();
    private ArrayList<Motorcycle> xeMay = new ArrayList<>();
    private ArrayList<Manufacturer> hangSanXuat = new ArrayList<>();

    public VehicleRepository() {
        hangSanXuat.add(new Manufacturer("HSX-001", "Yamaha", "Nhat Ban"));
        hangSanXuat.add(new Manufacturer("HSX-002", "Honda", "Nhat Ban"));
        hangSanXuat.add(new Manufacturer("HSX-003", "Dongfeng", "Trung Quoc"));
        hangSanXuat.add(new Manufacturer("HSX-004", "Huyndai", "Han Quoc"));
        hangSanXuat.add(new Manufacturer("HSX-005", "Ford", "My"));
        hangSanXuat.add(new Manufacturer("HSX-006", "Toyota", "Nhat Ban"));
        hangSanXuat.add(new Manufacturer("HSX-007", "Hino", "Nhat Ban"));
    }

    @Override
    public ArrayList<Truck> getXeTai() {
        return xeTai;
    }

    @Override
    public ArrayList<Car> getOto() {
        return oto;
    }

    @Override
    public ArrayList<Motorcycle> getXeMay() {
        return xeMay;
    }

    @Override
    public ArrayList<Manufacturer> getHangSanXuat() {
        return hangSanXuat;
    }

    @Override
    public void addTruck(Truck truck) {
        xeTai.add(truck);
    }

    @Override
    public void addCar(Car car) {
        oto.add(car);
    }

    @Override
    public void addMotorcycle(Motorcycle motorcycle) {
        xeMay.add(motorcycle);
    }

    @Override
    public boolean deleteVehicle(String licensePlate) {
        for (int i = 0; i < xeTai.size(); i++) {
            if (xeTai.get(i).getLicensePlate().equals(licensePlate)) {
                xeTai.remove(i);
                return true;
            }
        }

        for (int i = 0; i < oto.size(); i++) {
            if (oto.get(i).getLicensePlate().equals(licensePlate)) {
                oto.remove(i);
                return true;
            }
        }

        for (int i = 0; i < xeMay.size(); i++) {
            if (xeMay.get(i).getLicensePlate().equals(licensePlate)) {
                xeMay.remove(i);
                return true;
            }
        }

        return false;
    }
}
