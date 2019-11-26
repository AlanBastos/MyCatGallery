package com.projetos.catgallery.view;

import com.projetos.catgallery.model.Cat;

import java.util.List;

public interface MainView {
    void onReceiveCats(List<Cat> cats);
    void hideLoading();
    void showLoading();
}
