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
        if(myString.detectCapitalUse()) {
            fail("no caps in an empty string");
        }
    }

    //number string, should be unacceptable?
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("1");
        if(myString.detectCapitalUse()) {
            fail("numbers aren't capital letters");
        }
    }

    //spaces
    @Test
    public void detectCapitalUseTest3() {
        myString.setString(" B a s e ");
        if(!myString.detectCapitalUse()) {
            fail("spaces don't matter");
        }
    }

    //punctuation
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("U.S.A");
        if(!myString.detectCapitalUse()) {
            fail("Punctuation does not matter");
        }
    }


}
