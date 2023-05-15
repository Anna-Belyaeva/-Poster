package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class PosterManager {
    private PosterItem[] movies = new PosterItem[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    ///добавление фильма
    public void add(PosterItem movie) {
        PosterItem[] tmp = new PosterItem[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    ///вывод всех фильмов в порядке добавления
    public PosterItem[] findAll() {
        return movies;
    }

    ///вывод в обратном порядке
    public PosterItem[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        PosterItem[] reversed = new PosterItem[resultLength];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }

}


