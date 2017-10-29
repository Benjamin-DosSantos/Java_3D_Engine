package com.blackpensoftware.java3degine.handlers;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/
public class PauseHandler {
    private boolean isPaused = false;
    
    public void togglePause(){
        isPaused = !isPaused;
        System.out.println("Paused: " + isPaused());
    }

    public boolean isPaused() {
        return isPaused;
    }
}// End of class
