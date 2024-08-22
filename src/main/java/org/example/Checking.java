package org.example;

import java.util.Map;

public interface Checking {

  public Map<String, Double> reviewMap();

  void extraction();
}
//defaultにより実態があるため、implementsのエラーメッセージに出てこない。
