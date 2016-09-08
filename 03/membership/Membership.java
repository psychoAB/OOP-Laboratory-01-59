public class Membership {
    public static double getDiscount (double price, boolean isMember, int memberPoints) {
        if (!isMember) {
            return price;
        }
        if (price <= 1000)
        {
            price = discount(price, 10);
        } else {
            price = discount(price, 5);
        }
        if (memberPoints > 500) {
            price = discount(price, 2.5);
        }
        return price;
    }

    public static double discount(double price, double percent) {
        return price * (100 - percent) / 100;
    }
}
