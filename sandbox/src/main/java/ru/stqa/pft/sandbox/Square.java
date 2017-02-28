package ru.stqa.pft.sandbox;

/**
 * Created by invizzible13 on 23.02.17.
 */
public class Square {

  public double l;

  public Square (double l){
    this.l = l;
  }

  public double area (Square s){ //дописал подсчет площади квадрата, так как без него не запускался тест
    return this.l * l;
}
}
