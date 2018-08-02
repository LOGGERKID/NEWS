package com.example.android.news;

public class News {
    private String newsHeadline;
    private String url;
    private String date;
    private String sectionName;
    private String author;



    public News(String newsHeadline, String date, String sectionName, String url,String author) {
        this.newsHeadline = newsHeadline;
        this.date = date;
        this.sectionName = sectionName;
        this.url=url;
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }
    public String getNewsHeadline() {
        return newsHeadline;
    }
    public String getDate() {
        return date;
    }
    public String getSectionName() {
        return sectionName;
    }
    public String getUrl() {
        return url;
    }
}
