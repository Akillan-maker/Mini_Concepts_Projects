// User Authentication System

import java.util.*;
import java.util.Scanner;

public class HashMap_ {

    private String name;
    private String password;
    static Scanner scan = new Scanner(System.in);

    public HashMap_(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {

        HashMap_ us1 = new HashMap_("user1", "123");
        HashMap<String, HashMap_> user = new HashMap<>();
        user.put("user1", us1);

        while(true) {
            System.out.println("Enter your ID: ");
            String name = scan.nextLine();

            if (user.containsKey(name)) {
                HashMap_ obj = user.get(name);
                System.out.println("Password: ");
                String password = scan.nextLine();
                if (password.equals(obj.getPassword())) {
                    System.out.println("Succesfully Logged in...");
                    break;
                } else {
                    System.out.println("Wrong Password...Retry");
                    continue;
                }
            }
            System.out.println("No User ID found...");
        }
    }
}
