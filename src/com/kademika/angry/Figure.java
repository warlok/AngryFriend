package com.kademika.angry;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * Created by dean on 4/9/15.
 */
public class Figure {

    private int x=100;
    private int y=100;
    private Shape shape;
    private Dimension dimention;
    Color color = new Color(255,10,2);

    public Figure() {
        dimention = new Dimension(100,100);
        shape = new Ellipse2D.Double(x,y,dimention.getWidth(),dimention.getHeight());
    }

    public void changeCoordinate() {
        Random rand = new Random();
        x = rand.nextInt(700);
        y = rand.nextInt(500);
        if (x < 100 || y < 100) {
            changeCoordinate();
        }
        shape = new Ellipse2D.Double(x,y,dimention.getWidth(),dimention.getHeight());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Dimension getDimention() {
        return dimention;
    }

    public void setDimention(Dimension dimention) {
        this.dimention = dimention;
    }

}
