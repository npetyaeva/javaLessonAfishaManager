package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private Movie first = new Movie(1, "/img/img01.jpeg", "Serenity", "thriller");

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
    void getImg() {
        String expected = "/img/img01.jpeg";
        String actual = first.getImg();

        assertEquals(expected, actual);
    }

    @Test
    void setImg() {
        String expected = "/img/img02.jpeg";
        first.setImg("/img/img02.jpeg");
        String actual = first.getImg();

        assertEquals(expected, actual);
    }

    @Test
    void getName() {
        String expected = "Serenity";
        String actual = first.getName();

        assertEquals(expected, actual);
    }

    @Test
    void setName() {
        String expected = "True Detective";
        first.setName("True Detective");
        String actual = first.getName();

        assertEquals(expected, actual);
    }

    @Test
    void getGenre() {
        String expected = "thriller";
        String actual = first.getGenre();

        assertEquals(expected, actual);
    }

    @Test
    void setGenre() {
        String expected = "detective";
        first.setGenre("detective");
        String actual = first.getGenre();

        assertEquals(expected, actual);
    }
}