package HomeAssignment;

/**
 * Created by invizzible13 on 23.02.17.
 */
public class RunPoints {

  public static void main(String[] args) {
    Points d = new Points(40.6, 20.3);
    System.out.println("Расстояние между точками " + "p1 " + "и " + "p2 " + "= " + distance(d) + " сантиметров ");

  }

  public static double distance(Points d){
    return d.p1 - d.p2;

  }
}

