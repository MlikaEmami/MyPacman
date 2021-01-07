package ir.ac.kntu;

import javafx.scene.input.KeyCode;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Handler {
    /*layout.setOnKeyPressed(e -> {
        if (e.getCode() == KeyCode.UP) {
            if (!map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() - 1].isBox()) {
                if (map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() -1].isPoint()) {
                    map.points++;
                    map.updatePointer();
                    layout.getChildren().remove(
                            map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() -1].getHoldedObject()
                    );
                }
                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()-1].makePacman();
                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                pacman.setPosition(new Coordinate(pacman.getPosition().getX(), pacman.getPosition().getY() -1));
            }
            pacman.rotateUp();
        }
        if (e.getCode() == KeyCode.DOWN) {
            if (!map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isBox()) {
                if (map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isPoint()) {
                    map.points++;
                    map.updatePointer();
                    layout.getChildren().remove(
                            map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                    );;
                }
                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()+1].makePacman();
                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                pacman.setPosition(new Coordinate(pacman.getPosition().getX(), pacman.getPosition().getY() + 1));
            }
            pacman.rotateDown();
        }
        if (e.getCode() == KeyCode.RIGHT) {
            if (!map.getCoordinates()[pacman.getPosition().getX()+1][pacman.getPosition().getY()].isBox()) {
                if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPoint()) {
                    map.points++;
                    map.updatePointer();
                    layout.getChildren().remove(
                            map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                    );
                }

                map.getCoordinates()[pacman.getPosition().getX()+1][pacman.getPosition().getY()].makePacman();
                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                pacman.setPosition(new Coordinate(pacman.getPosition().getX()+1, pacman.getPosition().getY()));
            }
            pacman.rotateRight();
        }
        if (e.getCode() == KeyCode.LEFT) {
            if (!map.getCoordinates()[pacman.getPosition().getX()-1][pacman.getPosition().getY()].isBox()) {
                if (map.getCoordinates()[pacman.getPosition().getX() - 1][pacman.getPosition().getY()].isPoint()) {
                    map.points++;
                    map.updatePointer();
                    layout.getChildren().remove(
                            map.getCoordinates()[pacman.getPosition().getX() - 1][pacman.getPosition().getY()].getHoldedObject()
                    );;
                }
                map.getCoordinates()[pacman.getPosition().getX()-1][pacman.getPosition().getY()].makePacman();
                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                pacman.setPosition(new Coordinate(pacman.getPosition().getX()-1, pacman.getPosition().getY()));
            }
            pacman.rotateLeft();
        }
    });*/
}
