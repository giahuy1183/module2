package ss5.quan_ly_san_pham;

public class QuanLySanPham {
    private SanPham[] spList = new SanPham[100];

    public void showSp() {
        for (int i = 0; i < spList.length; i++) {
            if (spList[i] != null) {
                System.out.println(spList[i].getInfo());
            } else {
                break;
            }
        }
    }

    public void addSp(SanPham sp) {
        for (int i = 0; i < spList.length; i++) {
            if (spList[i] == null) {
                spList[i] = sp;
                break;
            }
        }
    }

    public void deleteSp(int deleteId) {
        for (int i = 0; i < spList.length; i++) {
            if (spList[i] != null) {
                if (spList[i].getId() == deleteId) {
                    for (int j = i; j < spList.length - 1; j++) {
                        spList[j] = spList[j + 1];
                    }
                }
            } else {
                break;
            }
        }
    }

    public void searchSp(int searchId) {
        for (int i = 0; i < spList.length; i++) {
            if (spList[i] == null) {
                break;
            }
            if (spList[i].getId() == searchId) {
                System.out.println(spList[i].getInfo());
                return;
            }
        }
        System.out.println("Khong tim thay san pham!");
    }

    public void editSp(int editId, String newName, float newPrice) {
        for (int i = 0; i < spList.length; i++) {
            if (spList[i] == null) {
                break;
            }
            if (spList[i].getId() == editId) {
                spList[i].setName(newName);
                spList[i].setPrice(newPrice);
                return;
            }
        }
        System.out.println("Khong tim thay san pham!");
    }

}
