package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TelegramHandleTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TelegramHandle(null));
    }

    @Test
    public void constructor_invalidTelegramHandle_throwsIllegalArgumentException() {
        String invalidTelegramHandle = "";
        assertThrows(IllegalArgumentException.class, () -> new TelegramHandle(invalidTelegramHandle));
    }

    @Test
    public void isValidTelegramHandle() {
        // null telegram handle
        assertThrows(NullPointerException.class, () -> TelegramHandle.isValidTelegramHandle(null));

        // invalid telegram handles
        assertFalse(TelegramHandle.isValidTelegramHandle("")); // empty string
        assertFalse(TelegramHandle.isValidTelegramHandle("    ")); // spaces only
        assertFalse(TelegramHandle.isValidTelegramHandle("ab")); // too short
        assertFalse(TelegramHandle.isValidTelegramHandle("abcd")); // too short
        assertFalse(TelegramHandle.isValidTelegramHandle("user!name")); // invalid character
        assertFalse(TelegramHandle.isValidTelegramHandle("user-name")); // invalid character
        assertFalse(TelegramHandle.isValidTelegramHandle("user name")); // spaces not allowed

        // valid telegram handles
        assertTrue(TelegramHandle.isValidTelegramHandle("abcde"));
        assertTrue(TelegramHandle.isValidTelegramHandle("rachel_walker"));
        assertTrue(TelegramHandle.isValidTelegramHandle("user123"));
        assertTrue(TelegramHandle.isValidTelegramHandle("User_Name_123"));
    }
}