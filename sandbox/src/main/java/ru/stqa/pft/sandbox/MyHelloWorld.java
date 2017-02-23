package ru.stqa.pft.sandbox;

public class MyHelloWorld {

    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Alexandr");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со стопронами " + r.a + " и " + r.b + " = " + area(r));
        }


    public static void hello(String somebody) { // String somebody -  это параметр (или аргумент) функции hello
        System.out.println("Hello, " + somebody + "!");

    }

    public static double area (Square s){
        return s.l * s.l;

    }

    public static double area ( Rectangle r){
        return r.a * r.b;
    }
}
