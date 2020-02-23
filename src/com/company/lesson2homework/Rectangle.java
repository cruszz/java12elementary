package com.company.lesson2homework;

public class Rectangle {
    private int left;
    private int top;
    private int width;
    private int height;

    public void initialize (int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;

    }

    public void initialize (int left, int top) {
        this.left = left;
        this.top = top;
        this.height = 0;
        this.width = 0;

    }

    public void initialize (int left, int top,int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;


    }

    public void initialize (Rectangle r) {
        this.left = r.left;
        this.top = r.top;
        this.width = r.width;
        this.height = r.height;
    }
}
