package ru.netology.domain;

public class PosterItem {
    private int id;
    private int movieId;
    private String movieTitle;

    public PosterItem(int id, int movieId, String movieTitle) {
        this.id = id;
        this.movieId = movieId;
        this.movieTitle = movieTitle;
    }

    public PosterItem() {
        int sizeLimit;

    }

    public PosterItem(int sizeLimit) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String setMovieTitle() {
        return movieTitle;
    }

    public void getMovieTitle() {
        this.movieTitle = movieTitle;
    }

}
