package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

  @Mock
  private DataService dataServiceMock;

  @InjectMocks
  private SomeBusinessImpl businessImpl;

  @Test
  void findTheGreatestFromAllData_basicScenario() {
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 25, 15, 5 });
    assertEquals(25, businessImpl.findTheGreatestFromAllData());
  }

  @Test
  void findTheGreatestFromAllData_OneValue() {
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 35 });
    assertEquals(35, businessImpl.findTheGreatestFromAllData());
  }

  @Test
  void findTheGreatestFromAllData_EmptyValue() {
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
    assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
  }
}