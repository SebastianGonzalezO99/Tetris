/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tetris2024;

/**
 *
 * @author alu13114532
 */
public class Shape {

    private Tetronimus pieceShape;
    private int coordinates[][];

    private static int[][][] coordsTable = new int[][][]{
        {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
        {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}},
        {{0, -1}, {0, 0}, {1, 0}, {1, 1}},
        {{0, -1}, {0, 0}, {0, 1}, {0, 2}},
        {{-1, 0}, {0, 0}, {1, 0}, {0, 1}},
        {{0, 0}, {1, 0}, {0, 1}, {1, 1}},
        {{-1, -1}, {0, -1}, {0, 0}, {0, 1}},
        {{1, -1}, {0, -1}, {0, 0}, {0, 1}}
    };

    public Shape() {
        int randomShape = (int) (Math.random() * 7) + 1;
        pieceShape = Tetronimus.values()[randomShape];
        coordinates = new int[4][2];
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0 ; j < coordinates[0].length; j++) {
               coordinates[i][j] = coordsTable[randomShape][i][j];
            }
        }
    }
    
    public int getX(int index) {
        return coordinates[index][0];
    }
    
        public int getY(int index) {
        return coordinates[index][1];
    }
        
        public Tetronimus getShape () {
            return pieceShape;
        }
}
