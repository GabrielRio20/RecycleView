package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailAnimalActivity extends AppCompatActivity {
    TextView txtName, txtColor, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);

        txtName = findViewById(R.id.txt_name);
        txtColor = findViewById(R.id.txt_color);
        txtDesc = findViewById(R.id.txt_description);

        Intent intent = getIntent();
        String name = intent.getStringExtra(AnimalAdapter.MESSAGE_EXTRA1);
        String color = intent.getStringExtra(AnimalAdapter.MESSAGE_EXTRA2);
        String desc = intent.getStringExtra(AnimalAdapter.MESSAGE_EXTRA3);

        txtName.setText(name);
        txtColor.setText(color);
        txtDesc.setText(desc);
    }
}
