package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class addFiveToZero {
    @Test
    public void addFiveToZero(){
        int result= new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }
}
