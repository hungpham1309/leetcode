package grokkingcodingitv.cyclicsort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DuplicateNumberTest {

    public DuplicateNumber duplicateNumber = new DuplicateNumber();

    /**
     * Input: [1, 4, 4, 3, 2]
     * Output: 4
     */
    @Test
    public void shouldReturnResult() {
        var actual = duplicateNumber.findDuplicateNumber(new int[] {1, 4, 4, 3, 2});
        assertThat(actual).isEqualTo(4);
    }
}