package ru.netology.domain;

public class AfishaManager {
    private Movie[] movies = new Movie[0];
    private int numberMovies = 10;

    public AfishaManager() {}

    public AfishaManager(int numberMovies) { this.numberMovies = numberMovies; }

    // public int getNumberMovies() { return numberMovies; }

    public void add(Movie newItem) {
        boolean contains = false;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getImg() == newItem.getImg() && movies[i].getName() == newItem.getName() && movies[i].getGenre() == newItem.getGenre()) {
            // if (movies[i].equals(newItem)) {
                contains = true;
            };
        }

        if (!contains) {
            int length = movies.length + 1;

            Movie[] tmp = new Movie[length];
            System.arraycopy(movies, 0, tmp, 0, movies.length);

            tmp[tmp.length - 1] = newItem;
            movies = tmp;
        }
    }

    public Movie[] getAll() {
        int resultLength;
        if (movies.length < numberMovies) {
            resultLength = movies.length;
        } else {
            resultLength = numberMovies;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
