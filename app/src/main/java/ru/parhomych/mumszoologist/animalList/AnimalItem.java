package ru.parhomych.mumszoologist.animalList;

public class AnimalItem {

    String animalName;
    String description;
    int animalImageId;

    public AnimalItem(String animalName, String description, int animalImageId) {
        this.animalName = animalName;
        this.animalImageId = animalImageId;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
