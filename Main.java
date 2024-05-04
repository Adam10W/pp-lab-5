import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int num1 = 32;
        int num2 = 51;

        int sum = MathUtils.add(num1, num2);

        System.out.println("Suma: " + sum);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Suma " + num1 + " i " + num2 + " to = " + sum);
    }
}