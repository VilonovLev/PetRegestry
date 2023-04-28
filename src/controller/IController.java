package controller;

import util.AnimalDataException;

public interface IController {

    void addAnimal() throws AnimalDataException;
    void showAnimals();
    void showCommands();
    void trainAnimal();

}
