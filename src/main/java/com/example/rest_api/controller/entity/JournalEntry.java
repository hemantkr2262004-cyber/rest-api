package com.example.rest_api.controller.entity;

public class JournalEntry {
    private long id;

    private String title;

    private String content;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
}
