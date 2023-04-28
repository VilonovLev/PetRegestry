package util;

import data.Animal;
import data.pets.*;
import data.livestock.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalsService {
    private List<Animal> animals;

    public AnimalsService() {
        this.animals = new ArrayList<>();
    }

    public void addCat(String owner, String namePet) throws AnimalDataException {
        Cat cat = new Cat(owner,namePet);
        AnimalsCounter.add(cat);
        animals.add(cat);
    }

    public void addDog(String owner, String namePet) throws AnimalDataException {
        Dog dog = new Dog(owner,namePet);
        AnimalsCounter.add(dog);
        animals.add(dog);
    }

    public void addHamster(String owner, String namePet) throws AnimalDataException {
        Hamster hamster = new Hamster(owner,namePet);
        AnimalsCounter.add(hamster);
        animals.add(hamster);
    }

    public void addCamel(String owner, int weightCargo) throws AnimalDataException {
        Camel camel = new Camel(owner,weightCargo);
        AnimalsCounter.add(camel);
        animals.add(camel);
    }

    public void addDonkey(String owner, int weightCargo) throws AnimalDataException {
        Donkey donkey = new Donkey(owner,weightCargo);
        AnimalsCounter.add(donkey);
        animals.add(donkey);
    }

    public void addHorse(String owner, int weightCargo) throws AnimalDataException {
        Horse horse = new Horse(owner,weightCargo);
        AnimalsCounter.add(horse);
        animals.add(horse);
    }

    public Animal get(long id) {
        for (var a:animals) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public List<Animal> getAll() {
        return animals;
    }

}
