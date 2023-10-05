package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> coll1 = new ArrayList<>();
        List<Integer> expected1 = new ArrayList<>();
        List<Integer> result1 = App.take(coll1, 15);
        Assertions.assertEquals(result1, expected1);

        List<Integer> coll2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result2 = App.take(coll2, 28);
        Assertions.assertEquals(result2, expected2);

        List<Integer> coll3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> result3 = App.take(coll3, 2);
        Assertions.assertEquals(result3, expected3);
        // END
    }
}
