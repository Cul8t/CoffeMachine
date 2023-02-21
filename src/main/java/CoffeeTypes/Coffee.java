package CoffeeTypes;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee {
    List<String> listOfIngredients = new ArrayList<>();
    private int  cupVolume;
    private String grindingFineness = "medium grounded";

    public String getGrindingFineness() { return grindingFineness; }
    public void setGrindingFineness(String grindingFineness) { this.grindingFineness = grindingFineness;}

    public int getCupVolume() { return cupVolume; }
    public void setCupVolume(int cupVolume) { this.cupVolume = cupVolume; }



    public String displayTakeYour(Coffee coffee) { return "Take your"; }
}
