package ir.ac.kntu;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Wall extends Rectangle{

    public Wall(Coordinate coordinate) {
        super(coordinate.getX()*50, coordinate.getY()*50, 50,50);
        setFill(Color.GRAY);
        setStroke(Color.BLACK);
        setArcHeight(13);
        setArcWidth(13);
    }

}
