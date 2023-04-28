package data;

import java.util.ArrayList;
import java.util.List;

public abstract class PetAnimal extends Animal implements Playable, Manageable{

    private String namePet;
    private List<String> commands;
    public PetAnimal(String owner,String namePet) {
        super(owner);
        this.namePet = namePet;
        this.commands = new ArrayList<>();
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public boolean play(String command) {
        return commands.contains(command);
    }

    @Override
    public void addCommand(String com) {
        commands.add(com);
    }

    @Override
    public void showCommands() {
        for (String com:commands) {
            System.out.println(com);
        }
    }

    @Override
    public String toString() {
        return "PetAnimal{" +
                "namePet='" + namePet +
                " " + super.toString() +
                '}';
    }
}
