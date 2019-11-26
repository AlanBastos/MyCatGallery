package com.projetos.catgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.projetos.catgallery.model.Cat;
import com.projetos.catgallery.presenter.GalleryPresenter;
import com.projetos.catgallery.view.MainView;
import com.projetos.catgallery.view.adapter.GalleryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    private RecyclerView recyclerView;
    private List<Cat> catList = new ArrayList<>();
    private GalleryAdapter galleryAdapter;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loading = findViewById(R.id.loading);

        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.isNestedScrollingEnabled();
        galleryAdapter = new GalleryAdapter(getApplicationContext(), catList);
        recyclerView.setAdapter(galleryAdapter);

        GalleryPresenter galleryPresenter = new GalleryPresenter(this);
        galleryPresenter.getCats();

    }

    @Override
    public void onReceiveCats(List<Cat> cats) {
        galleryAdapter = new GalleryAdapter(getApplicationContext(), cats);
        recyclerView.setAdapter(galleryAdapter);
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        loading.setVisibility(View.GONE);
    }

    @Override
    public void showLoading() {
        loading.setVisibility(View.VISIBLE);
    }

}
