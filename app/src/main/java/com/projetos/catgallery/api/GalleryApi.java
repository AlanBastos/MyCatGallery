package com.projetos.catgallery.api;

import com.projetos.catgallery.model.response.GalleryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GalleryApi {

    @Headers("Authorization: Client-ID 1ceddedc03a5d71")
    @GET("3/gallery/search/?q=cats")
    Call<GalleryResponse> getResults();
}
