package com.projetos.catgallery.presenter;



import android.util.Log;

import com.projetos.catgallery.Service.RetrofitService;
import com.projetos.catgallery.model.Cat;
import com.projetos.catgallery.model.response.GalleryResponse;
import com.projetos.catgallery.view.MainView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GalleryPresenter {

    private MainView mainView;
    private RetrofitService retrofitService;

    public GalleryPresenter(MainView mainView) {
        this.mainView = mainView;

        if (this.retrofitService == null) {
            this.retrofitService = new RetrofitService();
        }
    }


    public void getCats() {
        retrofitService
                .getCats()
                .getResults()
                .enqueue(new Callback<GalleryResponse>() {
                    @Override
                    public void onResponse(Call<GalleryResponse> call, Response<GalleryResponse> response) {
                        GalleryResponse galleryResponse = response.body();

                        if (galleryResponse != null && galleryResponse.getData() != null) {
                            List<Cat> cats = galleryResponse.getData();
                            mainView.onReceiveCats(cats);
                            mainView.hideLoading();
                        }

                    }

                    @Override
                    public void onFailure(Call<GalleryResponse> call, Throwable t) {
                        Log.d("ERROR", t.getMessage());

                    }
                });
    }

}
