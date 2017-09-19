package com.serjardovic.testapp2.model;

import java.util.ArrayList;
import java.util.List;

public class ImageData {

    private List<String> allImages;
    private List<String> downloadedImages;
    private int currentPage;
    private int nextPage;

    public ImageData() {
        allImages = new ArrayList<>();
        downloadedImages = new ArrayList<>();
        currentPage = 0;
        nextPage = 1;
    }

    public List<String> getAllImages() {
        return allImages;
    }

    public List<String> getDownloadedImages() {
        return downloadedImages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
