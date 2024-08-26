package org.example;

import java.util.Map;

public class WesternMovie implements Checking {

  public Map<String, Double> reviewMap() {
    Map<String, Double> movieReviewMap = Map.of("ショーシャンクの空に", 4.3, "インセプション", 4.1,
        "ゴーンガール", 3.8, "MASK", 3.7, "天使がくれた時間", 3.9);
    for (Map.Entry<String, Double> entry : movieReviewMap.entrySet()) {
      if (entry.getValue() >= 4.0) {
        System.out.println("タイトル:" + entry.getKey() + "　評価数：" + entry.getValue());
      }
    }
    return movieReviewMap;
  }

  @Override
  public void extraction() {
    System.out.println("高評価の洋画は以下の通りです。");
  }
}
