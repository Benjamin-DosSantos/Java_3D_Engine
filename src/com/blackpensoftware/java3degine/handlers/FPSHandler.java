package com.blackpensoftware.java3degine.handlers;

/**
 * Created by ddos_365 on 10/30/17.
 * Copyright Black Pen Software (c) All Rights Reserved
 */

public class FPSHandler {
    private long startTime;
    private int framesPassed;
    
    private int maxFPS;
    private int minFPS;
    private double averageFPS;
    private int timePassedInSeconds;
    
    public FPSHandler(){
        startTime = System.currentTimeMillis();    
        framesPassed = 0;
        averageFPS = 0;
        maxFPS = 0;
        minFPS = 1000000;
        timePassedInSeconds = 0;
    }
    
    public void updateFPS(){
        if(System.currentTimeMillis() - startTime >= 1){
            System.out.println(framesPassed);
            checkIfFrameAmountIsSpecial(framesPassed);
            timePassedInSeconds++;
            framesPassed = 0;
        }else{
            framesPassed++;
        }
    }
    
    private void checkIfFrameAmountIsSpecial(int framesPassed){
        if(framesPassed > this.maxFPS){
            this.maxFPS = framesPassed;
        }else if(framesPassed < this.minFPS){
            this.minFPS = framesPassed;
        }
    }
    
    public void printFPSData(){
        
    }
    
}// End of class
