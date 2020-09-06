package ru.parhomych.mumszoologist.animalList;

import java.util.ArrayList;
import java.util.List;

import ru.parhomych.mumszoologist.R;

public class DataUtils {

    public static List<AnimalItem> getAnimalItems() {
        List<AnimalItem> items = new ArrayList<>();
        items.add(new AnimalItem("Белка", "Описание белки", R.drawable.img1));
        items.add(new AnimalItem("Вомбат","Описание вомбата", R.drawable.img2));
        items.add(new AnimalItem("Тигра","Описание тигры", R.drawable.img3));
        items.add(new AnimalItem("Котейка","Описание котейки", R.drawable.img4));
        items.add(new AnimalItem("Панда","Описание панды", R.drawable.img5));
        items.add(new AnimalItem("Белка", "Описание белки", R.drawable.img1));
        items.add(new AnimalItem("Вомбат","Описание вомбата", R.drawable.img2));
        items.add(new AnimalItem("Тигра","Описание тигры", R.drawable.img3));
        items.add(new AnimalItem("Котейка","Описание котейки", R.drawable.img4));
        items.add(new AnimalItem("Панда","Описание панды", R.drawable.img5));
        return items;
    }

}
