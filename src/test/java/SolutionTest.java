import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void main() {
        Solution solution = new Solution();

        int expected1 = 9;
        int actual1 = solution.minPartitions("9");
        assertEquals(expected1, actual1);

        int expected2 = 5;
        int actual2 = solution.minPartitions("5555");
        assertEquals(expected2, actual2);

        int expected3 = 8;
        int actual3 = solution.minPartitions("876543210");
        assertEquals(expected3, actual3);

        int expected4 = 9;
        int actual4 = solution.minPartitions("1234567890");
        assertEquals(expected4, actual4);

        int expected5 = 7;
        int actual5 = solution.minPartitions("250170");
        assertEquals(expected5, actual5);

        int expected6 = 9;
        int actual6 = solution.minPartitions("00009");
        assertEquals(expected6, actual6);

        int expected7 = 3;
        int actual7 = solution.minPartitions("333333333333");
        assertEquals(expected7, actual7);

        int expected8 = 1;
        int actual8 = solution.minPartitions("11111");
        assertEquals(expected8, actual8);

        int expected9 = 9;
        int actual9 = solution.minPartitions("901");
        assertEquals(expected9, actual9);

        int expected10 = 9;
        int actual10 = solution.minPartitions("99999999999999999999999999999999");
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
