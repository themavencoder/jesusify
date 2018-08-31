package com.aloineinc.jesusify.mainscreen.pastor;

public class SermonModel {

    private int sermonImage;
    private String sermonTitle;
    private String sermonPreacher;
    private String sermonDuration;
    private String sermonReleasedDate;

    public SermonModel() {
    }

    public void setSermonImage(int sermonImage) {
        this.sermonImage = sermonImage;
    }

    public void setSermonTitle(String sermonTitle) {
        this.sermonTitle = sermonTitle;
    }

    public void setSermonPreacher(String sermonPreacher) {
        this.sermonPreacher = sermonPreacher;
    }

    public void setSermonDuration(String sermonDuration) {
        this.sermonDuration = sermonDuration;
    }

    public void setSermonReleasedDate(String sermonReleasedDate) {
        this.sermonReleasedDate = sermonReleasedDate;
    }

    public void setSermonDownloads(String sermonDownloads) {
        this.sermonDownloads = sermonDownloads;
    }

    public int getSermonImage() {

        return sermonImage;
    }

    public String getSermonTitle() {
        return sermonTitle;
    }

    public String getSermonPreacher() {
        return sermonPreacher;
    }

    public String getSermonDuration() {
        return sermonDuration;
    }

    public String getSermonReleasedDate() {
        return sermonReleasedDate;
    }

    public String getSermonDownloads() {
        return sermonDownloads;
    }

    public SermonModel(int sermonImage, String sermonTitle, String sermonPreacher, String sermonDuration, String sermonReleasedDate, String sermonDownloads) {
        this.sermonImage = sermonImage;
        this.sermonTitle = sermonTitle;
        this.sermonPreacher = sermonPreacher;
        this.sermonDuration = sermonDuration;

        this.sermonReleasedDate = sermonReleasedDate;
        this.sermonDownloads = sermonDownloads;
    }

    private String sermonDownloads;
}
