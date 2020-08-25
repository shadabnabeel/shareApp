package com.example.myimageshareapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myimageshareapp.R;


public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.myViewHolder> {
    Context context;
    int[] images;
    public ImageAdapter(Context c, int[] i) {
        this.context = c;
        this.images = i;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(context).inflate(R.layout.single_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {
        holder.imageView.setImageResource(images[position]);

  holder.imageView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent = new Intent(Intent.ACTION_SEND);
          intent.putExtra(Intent.EXTRA_TEXT,"https://www.myshareapp.com/ImageFill" + "/" + position);
          intent.setType("text/plain");
          context.startActivity(Intent.createChooser(intent,null));
      }
  });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}
