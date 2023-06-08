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

    //gotta figure out some test cases:

    /**
     * a null string, number string, space at start, middle, or end
     *
     *
     */


    //null string
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("");
        //fail(!myString.detectCapitalUse());
    }

    //number string
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("1386");
        if(myString.detectCapitalUse()) {
            fail("numbers seen as capital letters");
        }
        //fail(myString.detectCapitalUsage()); //is the way?
    }

    //space at start
    @Test
    public void detectCapitalUseTest3() {
        myString.setString(" B");
        if(!myString.detectCapitalUse()) {
            fail("space at start should not matter");
        }
    }


}
