package com.example.solvativedemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainModel {
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;

    @SerializedName("data")
    @Expose
    private List<Data> data;


    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Data>  getData() {
        return data;
    }

    public void setData(List<Data>  data) {
        this.data = data;
    }

}

