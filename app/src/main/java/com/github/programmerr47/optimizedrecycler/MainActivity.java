package com.github.programmerr47.optimizedrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView gameListView = (RecyclerView) findViewById(R.id.list);
        gameListView.setLayoutManager(new LinearLayoutManager(this));
        gameListView.setAdapter(new GameListAdapter(GameList.increaseCopyPastingText(GameList.get())));
    }
}
