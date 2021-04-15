package unibe.edu.ec;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CiTest {

    private Ci ci;

    @Before
    public void before() {
        this.ci = new Ci("1716203284");
    }

    @Test
    public void validateLength() {
        assertEquals(true, this.ci.validateLength());
    }

    @Test
    public void validateState() {
        assertEquals(true, this.ci.validateState());
    }
    @Test
    public void validateTirdDigit() {
        assertEquals(true, this.ci.validateTirdDigit());
    }

    @Test
    public void getSupiriorTen() {
        assertEquals(20, this.ci.getSupiriorTen(11));
    }

    @Test
    public void validateLastDigit() {
        assertEquals(true, this.ci.validateLastDigit());
    }
    @Test
    public void validateCi() {
        assertEquals(true, this.ci.validateCi());
    }
}
