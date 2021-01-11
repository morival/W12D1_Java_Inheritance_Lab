import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Juan", "ES090909P", 35004.00, "Management", 100000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Juan", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("Rob");
        assertEquals("Rob", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("ES090909P", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35004.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.50);
        assertEquals(35005.50, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(700.08, director.payBonus(), 0.01);
    }
}
