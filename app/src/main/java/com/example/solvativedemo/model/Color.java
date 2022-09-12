package com.example.solvativedemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Color {

    @SerializedName("h")
    @Expose
    private Integer h;
    @SerializedName("l")
    @Expose
    private Integer l;
    @SerializedName("s")
    @Expose
    private Integer s;
    @SerializedName("percentage")
    @Expose
    private Double percentage;
    @SerializedName("population")
    @Expose
    private Integer population;

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

}