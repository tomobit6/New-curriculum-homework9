package org.example;

import java.util.Map;

public class Main {

  public static void main(String[] args) {

    //使ってないのはあとLISTと例外処理とスイッチケース
    System.out.println("高評価の邦画は以下の通りです。");

    JapaneseMovieCollection movieCollection = new JapaneseMovieCollection();

    movieCollection.addMovie(new JapaneseMovie("SLAMDUNK", 4.3));
    movieCollection.addMovie(new JapaneseMovie("千と千尋の神隠し", 4.1));
    movieCollection.addMovie(new JapaneseMovie("22年目の告白私が殺人犯です", 3.6));
    movieCollection.addMovie(new JapaneseMovie("怒り", 3.9));
    movieCollection.addMovie(new JapaneseMovie("横道世之介", 3.9));

    // 評価が4.0以上の映画情報を出力
    movieCollection.getMovies().stream()
        .filter(movie -> movie.getMovieReviewRating() >= 4.0)
        .forEach(movie ->
            System.out.println(
                "タイトル: " + movie.getMovieName() + " 評価: " + movie.getMovieReviewRating()));

    System.out.println("----------------------------------------------------");
    Checking westernMovies = new WesternMovie();
    westernMovies.extraction();
    Map<String, Double> movieReview2 = westernMovies.reviewMap();

    System.out.println("----------------------------------------------------");
    System.out.println("今日はどれにしますか？");

    System.out.println("----------------------------------------------------");

    // 最高評価の邦画を出力
    Checking bestMovieChecker = new JapaneseBestMovie(movieCollection);
    bestMovieChecker.extraction();
  }
}
