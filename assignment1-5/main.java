package assignment1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> productlist  = new ArrayList<>();
        elecproduct phone = new elecproduct("1","samsung a16",8000,5,"mobile phones",12);
        elecproduct laptop = new elecproduct("30","lenovo awoq 5615",55000,3,"gaming laptop", 12);

        bookproduct story = new bookproduct("60","gulliver travels",150,20,"storyt","shady sobhi");
        bookproduct scince = new bookproduct("90","swt tutorial",200,15,"software","mohamed");

        productlist.add(String.valueOf(phone));
        productlist.add(String.valueOf(laptop));
        productlist.add(String.valueOf(story));
        productlist.add(String.valueOf(scince));
        for (String p : productlist ){
            System.out.println(p);
        }
    }
}
