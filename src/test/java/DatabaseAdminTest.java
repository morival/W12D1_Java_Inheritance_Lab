import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("John", "AB654321C", 28008.00);
    }

    @Test
    public void canGetName() {
        assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Rob");
        assertEquals("Rob", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB654321C", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(28008.00, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1.50);
        assertEquals(28009.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseNegVal() {
        databaseAdmin.raiseSalary(-200.00);
        assertEquals(28008.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280.08, databaseAdmin.payBonus(), 0.01);
    }

}

