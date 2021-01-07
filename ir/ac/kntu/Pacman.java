package ir.ac.kntu;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Pacman extends Arc {
    private Coordinate position;

    public Pacman() {
        super(75.0D, 75.0D, 20.0D, 20.0D, 45.0D, 270.0D);
        this.setFill(Color.rgb(253, 255, 0));
        this.setType(ArcType.ROUND);
        this.position = new Coordinate(1, 1);
    }

    public Coordinate getPosition() {
        return this.position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
        this.move(position);
    }

    public void move(Coordinate position) {
        this.setCenterX((double)(position.getX() * 50 + 25));
        this.setCenterY((double)(position.getY() * 50 + 25));
    }

    public void rotateUp() {
        this.setStartAngle(135.0D);
    }

    public void rotateRight() {
        this.setStartAngle(45.0D);
    }

    public void rotateDown() {
        this.setStartAngle(315.0D);
    }

    public void rotateLeft() {
        this.setStartAngle(225.0D);
    }
}