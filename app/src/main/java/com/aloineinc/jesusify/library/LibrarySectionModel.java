package com.aloineinc.jesusify.library;

import java.util.List;

public class LibrarySectionModel {

    private String libraryDate;
    private List<LibrarySermonModel> librarySermonList;

    public void setLibraryDate(String libraryDate) {
        this.libraryDate = libraryDate;
    }

    public void setLibrarySermonList(List<LibrarySermonModel> librarySermonList) {
        this.librarySermonList = librarySermonList;
    }

    public String getLibraryDate() {

        return libraryDate;
    }

    public List<LibrarySermonModel> getLibrarySermonList() {
        return librarySermonList;
    }

    public LibrarySectionModel(String libraryDate, List<LibrarySermonModel> librarySermonList) {

        this.libraryDate = libraryDate;
        this.librarySermonList = librarySermonList;
    }

    public LibrarySectionModel() {

    }
}
