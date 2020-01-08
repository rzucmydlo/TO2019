
import java.math.BigDecimal;

public class BirthdayDrop implements Drop {

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}
