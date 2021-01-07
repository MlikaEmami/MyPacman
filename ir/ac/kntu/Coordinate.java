package ir.ac.kntu;

import javafx.scene.Node;

public class Coordinate {
    private int x;
    private int y;
    private int type;
    private Node holdedObject;

    /**
     * type attributes
     * 0 -- Empty
     * 1 -- Wall
     * 2 -- Coin
     * 3 -- Pacman
     * 4 -- Ghost
     * 5 -- PenaltyCoin
     * 6 -- PrizeCoin
     */


    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
        this.type = 0;
    }

    public void setHoldedObject(Node holdedObject) {
        this.holdedObject = holdedObject;
    }

    public Node getHoldedObject(){
        if (holdedObject == null) {

        }
        return holdedObject;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEmpty() {
        return type == 0;
    }

    public boolean isWall() {
        return type == 1;
    }
    public boolean isPoint() {
        return type == 2;
    }

    public boolean isPacman() {
        return type == 3;
    }
    public boolean isGhost() {
        return type == 4;
    }
    public boolean isPenaltyCoin() {
        return type == 5;
    }
    public boolean isPrizeCoin() {
        return type == 6;
    }


    public void makeEmpty() {
        type = 0;
    }

    public void makeWall() {
        type = 1;
    }

    public void makePoint() {
        type = 2;
    }

    public void makePacman() {
        type = 3;
    }

    public void makeGhost() {
        type = 4;
    }

    public void makePenaltyCoin() {
        type = 5;
    }

    public void makePrizeCoin() {
        type = 6;
    }



    public String toString() {
        return "[" + x + ", " + y + "] = " +   (isEmpty()?"Empty":( (isWall()?"Box":(isPoint()?"Point":"Pacman"))));
    }

    /*@Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                ", type=" + type +
                ", holdedObject=" + holdedObject +
                '}';
    }*/
}
