package com.example.homework_3_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvColors;
    private ArrayList<String> colorList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvColors=findViewById(R.id.colors);
        colorList.add("Белый");
        colorList.add("Красный");
        colorList.add("Черный");
        colorList.add("Оранжевый");
        colorList.add("Желтый");
        colorList.add("Розовый");
        colorList.add("Голубой");
        colorList.add("Фиолетовый");
        colorList.add("Корчиневый");
        colorList.add("Серый");
        colorList.add("Пурпурный");
        colorList.add("Синий");
        colorList.add("Светлоголубой");
        colorList.add("Акриловый");
        colorList.add("White");
        colorList.add("White");
        ColorAdapter colorAdapter=new ColorAdapter(colorList);
        rvColors.setAdapter(colorAdapter);
    }
}