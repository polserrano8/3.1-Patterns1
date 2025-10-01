package Level1.Exercise1.Model;


import Level1.Exercise1.Main;

import java.util.Scanner;
import java.util.Stack;
import java.lang.IllegalArgumentException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Undo {

   private volatile static Undo uniqueInstance;
   private static Stack<String> commandHistory;
   private static int commandCounter;

    private Undo(){
        commandHistory = new Stack<>();
        commandCounter = 0;
    }

   public static Undo getInstance(){
       if(uniqueInstance == null) {
           synchronized (Undo.class) {
               Undo.uniqueInstance = new Undo();
           }
       }
       return uniqueInstance;
   }

   public static void commandPetition(){
        System.out.println("Can you give me an option of the menu to do?");
        Scanner scanner = new Scanner(System.in);
        String command =  scanner.nextLine();
       try{
           switch (command) {
               case "Insert_command" -> Undo.addPetition();
               case "See_list" -> Undo.listCommands();
               case "eliminate" -> Undo.undoLastCommand();
               case "clear_all" -> Undo.clearHistory();
               case null, default -> throw new IllegalArgumentException("Incorrect message, try another time with one of the four options possible:");
           }
       } catch(IllegalArgumentException e1){
           System.err.println(e1.getMessage());
        }

    }

    public static void addPetition(){
        System.out.println("Which command do you want to do?");
        Scanner sc = new Scanner(System.in);
        try{
             Undo.addCommand(sc.nextLine());
        } catch(IllegalArgumentException e3){
            System.err.println(e3.getMessage());
            Main.menu();
        }
    }
   public static void addCommand(String command){
       commandCounter++;
       commandHistory.add("[" + Undo.commandCounter +"] " + Undo.timeNow() + " " + command);
       System.out.println("Command added: " + command);
       System.out.println("Stack size: " + commandHistory.size());

   }

    public static void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            String lastCommand = commandHistory.pop();
            if (commandCounter > 0) {
                commandCounter--;
            }
            System.out.println("Undone: " + lastCommand);
            System.out.println("Remaining commands: " + commandHistory.size());
        } else {
            System.out.println("Nothing to undo. The command history is empty.");
        }
    }

    public static void listCommands() {
        if (commandHistory.isEmpty()) {
            System.out.println("The command history is empty.");
        } else {
            System.out.println("--- Command History (Last to First) ---");

            for (int i = commandHistory.size() - 1; i >= 0; i--) {
                System.out.println(commandHistory.get(i));
            }
            System.out.println("---------------------------------------");
        }
    }

    public static void clearHistory() {
        commandHistory.clear();
        commandCounter = 0;
        System.out.println("Command history has been cleared.");
    }

    public static String timeNow() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

}
