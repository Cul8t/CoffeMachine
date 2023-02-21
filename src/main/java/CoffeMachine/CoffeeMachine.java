package CoffeMachine;

import CoffeeTypes.*;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Coffee coffee = null;

        Scanner s = new Scanner(System.in); // сканнер для любого последующего ввода
        String query; // переменнная для запроса пользователя

        System.out.println("""
                Please, choose the number of your drink:\s
                1) Cappuccino\s
                2) Glace\s
                3) Espresso""");

        query = s.nextLine(); // считываем выбор пользователя

        switch (query) {
            case "1" -> coffee = new Cappuccino();
            case "2" -> coffee = new Glace();
            case "3" -> coffee = new Espresso();
        }
        System.out.println("""
                Please, choose the cup volume:\s
                1) 100 mls\s
                2) 200 mls\s
                3) 300 mls\s
                4) 400 mls""");

        query = s.nextLine(); // считываем выбор пользователя

        switch (query) {
            case "1" -> coffee.setCupVolume(100);
            case "2" -> coffee.setCupVolume(200);
            case "3" -> coffee.setCupVolume(300);
            case "4" -> coffee.setCupVolume(400);
        }

        System.out.println("""
                Please, choose the grit:\s
                1) Fine grinding\s
                2) Medium grinding\s
                3) Coarse grinding""");

        query = s.nextLine(); // считываем выбор пользователя

        switch (query) {
            case "1" -> coffee.setGrindingFineness("finely ground");
            case "2" -> coffee.setGrindingFineness("medium-ground");
            case "3" -> coffee.setGrindingFineness("coarse ground");
        }


        System.out.println(coffee.displayTakeYour(coffee));
    }
}
