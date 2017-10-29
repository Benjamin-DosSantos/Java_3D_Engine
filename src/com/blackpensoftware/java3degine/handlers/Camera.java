package com.blackpensoftware.java3degine.handlers;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/
public class Camera {
    private int lastXPos;
    private int lastYPos;
    private int lastZPos;
    private int currentXPos;
    private int currentYPos;
    private int currentZPos;
    
    public void lockInChanges(){
        lastXPos = currentXPos;
        lastYPos = currentYPos;
        lastZPos = currentZPos;
    }
    
    public void changeXPos(int xChange){
        currentXPos += xChange;
    }

    public void changeYPos(int yChange){
        currentYPos += yChange;
    }

    public void changeZPos(int zChange){
        currentZPos += zChange;
    }
    
    public int getXChange(){
        return currentXPos - lastXPos;
    }
    
    public int getYChange(){
        return currentYPos - lastYPos;
    }
    
    public int getZChange(){
        return currentZPos - lastZPos;
    }
}// End of class
