package ru.netology.domain;

public class Movie {
    private int id;
    private String img;
    private String name;
    private String genre;

    public  Movie() {
    }

    public Movie(int id, String img, String name, String genre) {
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getImg() { return img; }

    public void setImg(String img) { this.img = img; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }
}
