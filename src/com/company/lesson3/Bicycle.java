package com.company.lesson3;

public class Bicycle {
    int weight;
    String model;
    public void ride(){

    }
    public class SteeringWheel{
        public void left(){
            System.out.println("LEFT");
        }
        public void right(){
            System.out.println("RIGHT");
        }
    }
    public class Seat {
        public void up(){
            System.out.println("UP");
        }
        public void down(){
            System.out.println("DOWN");
        }
    }
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Seat seat = bicycle.new Seat();
    }
}
