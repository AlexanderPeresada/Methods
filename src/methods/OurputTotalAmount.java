package methods;

public class OurputTotalAmount {
    // Метод для виведення інформації про чек
     static void displayReceipt(double purchaseAmount, double discount, double totalAmount) {
        System.out.println("Загальна сума покупки: " + formatCurrency(purchaseAmount));
        System.out.println("Сума знижки: " + formatCurrency(discount));
        System.out.println("Сума до оплати: " + formatCurrency(totalAmount));
    }

    // Метод для форматування грошових значень з двома знаками після десяткового роздільника
     static String formatCurrency(double amount) {
        return String.format("%.2f грн", amount);
    }
}
