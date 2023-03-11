package com.example.pacman;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PacManGame extends Application {
    private static final int TILE_SIZE = 40;
    private static final int WIDTH = 28;
    private static final int HEIGHT = 31;

    private Image pacManImage;
    private int pacManX = 0;
    private int pacManY = 0;
    private int pacManDirection = 1; // 0=up, 1=right, 2=down, 3=left

    private boolean[][] walls = {
            {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
            {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true},
            {true, false, true, true, false, true, true, true, false, true, true, true, false, true, true, true, false, true, false, true},
            {true, false, true, false, false, true, false, false, false, true, false, false, false, true, false, false, false, true, false, true},
            {true, false, true, false, true, true, true, true, false, true, true, true, false, true, true, true, false, true, false, true},
            {true, false, true, false, true, false, false, true, false, false, false, true, false, false, true, false, false, true, false, true},
            {true, false, true, false, true, false, true, true, true, true, true, true, true, false, true, false, true, true, false, true},
            {true, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true},
            {true, true, true, false, true, true, true, true, false, true, false, true, true, true, true, true, true, true, false, true},
            {false, false, false, false, true, false, false, true, false, true, false, true, false, false, false, false, false, false, false, true},
            {true, true, true, false, true, true, false, true, false, true, true, true, false, true, true, true, true, true, false, true}};

}