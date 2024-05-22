package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplStubTest {

  @Test
  void findTheGreatestFromAllData_basicScenario() {
    DataServiceStub dataServiceStub = new DataServiceStub();
    SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
    int result = businessImpl.findTheGreatestFromAllData();
    assertEquals(25, result);
  }

  @Test
  void findTheGreatestFromAllData_withOneValue() {
    DataServiceStub2 dataServiceStub = new DataServiceStub2();
    SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
    int result = businessImpl.findTheGreatestFromAllData();
    assertEquals(25, result);
  }
}

class DataServiceStub implements DataService {
  public int[] retrieveAllData() {
    return new int[] { 25, 15, 5 };
  }
}

class DataServiceStub2 implements DataService {
  public int[] retrieveAllData() {
    return new int[] { 25 };
  }
}
