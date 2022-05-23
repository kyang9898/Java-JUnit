package com.win.junit;

public class Box {
    int width;
    int height;

    public Box(int w, int h) {
        width = w;
        height = h;
    }

    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
    }

    public boolean isEqual(Box b) {
        if (this.width == b.width && this.height == b.height) {
            return true;
        } else {
            return false;
        }
    }

    public Box duplicateBox() {
        Box temp = new Box(this.width, this.height);
        return temp;
    }

    public static boolean isEqual(Box b1, Box b2) {
        if (b1.width == b2.width && b1.height == b2.height) {
            return true;
        } else {
            return false;
        }
    }

    public String display() {
        return "The width of the box is " + this.width + " and the height of the box is " + this.height;
    }
}
