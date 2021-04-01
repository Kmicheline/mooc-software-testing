package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class addFiveToMinusTwenty {
    @Test
    public void main(){
        int result= new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }
}
