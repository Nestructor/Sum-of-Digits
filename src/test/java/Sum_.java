import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Sum_ {

    private Sum sum;

    @Before
    public void setUp() {
        sum = new Sum();
    }

    @Test
    public void given_1_should_return_1() {
        assertThat(sum.of(-1)).isEqualTo(0);
    }

}