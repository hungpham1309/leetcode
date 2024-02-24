package algorithm.kadane;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class KadaneTest {

    Kadane kadane = new Kadane();
    @Test
    public void shouldReturnResultWhenKadaneK() {
        int actual = kadane.kadane(new int[]{4,-1,2,-7,3,4});
        int actual2 = kadane.kadane(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        assertThat(actual).isEqualTo(7);
        assertThat(actual2).isEqualTo(6);
    }

    @Test
    public void shouldReturnIndexWhenKadaneSubArraySumK() {
        int[] actual = kadane.indexOfLargestSum(new int[]{4,-1,2,-7,3,4});

        assertThat(actual).isEqualTo(new int[]{4,5});
    }
}