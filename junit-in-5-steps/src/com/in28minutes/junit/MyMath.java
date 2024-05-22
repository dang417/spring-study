package com.in28minutes.junit;

public class MyMath {
  int sum = 0;

  public int calculateSum(int[] numbers) {
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
