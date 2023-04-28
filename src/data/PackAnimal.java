package data;

import java.util.ArrayList;
import java.util.List;

public abstract class PackAnimal extends Animal implements Workable, Manageable{
    private int weightCargo;
    private List<String> commands;
    public PackAnimal(String owner,int weightCargo) {
        super(owner);
        this.weightCargo = weightCargo;
        this.commands = new ArrayList<>();
    }

    public int getWeightCargo() {
        return weightCargo;
    }

    @Override
    public boolean work(int weight) {
        return (weightCargo - weight) >= 0;
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
        return "PackAnimal{" +
                "weightCargo=" + weightCargo +
                " " + super.toString() +
                '}';
    }
}
