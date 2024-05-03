import org.example.NextDateCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDateCalculatorTest {

    @Test
    public void testNextDay() {
        // Kiểm tra ngày tiếp theo của ngày cuối cùng trong tháng
        int[] result1 = NextDateCalculator.nextDay(31, 12, 2021);
        assertArrayEquals(new int[]{1, 1, 2022}, result1);

        // Kiểm tra ngày tiếp theo của một ngày bình thường
        int[] result2 = NextDateCalculator.nextDay(28, 2, 2021);
        assertArrayEquals(new int[]{1, 3, 2021}, result2);

        // Kiểm tra ngày tiếp theo của một ngày nhuận
        int[] result3 = NextDateCalculator.nextDay(28, 2, 2020);
        assertArrayEquals(new int[]{29, 2, 2020}, result3);
    }

    @Test
    public void testIsLeapYear() {
        // Kiểm tra năm không nhuận
        assertFalse(NextDateCalculator.isLeapYear(2021));

        // Kiểm tra năm nhuận
        assertTrue(NextDateCalculator.isLeapYear(2020));
    }
}
