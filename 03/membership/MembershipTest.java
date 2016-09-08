import static org.junit.Assert.*;

public class MembershipTest {
     
    @Test
    public void testNonMember() {
        assertEquals(1000, Membership.getDiscount(1000, false, 0), 0.001);
        assertEquals(400, Membership.getDiscount(400, false, 0), 0.001);
    }

    @Test
    public void testMemberWithSmallPoints() {
        assertEquals(450, Membership.getDiscount(500, true, 0), 0.001);
        assertEquals(450, Membership.getDiscount(500, true, 500), 0.001);
        assertEquals(900, Membership.getDiscount(1000, true, 100), 0.001);
        assertEquals(950.94999, Membership.getDiscount(1001, true, 100), 0.001);
        assertEquals(1900, Membership.getDiscount(2000, true, 500), 0.001);
    }

    @Test
    public void testMemberWithHighPoints() {
        assertEquals(438.75, Membership.getDiscount(500, true, 501), 0.001);
        assertEquals(877.5, Membership.getDiscount(1000, true, 600), 0.001);
        assertEquals(927.1762, Membership.getDiscount(1001, true, 600), 0.001);
        assertEquals(1852.5, Membership.getDiscount(2000, true, 501), 0.001);
    }
}
