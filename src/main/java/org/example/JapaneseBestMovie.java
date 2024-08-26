package org.example;

import java.util.HashMap;
import java.util.Map;

public class JapaneseBestMovie extends JapaneseMovie {

  private JapaneseMovieCollection movieCollection;

  public JapaneseBestMovie(JapaneseMovieCollection movieCollection) {
    super(null, 0.0);
    this.movieCollection = movieCollection;
  }

  @Override
  public Map<String, Double> reviewMap() {
    Map<String, Double> movieReviewMap = new HashMap<>();
    for (JapaneseMovie movie : movieCollection.getMovies()) {
      movieReviewMap.put(movie.getMovieName(), movie.getMovieReviewRating());
    }
    return movieReviewMap;
  }

  @Override
  public void extraction() {
    Map<String, Double> movieReviewMap = reviewMap();
    if (movieReviewMap.isEmpty()) {
      System.out.println("映画のデータがありません。");
      return;
    }

    String maxKey = null;
    double maxValue = 0.0;

    for (Map.Entry<String, Double> entry : movieReviewMap.entrySet()) {
      if (entry.getValue() > maxValue) {
        maxKey = entry.getKey();
        maxValue = entry.getValue();
      }
    }

    System.out.println("ちなみに、最も評価が高い邦画は、タイトル:" + maxKey + "　評価数：" + maxValue);
  }
}
