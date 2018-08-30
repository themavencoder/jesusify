package com.aloineinc.jesusify.mainscreen.pastor;

public class SectionModel {

    private String sermonName;

    public SectionModel(String sermonName) {
        this.sermonName = sermonName;
    }

    public SectionModel() {

    }

    public String getSermonName() {
        return sermonName;
    }

    public void setSermonName(String sermonName) {
        this.sermonName = sermonName;
    }
}
