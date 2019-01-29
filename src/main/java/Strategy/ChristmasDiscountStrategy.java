package Strategy;

public class ChristmasDiscountStrategy implements CountDiscountStrategy {


    @Override
    public double countDiscount(double cost) {
        return 0.15 * cost;
    }
}
