package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class PosterManager {
    private final int limit;
    private PosterItem[] movies = new PosterItem[0];

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    ///добавление фильма
    public void add(PosterItem movie) {
        PosterItem[] tmp = new PosterItem[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    ///вывод всех фильмов в порядке добавления
    public PosterItem[] findAll() {
        if (movies.length > limit) {
            PosterItem[] tmp = new PosterItem[movies.length - 1];
            System.arraycopy(movies, 0, tmp, 0, movies.length - 1);
            this.movies = tmp;
        }
        return movies;
    }


    ///вывод в обратном порядке
    public PosterItem[] findLast() {
        int resultLength = limit;
        if (movies.length < limit) {
            resultLength = movies.length;
        }

        PosterItem[] reversed = new PosterItem[resultLength];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }
}




