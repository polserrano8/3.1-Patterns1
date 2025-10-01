package Level1.Exercise1;



import Level1.Exercise1.Model.Undo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo.getInstance();
        Main.menu();
    }

    public static void menu() {

        System.out.println("Do you want to do an action? Yes/No");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        try {
            if (command.equals("Yes")) {
                Undo.getInstance();
                System.out.println("Select one of the options to do:");
                System.out.println("1.Make a Command: Insert_command");
                System.out.println("2.See the list of Commands Performed: See_list");
                System.out.println("3.Eliminate a Command: eliminate");
                System.out.println("4.Clear all history: clear_all");
                Undo.commandPetition();
                Main.menu();
            } else if (command.equals("No")) {
                System.out.println("Ok, the console is terminated");
            } else {
                throw new IllegalArgumentException("The text is not one of the options. Please say Yes or No");
            }
            } catch (IllegalArgumentException e2) {
            System.err.println(e2.getMessage());
            Main.menu();

            }
    }
}


