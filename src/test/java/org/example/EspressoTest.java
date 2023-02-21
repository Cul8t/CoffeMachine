package org.example;


import CoffeeTypes.Coffee;
import CoffeeTypes.Espresso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EspressoTest {
    @Test
    public void newEspressoShouldHave400mlCupVolume() {
        Coffee coffee = new Espresso();
        Assertions.assertEquals(0, coffee.getCupVolume(), 1e-9);
    }
    @Test
    public void newEspressoShouldHaveMediumGrit() {
        Coffee coffee = new Espresso();
        Assertions.assertEquals("medium grounded", coffee.getGrindingFineness());
    }
    @Test
    public void displayTakeYourShouldGiveRightInfo() {
        Coffee coffee = new Espresso();
        Assertions.assertEquals("Take your 0 ml medium grounded espresso", coffee.displayTakeYour(coffee));
    }
}
