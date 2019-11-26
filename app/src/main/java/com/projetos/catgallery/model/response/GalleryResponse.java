package com.projetos.catgallery.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.projetos.catgallery.model.Cat;

import java.io.Serializable;
import java.util.List;

public class GalleryResponse implements Serializable {

    @SerializedName("data")
    @Expose
    public List<Cat> data = null;

    public List<Cat> getData() {
        return data;
    }

    public void setData(List<Cat> data) {
        this.data = data;
    }
}
