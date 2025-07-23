package assignment5_6;

public class customer extends user{

    public customer(int userid, String username, String email) {
        super(userid ,username, email );
    }

    public void placeorder(int productid ) {
        System.out.println("order blaced for order id : "+productid);
    }

    public void placeorder(int productid , int quantity) {
        System.out.println("order blaced for order id : "+productid+" with quantity : "+quantity);
    }

    @Override
    public String getuserdetails() {
        return "customer : "+ username +" -- email : " +email;
    }
}