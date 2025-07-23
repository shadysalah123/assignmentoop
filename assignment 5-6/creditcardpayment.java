package assignment5_6;

public class creditcardpayment implements payment {
    public void processpayment(double amount) {
        System.out.println("order blaced for : "+amount+" processed");
    }
    public boolean validatepayment(String cardnumber) {
        return cardnumber.length() == 16;
    }
}
