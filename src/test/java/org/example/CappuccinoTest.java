package org.example;

import CoffeeTypes.Cappuccino;
import CoffeeTypes.Coffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CappuccinoTest {
    @Test
    public void newCappuccinoShouldHave400mlCupVolume() {
        Coffee coffee = new Cappuccino();
        Assertions.assertEquals(0, coffee.getCupVolume(), 1e-9);
    }
    @Test
    public void newCappuccinoShouldHaveMediumGrit() {
        Coffee coffee = new Cappuccino();
        Assertions.assertEquals("medium grounded", coffee.getGrindingFineness());
    }
    @Test
    public void displayTakeYourShouldGiveRightInfo() {
        Coffee coffee = new Cappuccino();
        Assertions.assertEquals("Take your 0 ml medium grounded cappuccino", coffee.displayTakeYour(coffee));
    }


}
