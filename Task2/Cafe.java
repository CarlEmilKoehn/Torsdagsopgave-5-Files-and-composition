package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

   private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu(){
        return this.coffeeMenu;
    }

    public void loadMenuData(){
        try {
            File file = new File("Task2/data/coffees.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
