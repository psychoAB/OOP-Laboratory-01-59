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

    @Test
    public void testHpShouldBeSetable() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.setHP(44);
        assertEquals(44, playerHP.getHP());
    }

    @Test
    public void testIsDeadWhenHpZero() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.setHP(0);
        assertTrue(playerHP.isDead());
    }
}
