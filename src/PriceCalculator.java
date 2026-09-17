import java.util.Scanner;

public class PriceCalculator {

    Scanner scanner = new Scanner(System.in);

    double applyDiscount(double price, double discountPercent) {
        double discount = price * (discountPercent / 100);
        return price - discount;
    }

    double addTax(double price) {
        double taxPercent = 25;
        double tax = price * (taxPercent / 100);
        return price + tax;
    }

    double calculateFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);

        return finalPrice;
    }

    void main() {
        System.out.println("Type base price: ");
        double basePrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Type discount percent: ");
        double discountPercent = scanner.nextDouble();
        scanner.nextLine();

        double finalPrice = calculateFinalPrice(basePrice, discountPercent);
        System.out.println("Final price: " + finalPrice);

    }

}
