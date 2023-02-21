package CoffeeTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Espresso extends Coffee{
    List<String> listOfIngredients = new ArrayList<>(Arrays.asList("espresso", "heated milk", "milk foam"));

    @Override
    public String displayTakeYour(Coffee coffee) {
        return "Take your " + getCupVolume() + " ml " + getGrindingFineness() + " espresso";
    }
}
