package com.blackpensoftware.java3degine.core;

import com.blackpensoftware.java3degine.handlers.Camera;
import com.blackpensoftware.java3degine.handlers.KeyboardInputHandler;
import com.blackpensoftware.java3degine.handlers.ObjectHandler;
import com.blackpensoftware.java3degine.handlers.PauseHandler;
import com.blackpensoftware.java3degine.primitives.Object3D;
import com.blackpensoftware.java3degine.primitives.VectorPoint;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/
public class DrawPanel extends JPanel {
    ObjectHandler mainObjectHandler;
    Camera mainCamera;
    PauseHandler pauseHandler;
    KeyboardInputHandler keyboardInputHandler;
    
    public DrawPanel(Camera mainCamera){
        this.mainCamera = mainCamera;
        
        setFocusable(true);
        requestFocusInWindow();
        setBackground(Color.darkGray);
        setVisible(true);
        
        pauseHandler = new PauseHandler();
        mainObjectHandler = new ObjectHandler();
        keyboardInputHandler = new KeyboardInputHandler(pauseHandler, mainCamera);
        
        addKeyListener(keyboardInputHandler);
        
        Object3D testObject = new Object3D(
                new VectorPoint(100, 200, 10), 
                new VectorPoint(150, 200, 10),
                new VectorPoint(135, 250, 10)
        );
        mainObjectHandler.addObject(testObject);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        runFrameChange();
        mainObjectHandler.drawAllObjects(g);
        repaint();
    }// End of paintComponent method

    private void runFrameChange(){
        if(!pauseHandler.isPaused()){
            keyboardInputHandler.doCameraChanges();
            mainObjectHandler.processCameraChanges(mainCamera);   
        }
    }
    
    public ObjectHandler getMainObjectHandler() {
        return mainObjectHandler;
    }

    public void setMainObjectHandler(ObjectHandler mainObjectHandler) {
        this.mainObjectHandler = mainObjectHandler;
    }
}// End of class
