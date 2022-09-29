package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Animal> animals = new ArrayList<>();
    private AnimalAdapter animalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalAdapter = new AnimalAdapter(this, animals);
        recyclerView = findViewById(R.id.rev_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(animalAdapter);

        Animal animal1 = new Animal("Babi", "Pink", "Ngok...ngok");
        Animal animal2 = new Animal("Werewolf", "Ireng", "Auuu");
        Animal animal3 = new Animal("Lycan", "Abu", "Grok..Grok");
        Animal animal4 = new Animal("Platipus", "Putih", "Plek...plek");
        Animal animal5 = new Animal("Buaya Putih", "Putih lah", "Rawr...rawr");
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
    }
}
