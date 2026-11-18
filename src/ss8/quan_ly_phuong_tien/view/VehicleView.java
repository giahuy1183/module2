package ss8.quan_ly_phuong_tien.view;

import ss8.quan_ly_phuong_tien.controller.VehicleController;
import ss8.quan_ly_phuong_tien.entity.Manufacturer;
import java.util.Scanner;

public class VehicleView {

    private Scanner scanner = new Scanner(System.in);
    private VehicleController controller;

    public VehicleView(VehicleController controller) {
        this.controller = controller;
    }

    public int showMenu() {
        System.out.println("===== QUAN LY PHUONG TIEN =====");
        System.out.println("1. Them moi phuong tien");
        System.out.println("2. Hien thi phuong tien");
        System.out.println("3. Xoa phuong tien");
        System.out.println("4. Thoat");
        System.out.print("Nhap lua chon: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int showAddMenu() {
        System.out.println("===== THEM MOI =====");
        System.out.println("1. Them xe tai");
        System.out.println("2. Them o to");
        System.out.println("3. Them xe may");
        System.out.print("Nhap lua chon: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int showDisplayMenu() {
        System.out.println("===== HIEN THI =====");
        System.out.println("1. Xe tai");
        System.out.println("2. O to");
        System.out.println("3. Xe may");
        System.out.print("Nhap lua chon: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Manufacturer chooseManufacturer() {
        System.out.println("===== DANH SACH HANG SAN XUAT =====");

        for (int i = 0; i < controller.getHangSanXuat().size(); i++) {
            System.out.println((i + 1) + ". "
                    + controller.getHangSanXuat().get(i));
        }

        System.out.print("Chon hang san xuat: ");
        int choice = Integer.parseInt(scanner.nextLine());

        return controller.chooseManufacturer(choice);
    }

    public void addVehicle() {
        int choice = showAddMenu();

        if (choice < 1 || choice > 3) {
            System.out.println("Lua chon khong hop le!");
            return;
        }

        System.out.print("Nhap bien kiem soat: ");
        String licensePlate = scanner.nextLine();

        Manufacturer manufacturer = chooseManufacturer();

        System.out.print("Nhap nam san xuat: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap chu so huu: ");
        String owner = scanner.nextLine();

        switch (choice) {
            case 1:
                addTruck(licensePlate, manufacturer, year, owner);
                break;
            case 2:
                addCar(licensePlate, manufacturer, year, owner);
                break;
            case 3:
                addMotorcycle(licensePlate, manufacturer, year, owner);
                break;
        }
    }

    public void addTruck(String licensePlate, Manufacturer manufacturer,
                         int year, String owner) {
        System.out.print("Nhap trong tai: ");
        double load = Double.parseDouble(scanner.nextLine());

        controller.addTruck(licensePlate, manufacturer, year, owner, load);
        System.out.println("Them xe tai thanh cong!");
    }

    public void addCar(String licensePlate, Manufacturer manufacturer,
                       int year, String owner) {
        System.out.print("Nhap kieu xe (Du lich/Xe khach): ");
        String carType = scanner.nextLine();

        System.out.print("Nhap so cho ngoi: ");
        int seats = Integer.parseInt(scanner.nextLine());

        controller.addCar(licensePlate, manufacturer, year, owner,
                carType, seats);
        System.out.println("Them o to thanh cong!");
    }

    public void addMotorcycle(String licensePlate, Manufacturer manufacturer,
                              int year, String owner) {
        System.out.print("Nhap cong suat: ");
        double power = Double.parseDouble(scanner.nextLine());

        controller.addMotorcycle(licensePlate, manufacturer, year,
                owner, power);
        System.out.println("Them xe may thanh cong!");
    }

    public void displayVehicle() {
        int choice = showDisplayMenu();

        switch (choice) {
            case 1:
                controller.displayTruck();
                break;
            case 2:
                controller.displayCar();
                break;
            case 3:
                controller.displayMotorcycle();
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }

    public void deleteVehicle() {
        System.out.print("Nhap bien kiem soat can xoa: ");
        String licensePlate = scanner.nextLine();

        System.out.println("Ban co chac chan muon xoa? (Yes/No)");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("Yes")) {
            boolean result = controller.deleteVehicle(licensePlate);

            if (result) {
                System.out.println("Da xoa thanh cong!");
            } else {
                System.out.println("Khong tim thay phuong tien!");
            }
        } else {
            System.out.println("Da huy thao tac xoa!");
        }

        System.out.println("Nhan Enter de quay lai menu...");
        scanner.nextLine();
    }
}