package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    private AfishaManager list = new AfishaManager();
    private AfishaManager list1 = new AfishaManager(5);

    private Movie first = new Movie(1, "/img/img01.jpeg", "Serenity", "thriller");
    private Movie second = new Movie(2, "/img/img02.jpeg", "True Detective", "detective");
    private Movie third = new Movie(3, "/img/img03.jpeg", "Begin again", "drama");
    private Movie fourth = new Movie(4, "/img/img04.jpeg", "The Gentlemen", "crime");
    private Movie fifth = new Movie(5, "/img/img05.jpeg", "The Terminal", "drama");
    private Movie sixth = new Movie(6, "/img/img06.jpeg", "As Good as It Gets", "comedy");
    private Movie seventh = new Movie(7, "/img/img07.jpeg", "Grandma's Boy", "comedy");
    private Movie eighth = new Movie(8, "/img/img08.jpeg", "The Exorcist", "horror");
    private Movie ninth = new Movie(9, "/img/img09.jpeg", "Jonathan Strange and Mr Norrell", "fantasy");
    private Movie tenth = new Movie(10, "/img/img10.jpeg", "Taboo", "thriller");
    private Movie eleventh = new Movie(11, "/img/img11.jpeg", "The Expanse", "science fiction");

    @Test
    void shouldAddOneItem() {
        list.add(first);

        Movie[] actual = list.getAll();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }

    //-----------First Construct------------
    @Test
    void shouldAdd() {
        list.add(first);
        list.add(second);
        list.add(third);

        Movie[] actual = list.getAll();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAllLessTen() {
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        list.add(sixth);

        Movie[] actual = list.getAll();
        Movie[] expected = new Movie[]{sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAllTen() {
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        list.add(sixth);
        list.add(seventh);
        list.add(eighth);
        list.add(ninth);
        list.add(tenth);

        Movie[] actual = list.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetMoreTen() {
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        list.add(sixth);
        list.add(seventh);
        list.add(eighth);
        list.add(ninth);
        list.add(tenth);
        list.add(eleventh);

        Movie[] actual = list.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    //-----------Second Construct------------
    @Test
    void shouldGetAllLessMax() {
        list1.add(first);
        list1.add(second);
        list1.add(third);
        list1.add(fourth);

        Movie[] actual = list1.getAll();
        Movie[] expected = new Movie[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAllMax() {
        list1.add(first);
        list1.add(second);
        list1.add(third);
        list1.add(fourth);
        list1.add(fifth);

        Movie[] actual = list1.getAll();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetMoreMax() {
        list1.add(first);
        list1.add(second);
        list1.add(third);
        list1.add(fourth);
        list1.add(fifth);
        list1.add(sixth);

        Movie[] actual = list1.getAll();
        Movie[] expected = new Movie[]{sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }
}