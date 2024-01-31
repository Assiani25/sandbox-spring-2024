package com.csc205.project1;

/*
I asked the AI to create a new class called Point, which has the following methods:

A constructor that takes x and y coordinates as double arguments
setX(double x), setY(double y) - standard setters
getX(), getY() - standard getters
setPoint(double x, double y) - set the coordinates of the point.
shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
distance(Point p2) - finds the distance to point p2.
rotate(double angle) - rotates the point by a specified (radian) angle around the origin.

I then asked the AI if it was compatible with the PointTest class. Which is said it did.
I added a line on the test class which printed "All tests passed!" to the console to help gauge that, and the test passed.
*/
public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Standard getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Standard setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift the point along the x-axis
    public void shiftX(double n) {
        this.x += n;
    }

    // Shift the point along the y-axis
    public void shiftY(double n) {
        this.y += n;
    }

    // Find the distance to another point
    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Rotate the point by a specified angle around the origin
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }
}
