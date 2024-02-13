import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    //Tests that one of our HouseCat constructors correctly calls the Cat constructor
    //and applies the weight value properly
    @Test
    public void inheritsSuperInFirstConstructor() {
        //Creates a housecat keyboardCat
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        //Tests if weight value passed to keyboardCat is applied to the object
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
