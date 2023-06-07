import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    //null string
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("");
        return myString.detectCapitalUsage();
    }

    //not a string
    @Test
    public void detectCapitalUseTest2() {
        myString.setString(5);
        return myString.detectCapitalUsage();
    }


}
