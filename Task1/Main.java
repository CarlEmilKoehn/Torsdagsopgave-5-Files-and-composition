package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> customers = new ArrayList<>();
        Customer c1 = new Customer("Carl","Køhn", "carlkun1414");
        Customer c2 = new Customer("Kurt","Kogehoved","kanylekurt33");
        Customer c3 = new Customer("Abe","Lincler", "abekatten2");

        customers.add(c1.toString());
        customers.add(c2.toString());
        customers.add(c3.toString());

        printCustomers(customers);

    }
    static void printCustomers(ArrayList<String> list) {
        for(String s : list){
            System.out.println(s);
        }
    }
}
