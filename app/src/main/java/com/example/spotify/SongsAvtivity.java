package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class SongsAvtivity extends AppCompatActivity {

  RecyclerView recyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_songs_acitivity);

    recyclerView = findViewById(R.id.list);

    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(linearLayoutManager);

    ArrayList<Song> songArrayList = new ArrayList<>();
    songArrayList.add(new Song("The Business", "Tiesto", R.drawable.tiesto));
    songArrayList.add(new Song("Ain't Nobody", "Felix", R.drawable.felix));
    songArrayList.add(new Song("The Business 2", "Tiesto", R.drawable.tiesto));
    songArrayList.add(new Song("Ain't Nobody 2", "Felix", R.drawable.felix));
    songArrayList.add(new Song("The Business 3", "Tiesto", R.drawable.tiesto));
    songArrayList.add(new Song("Ain't Nobody 3", "Felix", R.drawable.felix));
    songArrayList.add(new Song("The Business 4", "Tiesto", R.drawable.tiesto));
    songArrayList.add(new Song("Ain't Nobody 4", "Felix", R.drawable.felix));
    songArrayList.add(new Song("The Business 5", "Tiesto", R.drawable.tiesto));
    songArrayList.add(new Song("Ain't Nobody 5", "Felix", R.drawable.felix));
    songArrayList.add(new Song("The Business 6", "Tiesto", R.drawable.tiesto));
    songArrayList.add(new Song("Ain't Nobody 6", "Felix", R.drawable.felix));
    SongsAdapter songsAdapter = new SongsAdapter(songArrayList);
    recyclerView.setAdapter(songsAdapter);

  }
}