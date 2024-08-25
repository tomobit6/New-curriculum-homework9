package org.example;


import java.util.HashMap;
import java.util.Map;

public class JapaneseBestMovie extends JapaneseMovie {

  String maxKey = null;
  Double maxValue = 0.0;

  public JapaneseBestMovie(String movieName, Double movieReviewRating) {
    super(movieName, movieReviewRating);
  }

  public Map<String, Double> reviewMap() {
    Map<String, Double> movieReviewMap = new HashMap<>();
    movieReviewMap.put(movie1.movieName, movie1.movieReviewRating);
    movieReviewMap.put(movie2.movieName, movie2.movieReviewRating);
    movieReviewMap.put(movie3.movieName, movie3.movieReviewRating);
    movieReviewMap.put(movie4.movieName, movie4.movieReviewRating);
    movieReviewMap.put(movie5.movieName, movie5.movieReviewRating);
    for (Map.Entry<String, Double> entry : movieReviewMap.entrySet()) {
      if (entry.getValue() > maxValue) {
        maxKey = entry.getKey();
        maxValue = entry.getValue();
      }
    }
    System.out.println("ちなみに、最も評価が高い邦画は、タイトル:" + maxKey + "　評価数：" + maxValue);
    return movieReviewMap;
  }
}
