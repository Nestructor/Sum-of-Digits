import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Sum_ {

    private Sum sum;

    @Before
    public void setUp() {
        sum = new Sum();
    }

    @Test
    public void given_negative_number_should_return_0() {
        assertThat(sum.of(-1)).isEqualTo(0);
    }

    @Test
    public void given_5_should_return_5() {
        assertThat(sum.of(5)).isEqualTo(5);
    }

    @Test
    public void given_16_should_return_7() {
        assertThat(sum.of(16)).isEqualTo(7);
    }

}