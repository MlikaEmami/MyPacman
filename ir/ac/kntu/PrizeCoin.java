package ir.ac.kntu;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class PrizeCoin extends Point{
    private Coordinate position;
    private int Score;
    public PrizeCoin(Coordinate position) {
        super(position, Color.GREENYELLOW);    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int point) {
        this.Score = Score;
    }
}
