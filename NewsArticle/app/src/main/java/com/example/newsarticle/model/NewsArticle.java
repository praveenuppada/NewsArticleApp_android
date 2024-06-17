package com.example.newsarticle.model;

public class NewsArticle {

    private String title;
    private String description;
    private String author;
    private String imageUrl;

    public NewsArticle(String title, String description, String author, String imageUrl) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.imageUrl = imageUrl;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
