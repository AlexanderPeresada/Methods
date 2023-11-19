package methods;

public class DiscountCalculate {
    static double minSum = 5000.00;
    static double maxSum = 10000.00;
    static final double MINDISC = 5.00;
    static final double MIDLDISC = 10.00;
    static final double MAXDISC = 15.00;

    // Метод для розрахунку суми знижки
    static double discCalculate(double purchaseAmount) {

        if (purchaseAmount <= minSum) {
            return purchaseAmount * (MINDISC / 100);
        }
        if (purchaseAmount <= maxSum) {
            return purchaseAmount * (MIDLDISC / 100);
        } else {
            return purchaseAmount * (MAXDISC / 100);
        }
    }
    // Метод для розрахунку суми до оплати
    static double calculateTotalAmount(double purchaseAmount) {
        double discount = discCalculate(purchaseAmount);
        return purchaseAmount - discount;
    }
}

