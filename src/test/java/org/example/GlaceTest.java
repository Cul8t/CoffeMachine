package org.example;

import CoffeeTypes.Coffee;
import CoffeeTypes.Glace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GlaceTest {
    @Test
    public void newGlaceShouldHave400mlCupVolume() {
        Coffee coffee = new Glace();
        Assertions.assertEquals(0, coffee.getCupVolume(), 1e-9);
    }
    @Test
    public void newGlaceShouldHaveMediumGrit() {
        Coffee coffee = new Glace();
        Assertions.assertEquals("medium grounded", coffee.getGrindingFineness());
    }
    @Test
    public void displayTakeYourShouldGiveRightInfo() {
        Coffee coffee = new Glace();
        Assertions.assertEquals("Take your 0 ml medium grounded glace", coffee.displayTakeYour(coffee));
    }

}
