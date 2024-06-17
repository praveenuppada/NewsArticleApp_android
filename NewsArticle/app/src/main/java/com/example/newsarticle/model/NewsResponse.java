package com.example.newsarticle.model;

import java.util.List;

public class NewsResponse {
    private List<NewsArticle> articles;

    private List<NewsArticle> getArticles() {
        return articles;
    }
}
