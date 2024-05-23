package com.in28minutes.learnspringaop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
  public int[] retrieveData() {

    try {
      Thread.sleep(30);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return new int[] { 11, 22, 33, 44, 55 };
  }
}
