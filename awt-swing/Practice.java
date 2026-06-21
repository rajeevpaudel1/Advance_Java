import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asking the user to input the name
        System.out.println("Enter your full name: ");
        String name = scanner.next();

        System.out.println("Your full name is:" + name);
        scanner.close();

    }

}