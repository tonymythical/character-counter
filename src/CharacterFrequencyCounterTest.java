import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testCharacterShowsUpMultipleTimesGivesCorrectFrequency() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        // Act
        int actual = counter.getFrequency('l');
        // Assert
        assertEquals(2, actual);
    }

    @Test
    void testGetRelativeFrequencyReturns0ForMissingCharacter() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello");
        // Act
        double actual = counter.getRelativePercentage('x');
        // Assert
        assertEquals(0.0, actual, 0.0001);
    }
}