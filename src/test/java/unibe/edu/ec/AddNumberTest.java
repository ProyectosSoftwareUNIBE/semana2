package unibe.edu.ec;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumberTest {

    private AddNumber addNumber;

    @Before
    public void before() {
        this.addNumber = new AddNumber(1, 5);
    }

    @Test
    public void getResult() {
        assertEquals(6, this.addNumber.getResult());
    }
}
