package org.example;

import java.util.HashMap;
import java.util.Map;

public class JapaneseMovie implements Checking {

  public String movieName;
  public double movieReviewRating;

  public JapaneseMovie(String movieName, Double movieReviewRating) {
    this.movieName = movieName;
    this.movieReviewRating = movieReviewRating;
  }

  public String getMovieName() {
    return movieName;
  }

  public double getMovieReviewRating() {
    return movieReviewRating;
  }

  @Override
  public Map<String, Double> reviewMap() {
    // ここでは単一の映画情報しか持っていないので、単一のエントリを返します
    Map<String, Double> movieReviewMap = new HashMap<>();
    movieReviewMap.put(movieName, movieReviewRating);
    return movieReviewMap;
  }

  @Override
  public void extraction() {
  }
}


