package com.company;

import java.util.ArrayList;

public class Main {
    public static class Circle{
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculatePerimeter() {
            return 2 * radius * Math.PI;
        }

        public double calculateArea() {
            return Math.pow(radius , 2) * Math.PI;
        }

        public void draw() {
            //draw a circle
        }

        public boolean equals(Circle c1 , Circle c2) {
            if (c1 == c2) return true;
            return false;
        }

        public void shapeToString() {
            System.out.println("A circle with " + radius + " radius");
        }

        public double getRadius() {
            return radius;
        }
    }

    public static class Triangle {
        private ArrayList<Double> sides;

        public Triangle(double side1 , double side2 , double side3) {
            if (!check(side1, side2, side3)) {
                System.out.println("sides are not valid");
                return;
            } else {
                sides = new ArrayList<>();
                sides.add(side1);
                sides.add(side2);
                sides.add(side3);
            }

        }

        private boolean check(double side1 , double side2 , double side3) {
            double check3 = side1 + side2;
            double check2 = side1 + side3;
            double check1 = side2 + side3;
            if (check1 > side1 && check2 > side2 && check3 > side3) return true;
            return false;
        }

        public double calculatePerimeter() {
            return sides.get(0) + sides.get(1) + sides.get(2);
        }

        public double calculateArea() {
            double p = calculatePerimeter() / 2;
            return Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
        }

        public void draw() {
            //draw a circle
        }

        public boolean equals(Triangle t1 , Triangle t2) {
            if (t1 == t2) return true;
            return false;
        }

        public boolean isEquilateral() {
            if (sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2))) return true;
            return false;
        }

        public void shapeToString() {
            System.out.println("A triangle with sides of this size : "
                    + sides.get(0) + " " + sides.get(1) + " " + sides.get(2));
        }

        public ArrayList<Double> getSides() {
            return sides;
        }
    }

    public static class Rectangle{
        ArrayList<Double> sides;

        public Rectangle(double length , double width) {
            sides = new ArrayList<>();
            sides.add(length);
            sides.add(width);
            sides.add(length);
            sides.add(width);
        }

        public double calculatePerimeter() {
            return 2 * ( sides.get(0) + sides.get(1) );
        }

        public double calculateArea() {
            return sides.get(0) * sides.get(1);
        }

        public void draw() {
            //draw a circle
        }

        public boolean equals(Rectangle r1 , Rectangle r2) {
            if (r1 == r2) return true;
            return false;
        }

        public boolean isSquare() {
            if (sides.get(0).equals(sides.get(1))) return true;
            return false;
        }

        public void shapeToString() {
            System.out.println("A Rectangle with length of : " + sides.get(0) + " and width of : " + sides.get(1));
        }

        public ArrayList<Double> getSides() {
            return sides;
        }
    }

    public static class Paint {
        ArrayList<Rectangle> rectangles;
        ArrayList<Circle> circles;
        ArrayList<Triangle> triangles;

        public Paint() {
            rectangles = new ArrayList<>();
            circles = new ArrayList<>();
            triangles = new ArrayList<>();
        }

        public void addCircle(Circle circle){
            circles.add(circle);
        }

        public void addRectangle(Rectangle rectangle) {
            rectangles.add(rectangle);
        }

        public void addTriangle(Triangle triangle) {
            triangles.add(triangle);
        }

        public void drawAll() {
            //draw all
        }

        public void printAll() {
            for (Circle c : circles) {
                c.shapeToString();
            }

            for (Triangle t : triangles) {
                t.shapeToString();
            }

            for (Rectangle r : rectangles) {
                r.shapeToString();
            }
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);

        Rectangle rectangle1 = new Rectangle(1 , 4);
        Rectangle rectangle2 = new Rectangle(8 , 5);
        Rectangle rectangle3 = new Rectangle(6 , 6);

        Triangle triangle1 = new Triangle(2 , 2 , 2);
        Triangle triangle2 = new Triangle(4 , 4 , 6);

        Paint paint = new Paint();

        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rectangle1);
        paint.addRectangle(rectangle2);
        paint.addRectangle(rectangle3);
        paint.addTriangle(triangle1);
        paint.addTriangle(triangle2);
        paint.printAll();
        paint.drawAll();
    }
}
