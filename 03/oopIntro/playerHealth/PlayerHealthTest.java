import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerHealthTest {

    @Test
    public void testCreatePlayerHealth() {
        PlayerHealth playerHP = new PlayerHealth();
        assertNotEquals(null, playerHP);
    }

    @Test
    public void testShouldReturnFullHPAfterCreated() {
        PlayerHealth playerHP = new PlayerHealth();
        assertEquals(100, playerHP.getHP());
    }
}
