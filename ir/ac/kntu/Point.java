package ir.ac.kntu;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Point extends Circle {
    private int score;
    private Coordinate position;

    public Point(Coordinate position) {
        super(position.getX() * 50 + 25, position.getY() * 50 + 25, 5, Color.WHITE);
    }
    public Point(Coordinate position,Color color) {
        super(position.getX() * 50 + 25, position.getY() * 50 + 25, 5,color);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

}

