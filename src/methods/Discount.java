package methods;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть загальну суму покупок: ");
        double purchaseAmount = sc.nextInt();

        double discount = DiscountCalculate.discCalculate(purchaseAmount);
        double totalAmount = DiscountCalculate.calculateTotalAmount(purchaseAmount);

        OurputTotalAmount.displayReceipt(purchaseAmount, discount, totalAmount);

        sc.close();
    }
}
