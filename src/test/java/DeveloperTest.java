import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Kenny", "AB123456C", 26005.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Kenny", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Rob");
        assertEquals("Rob", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456C", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(26005.00, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.50);
        assertEquals(26006.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(260.05, developer.payBonus(), 0.01);
    }
}
