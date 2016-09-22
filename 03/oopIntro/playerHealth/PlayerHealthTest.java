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
    public void testShouldReturnNoArmorWhenCreated() {
        PlayerHealth playerHP = new PlayerHealth();
        assertFalse(playerHP.isOnArmor());
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

    @Test
    public void testIsDeadWhenHpNotZero() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.setHP(69);
        assertFalse(playerHP.isDead());
    }

    @Test
    public void testIsAliveWhenHpZero() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.setHP(0);
        assertFalse(playerHP.isAlive());
    }
    
    @Test
    public void testIsAliveWhenHpNotZero() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.setHP(89);
        assertTrue(playerHP.isAlive());
    }

    @Test
    public void testShouldWearArmorable() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.wearArmor();
        assertTrue(playerHP.isOnArmor());
    }

    @Test
    public void testShouldRemoveArmorable() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.wearArmor();
        assertTrue(playerHP.isOnArmor());
        playerHP.removeArmor();
        assertFalse(playerHP.isOnArmor());
    }

    @Test
    public void testGetHitWithoutArmor() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.getHit();
        assertEquals(90, playerHP.getHP());
    }

    @Test
    public void testGetHitWithArmor() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.wearArmor();
        playerHP.getHit();
        assertEquals(97, playerHP.getHP());
    }

    @Test
    public void testWhenGetHitHpDontLowerThanZero() {
        PlayerHealth playerHP = new PlayerHealth();
        for(int round = 0; round < 11; round++) {
            playerHP.getHit();
        }
        assertEquals(0, playerHP.getHP());
    }

    @Test
    public void testShouldHeal() {
        PlayerHealth playerHP = new PlayerHealth();
        playerHP.setHP(21);
        playerHP.heal();
        assertEquals(26, playerHP.getHP());
    }
}
