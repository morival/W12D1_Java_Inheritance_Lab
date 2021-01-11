import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Colin", "AB123007C", 30001.00, "Management");
    }

    @Test
    public void canGetName() {
        assertEquals("Colin", manager.getName());
    }
    @Test
    public void canSetName() {
        manager.setName("Rob");
        assertEquals("Rob", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123007C", manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30001.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.50);
        assertEquals(30002.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.01, manager.payBonus(), 0.01);
    }

}
