package com.aloineinc.jesusify.mainscreen.pastor;

import java.util.List;

public class SectionModel {

    private String sermonName;
    private List<SermonModel> sermonList;

    public SectionModel(String sermonName, List<SermonModel> sermonList) {
        this.sermonName = sermonName;
        this.sermonList = sermonList;
    }

    public SectionModel() {

    }

    public String getSermonName() {
        return sermonName;
    }

    public void setSermonName(String sermonName) {
        this.sermonName = sermonName;
    }

    public void setSermonList(List<SermonModel> sermonList) {
        this.sermonList = sermonList;
    }

    public List<SermonModel> getSermonList() {
        return sermonList;
    }
}
