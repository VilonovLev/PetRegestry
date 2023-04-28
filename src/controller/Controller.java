package controller;

import data.Animal;
import data.Manageable;
import util.AnimalDataException;
import util.AnimalsService;

import java.util.List;
import java.util.Scanner;

public class Controller implements IController{
    Scanner scanner;
    AnimalsService animalsService;

    public Controller(Scanner scanner, AnimalsService animalsService) {
        this.scanner = scanner;
        this.animalsService = animalsService;
    }

    @Override
    public void addAnimal() throws AnimalDataException {
        System.out.println("Entry type animal:\n1-cat\n2-dog\n3-hamster\n4-camel\n5-donkey\n6-horse");
        String type = scanner.next();
        System.out.println("Please entry owner: ");
        String owner = scanner.next();
        switch (type) {
            case "1": {
                System.out.println("Please entry name pet: ");
                String name = scanner.next();
                animalsService.addCat(owner, name);
                break;
            }
            case "2": {
                System.out.println("Please entry name pet: ");
                String name = scanner.next();
                animalsService.addDog(owner, name);
                break;
            }
            case "3": {
                System.out.println("Please entry name pet: ");
                String name = scanner.next();
                animalsService.addHamster(owner, name);
                break;
            }
            case "4": {
                System.out.println("Please entry weight cargo: ");
                int weight = scanner.nextInt();
                animalsService.addCamel(owner, weight);
                break;
            }
            case "5": {
                System.out.println("Please entry weight cargo: ");
                int weight = scanner.nextInt();
                animalsService.addDonkey(owner, weight);
                break;
            }
            case "6": {
                System.out.println("Please entry weight cargo: ");
                int weight = scanner.nextInt();
                animalsService.addHorse(owner, weight);
                break;
            }
            default:
                System.out.println("Type not found!");
                break;
        }
    }

    private Animal find() {
        System.out.println("Entry id animal: ");
        long id = scanner.nextLong();
        return animalsService.get(id);
    }

    @Override
    public void showAnimals() {
        List<Animal> animalList = animalsService.getAll();
        if (animalList.size() == 0) {
            System.out.println(" List is empty!");
            return;
        }
        for (var a: animalList) {
            System.out.println(a);
        }
    }

    @Override
    public void showCommands() {
        Animal animal = find();
        if (animal != null) {
            if (animal instanceof Manageable manageable) {
                manageable.showCommands();
            }
        }
    }


    @Override
    public void trainAnimal() {
        Animal animal = find();
        System.out.println("Entry command: ");
        String command = scanner.next();
        if (animal != null) {
            if (animal instanceof Manageable manageable) {
                manageable.addCommand(command);
            }
        }
    }

}
