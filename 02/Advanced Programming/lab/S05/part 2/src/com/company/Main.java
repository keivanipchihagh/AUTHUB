package com.company;

import java.util.ArrayList;

public class Main {
    public static class Paint{
        ArrayList<Shape> shapes;

        public Paint() {
            shapes = new ArrayList<>();
        }

        public void addShape(Shape shape){
            this.shapes.add(shape);
        }

        public void drawAll() {

        }

        public void printAll() {
            for (Shape s :
                 shapes) {
                s.shapeToString();
            }
        }
    }

    public static class Shape extends Paint {

        public double calculatePerimeter() {
            return 0;
        }

        public double calculateArea() {
            return 0;
        }

        public void draw() {
            //draw
        }

        public void shapeToString() {
            System.out.println();
        }

        public boolean equals(Shape s1 , Shape s2) {
            if (s1 == s2) return true;
            return false;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super();
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double calculatePerimeter() {
            return 2 * radius * Math.PI;
        }

        public double calculateArea() {
            return Math.pow(radius , 2) * Math.PI;
        }

        public void shapeToString() {
            System.out.println("A circle with " + radius + " radius");
        }
    }

    public static class Polygon extends Shape{
        private ArrayList<Integer> sides;

        public Polygon(int... sides) {
            super();
            this.sides = new ArrayList<>();
            for (int i : sides) {
                this.sides.add(i);
            }
        }

        public void shapeToString() {
            System.out.print("A shape with sides of : ");
            for (int i : sides) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public ArrayList<Integer> getSides() {
            return sides;
        }
    }

    public static class Rectangle extends Polygon{
        public Rectangle(int... sides) {
            super(sides);
        }

        public boolean isSquare() {
            if (getSides().get(0).equals(getSides().get(1))) return true;
            return false;
        }
    }

    public static class Triangle extends Polygon{
        public Triangle(int... sides) {
            super(sides);
        }

        public double calculateArea() {
            double p = calculatePerimeter() / 2;
            return Math.sqrt(p * (p - getSides().get(0)) * (p - getSides().get(1)) * (p - getSides().get(2)));
        }

        public boolean isEquilateral() {
            if (getSides().get(0).equals(getSides().get(1)) && getSides().get(0).equals(getSides().get(2))) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Shape circle2 = new Circle(3);

        Rectangle rectangle1 = new Rectangle(1 , 4 , 1 , 4);
        Polygon rectangle2 = new Rectangle(8 , 5 , 8 , 5);
        Rectangle rectangle3 = new Rectangle(6 , 6 , 6 , 6);

        Polygon triangle1 = new Triangle(2 , 2 , 2);
        Triangle triangle2 = new Triangle(4 , 4 , 6);
        Triangle triangle3 = new Triangle(2 , 2 , 2);

        circle1 = (Circle) circle2;
        rectangle2 = rectangle3;
        triangle1 = triangle3;
        circle2 = triangle3;
        triangle3 = triangle2;

        //rectangle3 = new Triangle(2 , 3 , 2);
        //rectangle3.shapeToString();
    }
}
