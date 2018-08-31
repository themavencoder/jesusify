package com.aloineinc.jesusify.mainscreen.pastor;

public class SermonModel {
        private int sermonImage;
        private String sermonName;
        private String sermonDate;
        private String sermonDownloads;

    public void setSermonImage(int sermonImage) {
        this.sermonImage = sermonImage;
    }

    public void setSermonName(String sermonName) {
        this.sermonName = sermonName;
    }

    public void setSermonDate(String sermonDate) {
        this.sermonDate = sermonDate;
    }

    public void setSermonDownloads(String sermonDownloads) {
        this.sermonDownloads = sermonDownloads;
    }

    public int getSermonImage() {

        return sermonImage;
    }

    public String getSermonName() {
        return sermonName;
    }

    public String getSermonDate() {
        return sermonDate;
    }

    public String getSermonDownloads() {
        return sermonDownloads;
    }

    public SermonModel(int sermonImage, String sermonName, String sermonDate, String sermonDownloads) {

        this.sermonImage = sermonImage;
        this.sermonName = sermonName;
        this.sermonDate = sermonDate;
        this.sermonDownloads = sermonDownloads;
    }

    public SermonModel() {

    }
}
