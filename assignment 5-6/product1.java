package assignment5_6;

public class product1 {
    private  int productid;
    private String name ;
    private  double price;
    private  int stock;

    public product1(int productid, String name, double price, int stock) {
        this.productid = productid;
        this.name  = name;
        setPrice(price);
        setStock(stock);
    }

    public int getProductid() {
        return productid;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }
    public void setName(String name) {
        this.name = name;

    }
    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
        else{
            throw new IllegalArgumentException("price cannot be negative");
        }
    }
    public void setStock(int stock) {
        if(stock >= 0) {
            this.stock = stock;
        }
        else{
            throw new IllegalArgumentException("stock cannot be negative");
        }
    }
}


