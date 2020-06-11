package com.lisz;

public abstract class Item {
    protected Creator creator;
    protected String title;
    protected int year;

    public Item(Creator creator, String title, int year) {
        this.creator = creator;
        this.title = title;
        this.year = year;
    }

    public Creator getCreator() {
        return creator;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    protected boolean matches(String keyword) {
        return this.title.toLowerCase().indexOf(keyword.toLowerCase()) != -1;
    }

    protected boolean matches(Creator creator) {
        return this.creator == creator;
    }

}
