import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        final int b = 10;

        try {
            people[0] = new Person("Janek", 21);
            people[1] = new Person("Hubert", 38);
            people[2] = new Person("Ada", 30);
            people[3] = new Person("Adam", 25);
            people[4] = new Person("Ewa", 52);

            for (int i = 0; i < people.length; i++) {
                int newValue = MathUtils.add(people[i].getAge(), b);
                String message = "Nowa wiek dla " + people[i].getName() + " to " + newValue;
                
                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage(message);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Wyjątek: " + e.getMessage());
        }
    }
}
