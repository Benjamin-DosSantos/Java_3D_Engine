package com.blackpensoftware.java3degine.primitives;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/
public class Object3D {
    ArrayList<VectorPoint> allPoints = new ArrayList<VectorPoint>();
    
    public Object3D(){
        // Empty objects
    }// End of constructor
    
    public Object3D(ArrayList<VectorPoint> allPoints){
        this.allPoints = allPoints;
    }
    
    public Object3D(VectorPoint... objectPoints){
        for(VectorPoint currentPoint: objectPoints){
            allPoints.add(currentPoint);
        }
    }
    
    public void drawObject(Graphics g){
        for(VectorPoint currentPoint: allPoints){
            currentPoint.drawPoint(g);
        }
    }
}// End of class
