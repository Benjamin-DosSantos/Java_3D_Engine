package com.blackpensoftware.java3degine.core;

import com.blackpensoftware.java3degine.handlers.Camera;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Benjamin DosSantos Jr. on 10/29/2017.
 * Property of Black Pen Software
 **/
public class Java3DEngine {
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static double width = screenSize.getWidth();
    static double height = screenSize.getHeight();
    
    public static void main(String[] args){
        Camera mainCamera = new Camera();
        
        JFrame mainFrame = new JFrame("Main Frame");
        JPanel mainPanel = new DrawPanel(mainCamera);
        
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize((int) width / 2, (int) height / 2);
        mainFrame.setLocation((int) width / 4, (int) height / 4);
        mainFrame.setBackground(Color.RED);
    }// End of main method
}// End of class
