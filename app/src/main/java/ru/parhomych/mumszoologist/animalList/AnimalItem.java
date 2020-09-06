package ru.parhomych.mumszoologist.animalList;

public class AnimalItem {

    String animalName;
    int animalImageId;

    public AnimalItem(String animalName, int animalImageId) {
        this.animalName = animalName;
        this.animalImageId = animalImageId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalImageId() {
        return animalImageId;
    }

    public void setAnimalImageId(int animalImageId) {
        this.animalImageId = animalImageId;
    }
}
