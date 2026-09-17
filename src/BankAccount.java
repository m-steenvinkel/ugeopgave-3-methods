import java.util.Scanner;

public class BankAccount {
    double balance;
    String accountName;
    Scanner scanner = new Scanner(System.in);

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " has been deposited to your account.");
        printBalance();
        System.out.println();

    }

    void withdraw50() {
        balance -= 50;
        if (balance < 0) {
            balance = 0;
        }
        System.out.println("50 has been withdrawn from your account.");
        printBalance();
        System.out.println();

    }

    void printBalance() {
        System.out.println("Balance: " + balance);

    }

    void main() {
        accountName = "Mathias";
        System.out.println("Type the amount of money you want to deposit: ");
        double input = scanner.nextDouble();
        scanner.nextLine();
        deposit(input);

        System.out.println("Type the amount of money you want to deposit: ");
        input = scanner.nextDouble();
        scanner.nextLine();
        deposit(input);

        withdraw50();
        printBalance();

    }
}
