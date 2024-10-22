package pointofsales.entities.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import pointofsales.entities.Product;

public class ProductTests {
    
    @ParameterizedTest
    @ValueSource(strings = {"Audio", "Food", "Drinks"})
    public void testAudioIsValidCategory(String expectedCategtory) {
        // Arrange
        Product product = new Product();

        // Act
        try {
            product.setCategory(expectedCategtory);
        } catch (Exception e) {
            fail(e.getMessage());
        }
        String actualCategory = product.getCategory();

        // Assert
        assertEquals(expectedCategtory, actualCategory);
    }
    
    @Test
    public void testCategoryThrowsExceptionWhenInvalid() {
        // Arrange
        String expectedCategtory = "blah";
        Product product = new Product();

        assertThrows(Exception.class, () -> {
            product.setCategory(expectedCategtory);
        });
    }
}
