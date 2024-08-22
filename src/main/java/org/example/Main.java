package org.example;

import java.util.Map;

public class Main {

  public static void main(String[] args) {

    //使ってないのはあとLISTと例外処理とスイッチケース
    Checking japaneseMovies = new JapaneseMovie();
    japaneseMovies.extraction();
    Map<String, Double> movieReview = japaneseMovies.reviewMap();

    System.out.println("----------------------------------------------------");
    Checking westernMovies = new WesternMovie();
    westernMovies.extraction();
    Map<String, Double> movieReview2 = westernMovies.reviewMap();

    System.out.println("----------------------------------------------------");
    System.out.println("今日はどれにしますか？");

    System.out.println("----------------------------------------------------");
    Checking japaneseMovie = new JapaneseBestMovie();
    Map<String, Double> japaneseBestMovie = japaneseMovie.reviewMap();
  }
}
