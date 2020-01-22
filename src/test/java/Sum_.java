import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class Sum_ {

    private Sum sum = new Sum();
    private final int number;
    private final int value;

    public Sum_(int number, int value) {
        this.number = number;
        this.value = value;
    }

    @Test
    public void execute() {
        assertThat(sum.of(number)).isEqualTo(value);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {-1, 0},
                {5, 5},
                {16, 7},
                {942, 6},
                {132189, 6},
                {493193, 2},
        };
    }

}
