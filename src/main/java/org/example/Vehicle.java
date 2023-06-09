package org.example;

public class Vehicle {
    String model;
    String color;
    int wheel;

    void startEngine(){
        System.out.println("시동걸기");
    }
    void accelerate(){
        System.out.println("속도 올리기");
    }
    void brake(){
        System.out.println("브레이크!");
    }
}
