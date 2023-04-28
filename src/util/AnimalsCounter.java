package util;

import data.Animal;
import data.PackAnimal;
import data.PetAnimal;

public final class AnimalsCounter implements AutoCloseable{
    private static AnimalsCounter COUNTER;
    private static long count;

    private AnimalsCounter(){
        count = 0;
    }

    private synchronized static long getCOUNTER(){
        if (COUNTER == null) {
            COUNTER = new AnimalsCounter();
        }
        return ++COUNTER.count;
    }

    public static void add(Animal animal) throws AnimalDataException {
        int emptyString = 0;
        int permissibleWeight = 150;

        if (animal instanceof PetAnimal petAnimal) {
            if (petAnimal.getNamePet().length() > emptyString
                    && petAnimal.getOwner().length() > emptyString) {
                petAnimal.setId(AnimalsCounter.getCOUNTER());
                return;
            }
        }
        if (animal instanceof PackAnimal packAnimal) {
            if (packAnimal.getWeightCargo() < permissibleWeight
                    && packAnimal.getOwner().length() > emptyString) {
                packAnimal.setId(AnimalsCounter.getCOUNTER());
                return;
            }
        }
            throw new AnimalDataException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing util.AnimalsCounter!");
    }
}
