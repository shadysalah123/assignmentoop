package assignment1;

public class bookproduct extends product {

    private String author;

    public bookproduct (String productid, String name, double price, int stockquantity, String category, String author) {
        super(productid,name,price,stockquantity,category);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return  super.toString() + " -- the author is : " +author ;
    }
}
