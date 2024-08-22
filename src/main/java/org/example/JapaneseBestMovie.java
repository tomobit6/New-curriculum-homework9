package org.example;


import java.util.Map;

public class JapaneseBestMovie extends JapaneseMovie {

  String maxKey = null;
  Double maxValue = 0.0;

  public Map<String, Double> reviewMap() {
    for (Map.Entry<String, Double> entry : super.movieReviewMap.entrySet()) {
      if (entry.getValue() > maxValue) {
        maxKey = entry.getKey();
        maxValue = entry.getValue();
      }
    }
    System.out.println("ちなみに、最も評価が高い邦画は、タイトル:" + maxKey + "　評価数：" + maxValue);
    return movieReviewMap;
  }
}
