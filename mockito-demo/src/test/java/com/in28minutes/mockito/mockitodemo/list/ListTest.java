package com.in28minutes.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

  @Test
  void simpleTest() {
    List listMock = mock(List.class);
    when(listMock.size()).thenReturn(3);
    assertEquals(3, listMock.size());
  }

  @Test
  void multipleReturns() {
    List listMock = mock(List.class);
    when(listMock.size()).thenReturn(1).thenReturn(2);
    assertEquals(1, listMock.size());
    assertEquals(2, listMock.size());
    assertEquals(2, listMock.size());
    assertEquals(2, listMock.size());
    assertEquals(2, listMock.size());
  }

  @Test
  void genericParameters() {
    List listMock = mock(List.class);
    when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
    assertEquals("Some String", listMock.get(0));
    assertEquals("Some String", listMock.get(6));
    assertEquals("Some String", listMock.get(3));
  }
}
