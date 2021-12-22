package models;

public class CarCP {
   private String color;
   private int price;
   private int quantity;

    public CarCP(String color, int price, int quantity) {
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "\n \n color='" + color + '\'' +
                "; \n price=" + price +
                "; \n quantity=" + quantity
                +"\n";
    }
}
