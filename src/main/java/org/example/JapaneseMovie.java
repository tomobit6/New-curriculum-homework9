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

  JapaneseMovie movie1 = new JapaneseMovie("SLAMDUNK", 4.3);
  JapaneseMovie movie2 = new JapaneseMovie("千と千尋の神隠し", 4.1);
  JapaneseMovie movie3 = new JapaneseMovie("22年目の告白私が殺人犯です", 3.6);
  JapaneseMovie movie4 = new JapaneseMovie("怒り", 3.9);
  JapaneseMovie movie5 = new JapaneseMovie("横道世之介", 3.9);

  public Map<String, Double> reviewMap() {
    Map<String, Double> movieReviewMap = new HashMap<>();
    movieReviewMap.put(movie1.movieName, movie1.movieReviewRating);
    movieReviewMap.put(movie2.movieName, movie2.movieReviewRating);
    movieReviewMap.put(movie3.movieName, movie3.movieReviewRating);
    movieReviewMap.put(movie4.movieName, movie4.movieReviewRating);
    movieReviewMap.put(movie5.movieName, movie5.movieReviewRating);
    movieReviewMap.entrySet().stream()
        .filter(entry -> entry.getValue() >= 4.0)
        .map(entry -> "タイトル:" + entry.getKey() + "　評価数：" + entry.getValue())
        .forEach(System.out::println);
    return movieReviewMap;
  }

  @Override
  public void extraction() {
    System.out.println("高評価の邦画は以下の通りです。");
  }
}
