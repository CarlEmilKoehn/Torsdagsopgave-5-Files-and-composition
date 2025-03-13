package Task2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cafe carlsCoffee = new Cafe();

        carlsCoffee.loadMenuData();
        ArrayList<String> list1 = carlsCoffee.getCoffeeMenu();
        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
