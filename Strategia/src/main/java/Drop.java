import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface Drop extends UnaryOperator<BigDecimal> {

    default Drop combine(Drop after) {
        return value -> after.apply(this.apply(value));
    }

    static Drop birthday() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.9));
    }

    static Drop blackfriday() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.8));
    }

    static Drop valentines() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.5));
    }
}