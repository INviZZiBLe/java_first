package ru.stqa.pft.sandbox;

public class MyHelloWorld {

    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Alexandr");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со стопронами " + a + " и " + b + " = " + area(a,b));
        }


    public static void hello(String somebody) { // String somebody -  это параметр (или аргумент) функции hello
        System.out.println("Hello, " + somebody + "!");

    }

    public static double area (double len){
        return len * len;

    }

    public static double area (double a, double b){
        return a * b;
    }
}
