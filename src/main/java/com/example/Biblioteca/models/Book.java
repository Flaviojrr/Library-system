package com.example.Biblioteca.models;

public class Book {
    private String title;
    private String author;
    private String release_date_of;
    private String gender;
    private String publishing_company;
    private String sinopse;

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

    public String getRelease_date_of() {
        return release_date_of;
    }

    public void setRelease_date_of(String release_date_of) {
        this.release_date_of = release_date_of;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPublishing_company() {
        return publishing_company;
    }

    public void setPublishing_company(String publishing_company) {
        this.publishing_company = publishing_company;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
