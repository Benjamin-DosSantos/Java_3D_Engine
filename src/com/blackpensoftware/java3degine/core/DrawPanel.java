package com.blackpensoftware.java3degine.core;

import com.blackpensoftware.java3degine.handlers.ObjectHandler;
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
    
    public DrawPanel(){
        setBackground(Color.darkGray);
        setVisible(true);
        
        mainObjectHandler = new ObjectHandler();
        
        Object3D testObject = new Object3D(new VectorPoint(100, 200, 10), new VectorPoint(150, 200, 10));
        mainObjectHandler.addObject(testObject);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        mainObjectHandler.drawAllObjects(g);
    }// End of paintComponent method

    public ObjectHandler getMainObjectHandler() {
        return mainObjectHandler;
    }

    public void setMainObjectHandler(ObjectHandler mainObjectHandler) {
        this.mainObjectHandler = mainObjectHandler;
    }
}// End of class
