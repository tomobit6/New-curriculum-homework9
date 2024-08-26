package org.example;

import java.util.ArrayList;
import java.util.List;

public class JapaneseMovieCollection {

  private List<JapaneseMovie> movies;

  public JapaneseMovieCollection() {
    this.movies = new ArrayList<>();
  }

  public void addMovie(JapaneseMovie movie) {
    movies.add(movie);
  }

  public List<JapaneseMovie> getMovies() {
    return movies;
  }
}
