package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {


    @Test
    public void shouldShowAllMovies() {

        PosterManager manager = new PosterManager();

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");
        manager.addMovie("movie11");

        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8", "movie9", "movie10", "movie11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFirstThreeMovies() {

        PosterManager manager = new PosterManager(3);

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");

        String[] expected = {"movie1", "movie2", "movie3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotAddMovies() {

        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllMoviesInReverseOrder() {

        PosterManager manager = new PosterManager(11);

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");
        manager.addMovie("movie11");

        String[] expected = {"movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFourMovies() {

        PosterManager manager = new PosterManager(4);

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");


        String[] expected = {"movie8", "movie7", "movie6", "movie5"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotShowLastMovies() {

        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedMoviesLessThanLimit() {

        PosterManager manager = new PosterManager(7);

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");


        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedMoviesMoreThanLimit() {

        PosterManager manager = new PosterManager();

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");
        manager.addMovie("movie11");

        String[] expected = {"movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
