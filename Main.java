import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> todos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Choose an option:");
        System.out.println("1. Add todo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter todo text: ");
                String todo = scanner.nextLine();

                todos.add(todo);
                System.out.println("Todo added.");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}
