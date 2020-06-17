package com.example.staggeredrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateData();
    }

    private void populateData() {

        Log.d(TAG,"populateData called");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/bernese-mountain-dog-royalty-free-image-1581013857.jpg?crop=0.87845xw:1xh;center,top&resize=980:*");
        mNames.add("Bernese Mountain Dog");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/hovawart-black-and-tan-puppy-4-month-royalty-free-image-1581012916.jpg?crop=1xw:1xh;center,top&resize=980:*");
        mNames.add("Hovawart");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/american-pit-bull-terrier-walking-on-sea-shore-royalty-free-image-1581007987.jpg?crop=0.309xw:0.781xh;0.228xw,0.219xh&resize=980:*");
        mNames.add("Pitbull Terrier");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/samoyed-royalty-free-image-1581005065.jpg?crop=0.452xw:1.00xh;0.0897xw,0&resize=980:*");
        mNames.add("Samoyed");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/airedale-terrier-royalty-free-image-800005578-1560958808.jpg?crop=0.779xw:0.823xh;0.0534xw,0.150xh&resize=980:*");
        mNames.add("Airedale Terrier");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/afghan-hound-royalty-free-image-709130435-1560956891.jpg?crop=0.860xw:0.863xh;0.114xw,0.137xh&resize=980:*");
        mNames.add("Afghan Hound");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/alaskan-malamute-on-snow-royalty-free-image-1581009069.jpg?crop=0.800xw:0.801xh;0.124xw,0.199xh&resize=980:*");
        mNames.add("Alaskan Malamute");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/amstaff-dog-outdoors-in-nature-royalty-free-image-596385622-1560894799.jpg?crop=0.505xw:0.998xh;0.264xw,0&resize=980:*");
        mNames.add("American Staffordshire Terrier");

        initRecyclerView();
    }

    private void initRecyclerView() {

        Log.d(TAG,"initRecyclerView called");

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        StaggerRecyclerAdapter staggerRecyclerAdapter =
                new StaggerRecyclerAdapter(this,mNames,mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggerRecyclerAdapter);


    }
}