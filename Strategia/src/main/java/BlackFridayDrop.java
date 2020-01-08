
import java.math.BigDecimal;

public class BlackFridayDrop implements Drop {

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}