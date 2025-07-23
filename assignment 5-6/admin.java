package assignment5_6;

public class admin extends user {
    public admin(int userid, String username, String email) {
        super(userid, username, email );
    }

    public void ubdateorder (product1 product , double newprice ,int newstock){
        product.setPrice(newprice);
        product.setStock(newstock);
        System.out.println("product updated : "+product.getName());
    }

    @Override
    public String getuserdetails(){
        return "admin : "+username+" -- email : "+email;
    }
}
