import atm.*;
import builder.User;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = sc.nextInt();
        ATM atm = new ATM();
        atm.process(amount);
    User user = User.builder().age(11).gender("male").name("Alex").height(1.71).build();
    System.out.println(user);
    }
}
