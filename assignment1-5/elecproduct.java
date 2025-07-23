package assignment1;

public class elecproduct extends product {

    private int warrantyinmonths ;

    public elecproduct(String productid, String name, double price, int stockquantity, String category, int warrantyinmonths ) {
        super( productid,name,price,stockquantity,category);
        this.warrantyinmonths = warrantyinmonths;
    }

    public void setWarrantyinmonths(int warrantyinmonths) {
        if (this.warrantyinmonths < 0) {
            throw new IllegalArgumentException("warrantyinmonths cannot be negative");
        }
        this.warrantyinmonths = warrantyinmonths;
    }

    public int getWarrantyinmonths() {
        return this.warrantyinmonths;
    }
    @Override
    public String toString() {
        return super.toString() + " -- warranty is : " + this.warrantyinmonths + " months";
    }
}
