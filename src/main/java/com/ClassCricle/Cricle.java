package com.ClassCricle;

public class Cricle {
    private double radius;
    private String color;
    public Cricle(){}
    public Cricle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea (){
        return Math.PI*radius*radius;
    }
    public double getPrimetter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "I am a Cricle with radius = "+ getRadius() +", I have Area = " + getArea() + " and Primeter = "+ getPrimetter()
                + " Color is "+ getColor();
    }
}
