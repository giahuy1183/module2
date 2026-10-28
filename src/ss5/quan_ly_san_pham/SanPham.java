package ss5.quan_ly_san_pham;

public class SanPham {
    private int id;
    private String name;
    private float price;

    public SanPham() {

    }

    public SanPham(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getInfo() {
        return "Ma san pham: " + this.id + " Ten san pham: " + this.name + " Gia thanh: " + this.price+" VND";
    }
}
