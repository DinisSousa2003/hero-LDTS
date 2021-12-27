import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringBarTest {
    @Test
    public void happyHour() {
        Bar bar = new StringBar();
        assertFalse(bar.isHappyHour());
        bar.startHappyHour();
        assertTrue(bar.isHappyHour());
        bar.endHappyHour();
        assertFalse(bar.isHappyHour());
    }
}
