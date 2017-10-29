package com.blackpensoftware.java3degine.primitives;

import java.awt.*;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/

public class VectorPoint {
    private double xPos;
    private double yPos;
    private double zPos;
    private Color color;
    
    private VectorPoint(){}
    
    public VectorPoint(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = 0;
        this.color = Color.CYAN;
    }
    
    public VectorPoint(int xPos, int yPos, int zPos){
        this(xPos, yPos);
        this.zPos = zPos;
    }
    
    public VectorPoint(int xPos, int yPos, int zPos, Color color) {
        this(xPos, yPos, zPos);
        this.color = color;
    }

    public void movePoint(int xChange, int yChange, int zChange){
        this.xPos += xChange;
        this.yPos += yChange;
        this.zPos += zChange;
    }
    
    public void drawPoint(Graphics g){
        g.setColor(color);
        g.fillRect((int) xPos, (int) yPos, 10, 10);
    }
    
    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public double getzPos() {
        return zPos;
    }

    public void setzPos(double zPos) {
        this.zPos = zPos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}// End of class
