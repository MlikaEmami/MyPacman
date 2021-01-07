package ir.ac.kntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application{
    //private Coordinate[][] coordinates = new Coordinate[20][12];
    Pane layout;

    @Override
    public void start(Stage primaryStage){
        //Create base layout
        layout = new Pane();
        layout.setStyle("-fx-background-color: #071735");

        Map map = new Map(layout);

        //Add pacman to the layout
        Pacman pacman = new Pacman();
        layout.getChildren().add(pacman);
        map.getCoordinates()[1][10].makePacman();

        //Add ghosts to the layout

        //blue
        SmartGhost smartGhost = new SmartGhost(9,4);
        //red
        VerticalGhost verticalGhost= new VerticalGhost(18,5);
        //green
        HorizontalGhost horizontalGhost= new HorizontalGhost(16,10);

        layout.getChildren().add(smartGhost);
        layout.getChildren().add(verticalGhost);
        layout.getChildren().add(horizontalGhost);

        new Timer().schedule(new TimerTask()
        {
            public void run()
            {
                smartGhost.move(pacman.getPosition());
                verticalGhost.move(pacman.getPosition());
                horizontalGhost.move(pacman.getPosition());

                //The task you want to do
            }

        },0,1000);


        //Handle keyboard inputs(events)

        //Handler handler = new Handler();
        layout.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                if (!map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() - 1].isWall()) {
                    if (map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() -1].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() -1].getHoldedObject()
                        );
                        // game over
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isGhost()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );;
                        }*/
                        //prize
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //deleting 5 normal coin
                        }*/
                        //penalty
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/
                    }
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()-1].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX(), pacman.getPosition().getY() -1));
                }
                pacman.rotateUp();

            }
            if (e.getCode() == KeyCode.DOWN) {
                if (!map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isWall()) {
                    if (map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                        );;
                        // game over
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isGhost()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );
                        }*/
                        //prize
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //deleting 5 normal coin
                        }*/
                        //penalty
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/
                    }
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()+1].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX(), pacman.getPosition().getY() + 1));
                }
                pacman.rotateDown();
            }
            if (e.getCode() == KeyCode.RIGHT) {
                if (!map.getCoordinates()[pacman.getPosition().getX()+1][pacman.getPosition().getY()].isWall()) {
                    if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                        );
                        // game over
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isGhost()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );;
                        }*/
                        //prize
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //deleting 5 normal coin
                        }*/
                        //penalty
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/
                    }

                    map.getCoordinates()[pacman.getPosition().getX()+1][pacman.getPosition().getY()].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX()+1, pacman.getPosition().getY()));
                }
                pacman.rotateRight();
            }
            if (e.getCode() == KeyCode.LEFT) {
                if (!map.getCoordinates()[pacman.getPosition().getX()-1][pacman.getPosition().getY()].isWall()) {
                    if (map.getCoordinates()[pacman.getPosition().getX() - 1][pacman.getPosition().getY()].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX() - 1][pacman.getPosition().getY()].getHoldedObject()
                        );;
                        // game over
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isGhost()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );;
                        }*/
                        //prize
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //deleting 5 normal coin
                        }*/
                        //penalty
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/
                    }
                    map.getCoordinates()[pacman.getPosition().getX()-1][pacman.getPosition().getY()].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX()-1, pacman.getPosition().getY()));
                }
                pacman.rotateLeft();
            }
        });


        primaryStage.setScene(new Scene(layout, 20*50, 13*50));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Pacman By Mel*_*");
        primaryStage.show();
        layout.requestFocus();
    }
    //Reset button
    //Button reset = new Button("Reset");
        /*Button show = new Button("Show");
        show.setOnAction(e -> {
            map.printCurrent();
            layout.requestFocus();
        });
        show.setLayoutX(100);*/
        /*reset.setOnAction(e -> {
            map.resetPoints();
            layout.requestFocus();
        });
        layout.getChildren().addAll(reset, show);*/


}