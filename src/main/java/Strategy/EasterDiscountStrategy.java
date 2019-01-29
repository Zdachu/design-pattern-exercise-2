package Strategy;

public class EasterDiscountStrategy implements CountDiscountStrategy {
    @Override
    public double countDiscount(double cost) {
        return 0.10 * cost;
    }
}
