import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Dave", 435421, 30000, "Java");
    }

    @Test
    public void hasName() {
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(435421, manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Java", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(31000, manager.getSalary(), 0.1);
    }

    @Test
    public void payBonus() {
        assertEquals(300, manager.payBonus(), 0.1);
    }



}
