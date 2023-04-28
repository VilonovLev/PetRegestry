import controller.Controller;
import util.AnimalsService;

import java.util.Scanner;

public class PetRegistry {
    public static String[] operations =
            {"show all animals", "add animal", "show commands animal", "train animal","exit"};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalsService animalsService = new AnimalsService();
        Controller controller = new Controller(scanner, animalsService);

        System.out.println(null == null);
        System.out.println("Hello! Pet registry started.");
        for (int i = 0; i < operations.length; ++i) {
            System.out.println((i+1) + " - " + operations[i]);
        }

        String index;
        while (true) {
            System.out.print("Select an operation: ");
            index = scanner.next();
            switch (index) {
                case "1": {
                    controller.showAnimals();
                    break;
                }
                case "2": {
                    try {
                        controller.addAnimal();
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }break;
                }
                case "3":{
                    controller.showCommands();
                    break;
                }
                case "4":
                    controller.trainAnimal();
                    break;
                case "5": {
                    return;
                }
                default: {
                    System.out.println("Command not found!");
                    break;
                }
            }
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

}