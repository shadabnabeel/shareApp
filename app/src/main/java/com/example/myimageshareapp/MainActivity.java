package com.example.myimageshareapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.example.myimageshareapp.adapter.ImageAdapter;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.mipmap.almora,R.mipmap.auli,R.mipmap.bomdila,R.mipmap.chikmagalur,R.mipmap.coorg,R.mipmap.darjeeling,
            R.mipmap.gangtok,R.mipmap.kodaikanal,R.mipmap.kudremukh,R.mipmap.ladakh,R.mipmap.lambasgini,R.mipmap.mahabaleshwar,
            R.mipmap.manali,R.mipmap.mountabu,R.mipmap.munnar,R.mipmap.mussoori,R.mipmap.ooty,R.mipmap.panchgani,
            R.mipmap.srinagar,R.mipmap.tawang,R.mipmap.wilsonhills};
    RecyclerView recyclerView;
    ImageAdapter imageAdapter;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.imageRecycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        imageAdapter = new ImageAdapter(this,images);
        recyclerView.setAdapter(imageAdapter);

    }
}