package CoffeeTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cappuccino extends Coffee {
    List<String> listOfIngredients = new ArrayList<>(Arrays.asList("Ground coffee", "water"));

    @Override
    public String displayTakeYour(Coffee coffee) {
        return "Take your " + getCupVolume() + " ml " + getGrindingFineness() + " cappuccino";
    }

}
