import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    @DisplayName("Verify that greeting is not null and returns expected string")
    void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        assertEquals("Hello World from Azure Pipelines!", classUnderTest.getGreeting());
    }

    @Test
    @DisplayName("Verify simple addition logic")
    void testAddition() {
        App classUnderTest = new App();
        int result = classUnderTest.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}