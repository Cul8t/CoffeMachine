package CoffeeTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Glace extends Coffee {
    List<String> listOfIngredients = new ArrayList<>(Arrays.asList("espresso", "water", "cream"));

    @Override
    public String displayTakeYour(Coffee coffee) {
        return "Take your " + getCupVolume() + " ml " + getGrindingFineness() + " glace";
    }

}
