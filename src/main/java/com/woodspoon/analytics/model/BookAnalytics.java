package com.woodspoon.analytics.model;

public class BookAnalytics {

    private String bookIsbn;
    private long accessCount;

    public BookAnalytics() {
    }

    public BookAnalytics(String bookIsbn, long accessCount) {
        this.bookIsbn = bookIsbn;
        this.accessCount = accessCount;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public long getAccessCount() {
        return accessCount;
    }

    public void setAccessCount(long accessCount) {
        this.accessCount = accessCount;
    }

    public void incrementCount() {
        ++this.accessCount;
    }
}
