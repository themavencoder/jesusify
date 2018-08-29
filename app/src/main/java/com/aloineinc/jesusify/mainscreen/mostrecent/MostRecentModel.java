package com.aloineinc.jesusify.mainscreen.mostrecent;

public class MostRecentModel {

    private String sermon;
    private String preacher;
    private String duration;
    private String dateRealeased;
    private String downloads;
    private int photo;

    public MostRecentModel() {
    }

    public MostRecentModel(String sermon, String preacher, String duration, String dateRealeased, String downloads, int photo) {
        this.sermon = sermon;
        this.preacher = preacher;
        this.duration = duration;
        this.dateRealeased = dateRealeased;
        this.downloads = downloads;
        this.photo = photo;
    }

    //Getter


    public String getSermon() {
        return sermon;
    }

    public String getPreacher() {
        return preacher;
    }

    public String getDuration() {
        return duration;
    }

    public String getDateRealeased() {
        return dateRealeased;
    }

    public String getDownloads() {
        return downloads;
    }

    public int getPhoto() {
        return photo;
    }

    //Setter


    public void setSermon(String sermon) {
        this.sermon = sermon;
    }

    public void setPreacher(String preacher) {
        this.preacher = preacher;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDateRealeased(String dateRealeased) {
        this.dateRealeased = dateRealeased;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
