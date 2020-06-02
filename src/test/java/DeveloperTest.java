import org.junit.Before;
import org.junit.Test;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer ("Dave", 435421, 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(435421, developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary(), 0.1);
    }
    
    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(31000, developer.getSalary(), 0.1);
    }

    @Test
    public void payBonus() {
        assertEquals(300, developer.payBonus(), 0.1);
    }
}
