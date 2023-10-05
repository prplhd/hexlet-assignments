package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> coll = new ArrayList<>();
        Assertions.assertEquals(App.take(coll, 0).size(), 0);
        coll.add(1);
        coll.add(2);
        coll.add(3);
        Assertions.assertEquals(App.take(coll, 10).size(), 3);
        Assertions.assertEquals(App.take(coll, 1).size(), 1);
        // END
    }
}
