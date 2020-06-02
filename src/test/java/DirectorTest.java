import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DirectorTest {

    private Director director;

    @Before
    public void setUp() {
        director = new Director("Dave", 435421, 30000, "Java", 500000);
    }

    @Test
    public void hasName() {
        assertEquals("Dave", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(435421, director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Java", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000);
        assertEquals(31000, director.getSalary(), 0.1);
    }

    @Test
    public void payBonus() {
        assertEquals(300, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget() {
        assertEquals(500000, director.getBudget(), 0.1);
    }
}
