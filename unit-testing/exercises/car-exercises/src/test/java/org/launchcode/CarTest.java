package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    //@BeforeEach makes this code run before every test very convenient do not forget ! !
    @BeforeEach
    public void initCar() {
        //This is an example car used in all tests!
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals( 10, test_car.getGasTankLevel(),.001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void gasUsedAccurately(){
        test_car.drive(50);
        //States that gasTankLevel should be 9 after driving 50 miles,
        //Due to the car getting 50 mpg dropping gasTankLevel fron 10 to 9
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void gasTankEmptyAccurate(){
        test_car.drive(1000000);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception

    @Test
    public void testGasOverfillException() {
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}