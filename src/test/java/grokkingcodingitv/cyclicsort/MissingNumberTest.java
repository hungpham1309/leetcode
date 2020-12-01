package grokkingcodingitv.cyclicsort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
public class MissingNumberTest {

    MissingNumber missingNumber = new MissingNumber();

    /**
     * Input: [8, 3, 5, 2, 4, 6, 0, 1]
     * Output: 7
     */
    @Test
    public void shouldReturnResult() {
        int actual = missingNumber.findMissingNumber(new int[] {8, 3, 5, 2, 4, 6, 0, 1});

        assertThat(actual).isEqualTo(7);
    }

    /**
     * Input: [4, 0, 3, 1]
     * Output: 2
     */
    @Test
    public void shouldReturnResult2() {
        int actual = missingNumber.findMissingNumber(new int[] {4, 0, 3, 1});

        assertThat(actual).isEqualTo(2);
    }

    /**
     * Input: [2, 3, 1, 8, 2, 3, 5, 1]
     * Output: 4, 6, 7
     */
    @Test
    public void shouldReturnResult3() {
        var actual = missingNumber.findAllMissingNumbers(new int[] {2, 3, 1, 8, 2, 3, 5, 1});

        assertThat(actual).containsExactlyInAnyOrder(
                4,
                6,
                7
        );
    }


}