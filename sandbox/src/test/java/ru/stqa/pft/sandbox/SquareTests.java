package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by invizzible13 on 23.02.17.
 */
public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square (5);
    Assert.assertEquals(s.area (s), 25.0); // площадь квадрата
  }
}
