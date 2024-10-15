package pointofsales.entities.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pointofsales.entities.Address;


public class AddressTests {
    @Test
    public void testCityGetterAndSetter() {
        // Arrange
        var expectedCity = "Gotham";
        var address = new Address();

        // Act
        address.setCity(expectedCity);
        var actualCity = address.getCity();

        // Assert
        assertEquals(expectedCity, actualCity);
    }
}
