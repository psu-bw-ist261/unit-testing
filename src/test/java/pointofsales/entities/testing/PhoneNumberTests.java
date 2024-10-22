package pointofsales.entities.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pointofsales.entities.PhoneNumber;

public class PhoneNumberTests {
    @Test
    public void testAreaCodeGetterAndSetter() {
        // Arrange
        String expectedAreaCode = "215";
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setAreaCode(expectedAreaCode);

        // Act
        String actualAreaCode = phoneNumber.getAreaCode();

        // Assert
        assertEquals(expectedAreaCode, actualAreaCode);
    }

    @Test
    public void testPrefixGetterAndSetter() {
        // Arrange
        String expectedPrefix = "541";
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPrefix(expectedPrefix);

        // Act
        String actualPrefix = phoneNumber.getPrefix();

        // Assert
        assertEquals(expectedPrefix, actualPrefix);
    }
    
    @Test
    public void testGetDisplayNumber() {
        // Arrange
        String expectedAreaCode = "215";
        String expectedPrefix = "541";
        String expectedLineNumber = "1122";
        String expectedDisplayNumber = String.format(
            "%s-%s-%s",
            expectedAreaCode,
            expectedPrefix,
            expectedLineNumber);

        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setAreaCode(expectedAreaCode);
        phoneNumber.setPrefix(expectedPrefix);
        phoneNumber.setLineNumber(expectedLineNumber);

        // Act
        String actualDisplayNumber = phoneNumber.getDisplayNumber();

        // Assert
        assertEquals(expectedDisplayNumber, actualDisplayNumber);
    }
}
