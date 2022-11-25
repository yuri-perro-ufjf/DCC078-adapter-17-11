import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void shouldReturnKey() {
        Input input = new Input();
        input.setKey("UP");

        assertEquals("KEYS: - UP", input.getKeys());
    }

    @Test
    void shouldReturnKeyboardKeys() {
        Input input = new Input();
        input.setKey("UP");

        assertEquals("KEYBOARD: - W", input.getKeysKeyboard());
    }
}