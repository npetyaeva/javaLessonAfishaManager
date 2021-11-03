package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private final Movie first = new Movie(1, "/img/img01.jpeg", "Serenity", "thriller");

    @Test
    void shouldGetId() {
        int expected = 1;
        int actual = first.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetId() {
        int expected = 2;
        first.setId(2);
        int actual = first.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetImg() {
        String expected = "/img/img01.jpeg";
        String actual = first.getImg();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetImg() {
        String expected = "/img/img02.jpeg";
        first.setImg("/img/img02.jpeg");
        String actual = first.getImg();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetName() {
        String expected = "Serenity";
        String actual = first.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetName() {
        String expected = "True Detective";
        first.setName("True Detective");
        String actual = first.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetGenre() {
        String expected = "thriller";
        String actual = first.getGenre();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetGenre() {
        String expected = "detective";
        first.setGenre("detective");
        String actual = first.getGenre();

        assertEquals(expected, actual);
    }
}