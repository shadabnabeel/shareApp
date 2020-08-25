package com.example.myimageshareapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;

public class ImageFill extends AppCompatActivity {
    int position;
    int[] images = {R.mipmap.almora,R.mipmap.auli,R.mipmap.bomdila,R.mipmap.chikmagalur,R.mipmap.coorg,R.mipmap.darjeeling,
            R.mipmap.gangtok,R.mipmap.kodaikanal,R.mipmap.kudremukh,R.mipmap.ladakh,R.mipmap.lambasgini,R.mipmap.mahabaleshwar,
            R.mipmap.manali,R.mipmap.mountabu,R.mipmap.munnar,R.mipmap.mussoori,R.mipmap.ooty,R.mipmap.panchgani,
            R.mipmap.srinagar,R.mipmap.tawang,R.mipmap.wilsonhills};
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_fill);
        imageView = findViewById(R.id.imageView1);
        textView = findViewById(R.id.textvu);

        Intent intent = getIntent();
        if (intent!= null && intent.getData() !=null){
            Uri link = intent.getData();
            position = Integer.valueOf(link.getLastPathSegment());
            imageView.setImageResource(images[position]);
        }
    }
}