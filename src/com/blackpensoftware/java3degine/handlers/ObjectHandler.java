package com.blackpensoftware.java3degine.handlers;

import com.blackpensoftware.java3degine.primitives.Object3D;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/
public class ObjectHandler {
    ArrayList<Object3D> allObjects = new ArrayList<Object3D>();
    
    public void addObject(Object3D objectToAdd){
        allObjects.add(objectToAdd);
    }
    
    public void removeObject(Object3D objectToRemove){
        if(allObjects.contains(objectToRemove)){
            allObjects.remove(objectToRemove);
        }else{
            System.out.println("The object you are trying to remove isn't in the scene");
        }
    }
    
    public void drawAllObjects(Graphics g){
        for(Object3D currentObject: allObjects){
            currentObject.drawObject(g);
        }
    }
}// End of class
