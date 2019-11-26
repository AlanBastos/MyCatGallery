package com.projetos.catgallery.service;

import com.projetos.catgallery.api.GalleryApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private Retrofit retrofit = null;

    private static final String BASE_URL = "https://api.imgur.com/";

    public GalleryApi getCats() {



        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(GalleryApi.class);

    }
}
