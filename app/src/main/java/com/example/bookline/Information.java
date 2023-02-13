package com.example.bookline;

public class Information {
    private String name;
    private String information;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation() {
        this.information = information;
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {
        this.rating= rating;
    }

    public String getBestSentence() {
        return bestSentence;
    }

    public void setBestSentence() {
        this.bestSentence = bestSentence;
    }

    private String bestSentence;
}
