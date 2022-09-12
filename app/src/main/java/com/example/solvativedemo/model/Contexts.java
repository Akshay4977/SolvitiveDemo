package com.example.solvativedemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Contexts {

    @SerializedName("groupings")
    @Expose
    private List<String> groupings = null;

    public List<String> getGroupings() {
        return groupings;
    }

    public void setGroupings(List<String> groupings) {
        this.groupings = groupings;
    }

}
