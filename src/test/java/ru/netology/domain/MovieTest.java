package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private final Movie temp = new Movie(1, "/img/img01.jpeg", "Serenity", "thriller");

    @Test
    void shouldGetId() {
        int expected = 1;
        int actual = temp.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetId() {
        int expected = 2;
        temp.setId(2);
        int actual = temp.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetImg() {
        String expected = "/img/img01.jpeg";
        String actual = temp.getImg();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetImg() {
        String expected = "/img/img02.jpeg";
        temp.setImg("/img/img02.jpeg");
        String actual = temp.getImg();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetName() {
        String expected = "Serenity";
        String actual = temp.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetName() {
        String expected = "True Detective";
        temp.setName("True Detective");
        String actual = temp.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetGenre() {
        String expected = "thriller";
        String actual = temp.getGenre();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetGenre() {
        String expected = "detective";
        temp.setGenre("detective");
        String actual = temp.getGenre();

        assertEquals(expected, actual);
    }
}