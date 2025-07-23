package assignment1;

public class product {
    public String productid;
    public String name;
    public double price;
    public int stockquantity;
    public String category;

    public product (String productid, String name, double price, int stockquantity, String category) {
     this.productid = productid;
     this.name = name;
     this.price = price;
     this.stockquantity = stockquantity;
     this.category = category;
         if ( this.stockquantity < 0 ) {
            stockquantity = 0;
        }
    }

    public String getProductid() {
        return productid;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
     return price;
    }
    public int getStockquantity() {
     return stockquantity;
    }
    public String getCategory() {
     return category;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (this.price < 0) {
            throw  new IllegalArgumentException( "Price cannot be negative." );
        }
        this.price = price;
    }
    public void setStockquantity(int stockquantity) {
        if (this.stockquantity < 0) {
            throw  new IllegalArgumentException( "Stockquantity cannot be negative." );
        }
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isinstock() {
        return stockquantity > 0;
    }
    public boolean reducestock(int quantity) {
        if (quantity <= stockquantity) {
            stockquantity -= quantity;
            return true;
        }
        return false;
    }
    public void addstock(int quantity) {
        if (quantity >=0) {
            stockquantity += quantity;
        }
    }
    @Override
    public String toString() {
        return "productid: " + this.productid + " -- name: " + this.name+
                " -- price: " + this.price + " -- stockquantity: " + this.stockquantity +
                " -- category: " + this.category;
    }


}


