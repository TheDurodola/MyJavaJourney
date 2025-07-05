import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwitchTest {

    @Test
    public void ToggleOnce_isOnIsTrue_ToggleAgain_isOnIsFalse_Test(){
        Switch remote = new Switch();
        assertFalse(remote.isOn());
        remote.toggle();
        assertTrue(remote.isOn());
        remote.toggle();
        assertFalse(remote.isOn());

    }

}
