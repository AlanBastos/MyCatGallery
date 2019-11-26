package com.projetos.catgallery.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.projetos.catgallery.R;
import com.projetos.catgallery.model.Cat;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    Context mContext;
    List<Cat> catList;

    public GalleryAdapter(Context mContext, List<Cat> catList) {
        this.mContext = mContext;
        this.catList = catList;
    }

    @NonNull
    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryAdapter.ViewHolder holder, int position) {

        RequestOptions requestOptions = new RequestOptions().override(200, 200);

        if (catList.get(position).images != null) {
            if (catList.get(position).images.get(0).getLink() != null) {

                Glide.with(holder.itemView.getContext())
                        .load(catList.get(position).images.get(0).getLink())
                        .apply(requestOptions)
                        .into(holder.imageView);
            }
        }
    }

    @Override
    public int getItemCount() {
        return catList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);

        }
    }
}
