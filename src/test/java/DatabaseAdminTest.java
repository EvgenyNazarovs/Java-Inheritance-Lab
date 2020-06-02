import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin ("Dave", 435421, 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Dave", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(435421, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(31000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void payBonus() {
        assertEquals(300, databaseAdmin.payBonus(), 0.1);
    }
}
