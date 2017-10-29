package com.blackpensoftware.java3degine.handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/
public class KeyboardInputHandler implements KeyListener{
    private PauseHandler pauseHandler;
    private Camera camera;
    
    ArrayList<Integer> keys = new ArrayList<Integer>();
    
    public KeyboardInputHandler(PauseHandler pauseHandler, Camera camera){
        this.pauseHandler = pauseHandler;
        this.camera = camera;
    }// End of constructor
    
    public void doCameraChanges(){
        for(Integer currentInt: keys){
            switch (currentInt){
                case 87:    // W
                    camera.changeYPos(1);
                    break;
                case 65:    // A
                    camera.changeXPos(1);
                    break;
                case 83:    // S
                    camera.changeYPos(-1);
                    break;
                case 68:    // D
                    camera.changeXPos(-1);
                    break;
            }
        }
    }
    
    public void keyPressed(KeyEvent keyPressed){
        if(keyPressed.getKeyCode() == 27){
            pauseHandler.togglePause();
        }else{
            keys.add(keyPressed.getKeyCode());
        }
    }

    public void keyReleased(KeyEvent keyPressed){
        if(!(keyPressed.getKeyCode() == 27)){
            keys.remove((Integer) keyPressed.getKeyCode());
        }
    }
    
    public void keyTyped(KeyEvent keyPressed){
        
    }
}// End of class

