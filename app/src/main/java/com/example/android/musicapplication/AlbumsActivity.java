package com.example.android.musicapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_item);

        final ArrayList<DetailDisplay> albums = new ArrayList<DetailDisplay>();

        albums.add(new DetailDisplay("A.R.Rahman Hits", R.drawable.arrrahman));
        albums.add(new DetailDisplay("Rang De Basanthi", R.drawable.rangdeimage));
        albums.add(new DetailDisplay("Night Visions", R.drawable.nightvisionsimage));
        albums.add(new DetailDisplay("Memories", R.drawable.memoriesimage));
        albums.add(new DetailDisplay("Kushi", R.drawable.kushiimage));
        albums.add(new DetailDisplay("Panja", R.drawable.panjaaimage));
        albums.add(new DetailDisplay("Bohemian Rhapsody", R.drawable.bohemianimage));

        DetailDisplayAdapter adapter = new DetailDisplayAdapter(this, albums);

        GridView gv = (GridView) findViewById(R.id.grid);

        gv.setAdapter(adapter);


    }
}
