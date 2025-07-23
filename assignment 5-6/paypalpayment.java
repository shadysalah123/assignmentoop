package assignment5_6;

public class paypalpayment implements payment {
    public void processpayment(double amount) {
        System.out.println("order blaced for : "+amount+" processed");
    }

    @Override
    public boolean validatepayment(String paypaluser) {
        return paypaluser.contains("@");
    }
}
