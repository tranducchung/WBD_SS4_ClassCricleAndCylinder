package com.ClassCricle;

public class Cylinder extends Cricle {
    private  double height;
    public Cylinder( double height){
        this.height = height;
    }
    public Cylinder(double radius, double height,String color){
        super(radius,color);
        this.height = height;
    }
    private double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Volume (){
        return super.getArea() * getHeight();
    }
    @Override
    public String toString(){
        return "I am Cylinder width radius = "+ super.getRadius() + ", height = "+ getHeight() + " and I have Volume = " + Volume() +
                " Color is " + super.getColor();
    }
}
