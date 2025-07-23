package assignment5_6;

public class main {
    public static void main(String[] args) {
        product1 pro1 = new product1(1,"sam a15",8000,5);

        customer cust1 = new customer(1,"shady salah","shadysalah123.ss@gmail.com");

        admin adm1 = new admin(1,"Mohamed","mohamed123.mh@gmail.com");

        System.out.println(cust1.getuserdetails());
        System.out.println(adm1.getuserdetails());

        cust1.placeorder(pro1.getProductid());
        cust1.placeorder(pro1.getProductid(),2);

        payment pay1 = new creditcardpayment();
        if (pay1.validatepayment("1234567891123456")) {
            pay1.processpayment(8000);
        }
        payment pay2 = new paypalpayment();
        if(pay2.validatepayment("shady@paypal.com"))
            pay2.processpayment(8000);


    }
}
