
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class StrategyTest {
    @Test
    public void shouldDivideByTwo_WhenApplyingStaffDrop() {
        Drop staffDrop = new BlackFridayDrop();

        final BigDecimal discountedValue = staffDrop
                .apply(BigDecimal.valueOf(100));

        assertThat(discountedValue)
                .isEqualByComparingTo(BigDecimal.valueOf(50));
    }

    @Test
    public void shouldDivideByTwo_WhenApplyingStaffDropWithAnonyousTypes() {
        Drop staffDrop = new Drop() {
            @Override
            public BigDecimal apply(BigDecimal amount) {
                return amount.multiply(BigDecimal.valueOf(0.5));
            }
        };

        final BigDecimal discountedValue = staffDrop
                .apply(BigDecimal.valueOf(100));

        assertThat(discountedValue)
                .isEqualByComparingTo(BigDecimal.valueOf(50));
    }

    @Test
    public void shouldDivideByTwo_WhenApplyingStaffDropWithLamda() {
        Drop staffDrop = amount -> amount.multiply(BigDecimal.valueOf(0.5));

        final BigDecimal discountedValue = staffDrop
                .apply(BigDecimal.valueOf(100));

        assertThat(discountedValue)
                .isEqualByComparingTo(BigDecimal.valueOf(50));
    }

    @Test
    public void shouldApplyAllDrops() {
        List<Drop> drops = Arrays.asList(Drop.birthday(), Drop.valentines(), Drop.blackfriday());

        BigDecimal amount = BigDecimal.valueOf(100);

        final Drop combinedDrop = drops
                .stream()
                .reduce(v -> v, Drop::combine);

        combinedDrop.apply(amount);
    }

    @Test
    public void shouldChainDrops() {
        final Function<BigDecimal, BigDecimal> combinedDrops = Drop
                .birthday()
                .andThen(Drop.blackfriday());

        combinedDrops.apply(BigDecimal.valueOf(100));
    }
}