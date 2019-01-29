package Strategy;

public class CountDiscountStrategyFactory {

    private CountDiscountStrategy christmasDiscountStrategy;
    private CountDiscountStrategy easterDiscountStrategy;
    private CountDiscountStrategy newYearDiscountStrategy;

    public CountDiscountStrategyFactory() {
        christmasDiscountStrategy = new ChristmasDiscountStrategy();
        easterDiscountStrategy = new EasterDiscountStrategy();
        newYearDiscountStrategy = new NewYearDiscountStrategy();
    }

    public CountDiscountStrategy getStrategy(DiscountType discountType) {
        if (discountType.equals(DiscountType.CHRISTMAS)) {
            return christmasDiscountStrategy;
        } else if (discountType.equals(DiscountType.EASTER)) {
            return easterDiscountStrategy;
        } else if (discountType.equals(DiscountType.NEW_YEAR)) {
            return newYearDiscountStrategy;
        }
        return null;
    }

}
