package ss8.quan_ly_phuong_tien.view;

import ss8.quan_ly_phuong_tien.controller.VehicleController;

public class ViewMain {

    public static void main(String[] args) {
        VehicleController controller = new VehicleController();
        VehicleView view = new VehicleView(controller);

        boolean flag = true;

        while (flag) {
            int choose = view.showMenu();

            switch (choose) {
                case 1:
                    view.addVehicle();
                    break;
                case 2:
                    view.displayVehicle();
                    break;
                case 3:
                    view.deleteVehicle();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }

        System.out.println("------ Ket thuc chuong trinh ------");
    }
}
