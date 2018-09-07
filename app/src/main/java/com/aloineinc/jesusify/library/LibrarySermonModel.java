package com.aloineinc.jesusify.library;

public class LibrarySermonModel {

    private int libraryImage;
    private int libraryImagestatus;
    private String librarySermonTitle;
    private String librarySermonPreacher;
    private String librarySermonDate;
    private String librarySermonDuration;

    public LibrarySermonModel() {
    }

    public LibrarySermonModel(int libraryImage, String librarySermonTitle, String librarySermonPreacher, String librarySermonDate, String librarySermonDuration, int libraryImagestatus) {
        this.libraryImage = libraryImage;
        this.librarySermonTitle = librarySermonTitle;
        this.librarySermonPreacher = librarySermonPreacher;
        this.librarySermonDate = librarySermonDate;
        this.librarySermonDuration = librarySermonDuration;
        this.libraryImagestatus = libraryImagestatus;
    }

    public int getLibraryImage() {
        return libraryImage;
    }

    public String getLibrarySermonTitle() {
        return librarySermonTitle;
    }

    public String getLibrarySermonPreacher() {
        return librarySermonPreacher;
    }

    public String getLibrarySermonDate() {
        return librarySermonDate;
    }

    public String getLibrarySermonDuration() {
        return librarySermonDuration;
    }

    public int getLibraryImagestatus() {
        return libraryImagestatus;
    }

    public void setLibraryImage(int libraryImage) {
        this.libraryImage = libraryImage;
    }

    public void setLibrarySermonTitle(String librarySermonTitle) {
        this.librarySermonTitle = librarySermonTitle;
    }

    public void setLibrarySermonPreacher(String librarySermonPreacher) {
        this.librarySermonPreacher = librarySermonPreacher;
    }

    public void setLibrarySermonDate(String librarySermonDate) {
        this.librarySermonDate = librarySermonDate;
    }

    public void setLibrarySermonDuration(String librarySermonDuration) {
        this.librarySermonDuration = librarySermonDuration;
    }

    public void setLibraryImagestatus(int libraryImagestatus) {
        this.libraryImagestatus = libraryImagestatus;
    }
}
