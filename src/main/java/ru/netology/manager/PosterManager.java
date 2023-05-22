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
        if (movies.length > limit) {
            PosterItem[] tmp = new PosterItem[movies.length - 1];
            for (int i = 0; i < movies.length - 1; i++) {
                tmp[i] = movies[i];
            }
            this.movies = tmp;
        }
        return movies;
    }


    ///вывод в обратном порядке
    public PosterItem[] findLast() {
        int resultLength = limit;
        if (movies.length > limit) {                                    //не записываем фильмы сверх лимита
            PosterItem[] tmp = new PosterItem[movies.length - 1];
            for (int i = 0; i < movies.length - 1; i++) {
                tmp[i] = movies[i];
            }
            this.movies = tmp;
        } else if (movies.length < limit) {                             //если фильмов мельше лимита, устанавливаем новый
            resultLength = movies.length;}

            PosterItem[] reversed = new PosterItem[resultLength];       //переворачиваем массив

            for (int i = 0; i < reversed.length; i++) {
                reversed[i] = movies[movies.length - 1 - i];
            }
            return reversed;
        }
}




