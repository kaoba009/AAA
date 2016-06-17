package com.northgatecode.myblog.models;

import java.util.Date;

/**
 * Created by qianl on 6/17/2016.
 */
public class Post {
    private String title;
    private String author;
    private Date postDate;
    private String content;

    public Post() {
    }

    public Post(String title, String author, Date postDate, String content) {
        this.title = title;
        this.author = author;
        this.postDate = postDate;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", postDate=" + postDate +
                ", content='" + content + '\'' +
                '}';
    }
}
