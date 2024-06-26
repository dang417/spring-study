package com.in28minutes.learnspringaop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.in28minutes.learnspringaop.aopexample.data.DataService2;

@Service
public class BusinessService2 {
  private DataService2 dataService2;

  public BusinessService2(DataService2 dataService1) {
    this.dataService2 = dataService1;
  }

  public int calculateMin() {
    int[] data = dataService2.retrieveData();
    // throw new RuntimeException("Something Went Wrong!");

    try {
      Thread.sleep(30);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return Arrays.stream(data).min().orElse(0);
  }
}
