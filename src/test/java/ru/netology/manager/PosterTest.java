package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

public class PosterTest {
    PosterManager manager = new PosterManager();
    PosterItem item1 = new PosterItem(1, 111, "Бладшот");
    PosterItem item2 = new PosterItem(2, 236, "Вперёд");
    PosterItem item3 = new PosterItem(3, 45, "Отель 'Белград'");
    PosterItem item4 = new PosterItem(4, 90, "Джентельмены");
    PosterItem item5 = new PosterItem(5, 125, "Человек - невидимка");
    PosterItem item6 = new PosterItem(6, 436, "Тролли. Мировой тур");
    PosterItem item7 = new PosterItem(7, 32, "Номер один");

    @Test
    public void shouldAddedMovies() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item6);
        manager.add(item7);

        PosterItem[] expected = {item1, item2, item6, item7};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdded1Movie() {
        manager.add(item4);

        PosterItem[] expected = {item4};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMovie() {
        PosterItem[] expected = {};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldReverse5Items() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);

        PosterItem[] expected = {item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReverseUnderLimit() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);

        PosterItem[] expected = {item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseWithSetLimit() {
        PosterManager manager = new PosterManager(7);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}

