package com.example.android.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 100;

    private GreenAdapter mAdapter;

    private RecyclerView mNumbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // store a reference to the recycler view
        mNumbersList = (RecyclerView)findViewById(R.id.rv_numbers);

        // create a linear layout manager variable called layoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //use setLayoutManager on mNumbersList we created above
        mNumbersList.setLayoutManager(layoutManager);

        // use setHasFixedTrue so recycler wont change the size of an item
        mNumbersList.setHasFixedSize(true);

        //pass NUNM_LIST_ITem to the new adapter
        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);

        //set the adapter
        mNumbersList.setAdapter(mAdapter);


    }
}
