package org.example;

import java.util.Map;

public class JapaneseMovie implements Checking {

  public Map<String, Double> movieReviewMap = Map.of("SLAMDUNK", 4.3, "千と千尋の神隠し", 4.1,
      "22年目の告白私が殺人犯です", 3.6, "怒り", 3.9, "横道世之介", 3.9);

  public Map<String, Double> reviewMap() {
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
