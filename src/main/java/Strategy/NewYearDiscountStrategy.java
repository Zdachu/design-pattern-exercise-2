package Strategy;

public class NewYearDiscountStrategy implements CountDiscountStrategy {
    @Override
    public double countDiscount(double cost) {
        return 0.2 * cost;
    }
}
