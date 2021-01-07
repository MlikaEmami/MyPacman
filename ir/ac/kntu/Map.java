package ir.ac.kntu;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Map {
    int points = 0;
    Text pointsEarned;

    public static Coordinate[][] getCoordinates() {
        return coordinates;
    }

    private static Coordinate[][] coordinates = new Coordinate[20][12];
    private Pane layout;

    public Map(Pane _layout) {
        layout = _layout;
        setCoordinates();
        createMap();
        createPoints();
        pointsEarned = new Text("Score: " + points);
        pointsEarned.setFill(Color.DARKRED);
        pointsEarned.setFont(Font.font(23));
        pointsEarned.setX(17 * 50);
        pointsEarned.setY(635);
        layout.getChildren().add(pointsEarned);
    }

    //divara ro set mikonim
    private void createMap() {
        //new Coordinate[20][12];
        for (int i = 0; i < 20; i++) {
            //bala
            coordinates[i][0].makeWall();
            coordinates[i][0].setHoldedObject(new Wall(coordinates[i][0]));
            layout.getChildren().add(coordinates[i][0].getHoldedObject());
            //paiin
            coordinates[i][11].makeWall();
            coordinates[i][11].setHoldedObject(new Wall(coordinates[i][11]));
            layout.getChildren().add(coordinates[i][11].getHoldedObject());


            if (i > 2 && i < 9) {
                coordinates[3][i].makeWall();
                coordinates[3][i].setHoldedObject(new Wall(coordinates[3][i]));
                layout.getChildren().add(coordinates[3][i].getHoldedObject());
                coordinates[16][i].makeWall();
                coordinates[16][i].setHoldedObject(new Wall(coordinates[16][i]));
                layout.getChildren().add(coordinates[16][i].getHoldedObject());

            }
            if (i > 4 && i < 15) {
                coordinates[i][2].makeWall();
                coordinates[i][2].setHoldedObject(new Wall(coordinates[i][2]));
                layout.getChildren().add(coordinates[i][2].getHoldedObject());
                coordinates[i][9].makeWall();
                coordinates[i][9].setHoldedObject(new Wall(coordinates[i][9]));
                layout.getChildren().add(coordinates[i][9].getHoldedObject());
            }

            //divar rast o chap
            if (i > 0 && i < 11) {
                coordinates[0][i].makeWall();
                coordinates[0][i].setHoldedObject(new Wall(coordinates[0][i]));
                layout.getChildren().add(coordinates[0][i].getHoldedObject());
                coordinates[19][i].makeWall();
                coordinates[19][i].setHoldedObject(new Wall(coordinates[19][i]));
                layout.getChildren().add(coordinates[19][i].getHoldedObject());
            }
        }

        //vasat
        coordinates[9][5].makeWall();
        coordinates[9][5].setHoldedObject(new Wall(coordinates[9][5]));
        layout.getChildren().add(coordinates[9][5].getHoldedObject());
        coordinates[10][5].makeWall();
        coordinates[10][5].setHoldedObject(new Wall(coordinates[10][5]));
        layout.getChildren().add(coordinates[10][5].getHoldedObject());
        coordinates[9][6].makeWall();
        coordinates[9][6].setHoldedObject(new Wall(coordinates[9][6]));
        layout.getChildren().add(coordinates[9][6].getHoldedObject());
        coordinates[10][6].makeWall();
        coordinates[10][6].setHoldedObject(new Wall(coordinates[10][6]));
        layout.getChildren().add(coordinates[10][6].getHoldedObject());

    }

    private void setCoordinates() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 12; j++) {
                coordinates[i][j] = new Coordinate(i, j);
                coordinates[i][j].makeEmpty();
                //layout.getChildren().add(new Wall(coordinates[i][j]));
            }
        }
    }

    public void resetPoints() {
        points = 0;
        updatePointer();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 20; j++) {
                if (coordinates[j][i].isEmpty()) {
                    if (coordinates[j][i].getHoldedObject() != null) {
                        if (coordinates[j][i].getHoldedObject() instanceof Point) {
                            layout.getChildren().add(coordinates[j][i].getHoldedObject());
                            coordinates[j][i].makePoint();
                        }
                    }
                }
            }
        }
    }

    public void updatePointer() {
        if (points == 68) {
            /*Pane layout;
            layout = new Pane();
            layout.setStyle("-fx-background-color: black");
            Stage primaryStage = null;
            primaryStage.setScene(new Scene(layout, 20*50, 20*50));
            primaryStage.setResizable(false);
            primaryStage.setTitle("YOU WON!!!");*/
            pointsEarned.setText("You Won!!!");
            pointsEarned.setFont(Font.font(40));
            pointsEarned.setX(8 * 50);
            pointsEarned.setY(300);
        } else {
            pointsEarned.setText("Score: " + points);
        }
    }


    public void printCurrent() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%s ", coordinates[j][i].isEmpty() ? "1" : "0");
            }
            System.out.println();
        }
        System.out.println();
    }


    private void createPoints() {
        for (int i = 2 ; i < 19; i++) {
            coordinates[i][1].makePoint();
            coordinates[i][1].setHoldedObject(new Point(coordinates[i][1]));
            layout.getChildren().add(coordinates[i][1].getHoldedObject());
            coordinates[i][10].makePoint();
            coordinates[i][10].setHoldedObject(new Point(coordinates[i][10]));
            layout.getChildren().add(coordinates[i][10].getHoldedObject());
            /*coordinates[1][i].makePoint();
            coordinates[1][i].setHoldedObject(new Point(coordinates[1][i]));
            layout.getChildren().add(coordinates[1][i].getHoldedObject());*/
            if (i > 3 && i < 8 || i > 11 && i < 16) {
                coordinates[i][3].makePoint();
                coordinates[i][3].setHoldedObject(new Point(coordinates[i][3]));
                layout.getChildren().add(coordinates[i][3].getHoldedObject());
                coordinates[i][8].makePoint();
                coordinates[i][8].setHoldedObject(new Point(coordinates[i][8]));
                layout.getChildren().add(coordinates[i][8].getHoldedObject());
            }
            if (i > 7 && i < 12) {
                coordinates[i][4].makePoint();
                coordinates[i][4].setHoldedObject(new Point(coordinates[i][4]));
                layout.getChildren().add(coordinates[i][4].getHoldedObject());
                coordinates[i][7].makePoint();
                coordinates[i][7].setHoldedObject(new Point(coordinates[i][7]));
                layout.getChildren().add(coordinates[i][7].getHoldedObject());
            }

            if (i > 4 && i < 7) {
                coordinates[8][i].makePoint();
                coordinates[8][i].setHoldedObject(new PenaltCoin(coordinates[8][i]));
                layout.getChildren().add(coordinates[8][i].getHoldedObject());
                coordinates[11][i].makePoint();
                coordinates[11][i].setHoldedObject(new PrizeCoin(coordinates[11][i]));
                layout.getChildren().add(coordinates[11][i].getHoldedObject());
            }

//            if (i > 1 && i < 5) {
//                coordinates[i][10].makePoint();
//                coordinates[i][10].setHoldedObject(new Point(coordinates[i][10]));
//                layout.getChildren().add(coordinates[i][10].getHoldedObject());
//            }

            if (i > 1 && i < 5) {
                coordinates[i][9].makePoint();
                coordinates[i][9].setHoldedObject(new PenaltCoin(coordinates[i][9]));
                layout.getChildren().add(coordinates[i][9].getHoldedObject());
            }
            if (i > 14 && i < 18) {
                coordinates[i][9].makePoint();
                coordinates[i][9].setHoldedObject(new PrizeCoin(coordinates[i][9]));
                layout.getChildren().add(coordinates[i][9].getHoldedObject());
            }


//            coordinates[i][9].makePoint();
//            coordinates[i][9].setHoldedObject(new PrizeCoin(coordinates[i][9]));
//            layout.getChildren().add(coordinates[i][9].getHoldedObject());
//                coordinates[2][10].makePoint();
//                coordinates[2][10].setHoldedObject(new Point(coordinates[2][10]));
//                layout.getChildren().add(coordinates[2][10].getHoldedObject());
//                coordinates[3][10].makePoint();
//                coordinates[3][10].setHoldedObject(new Point(coordinates[3][10]));
//                layout.getChildren().add(coordinates[3][10].getHoldedObject());
//                coordinates[4][10].makePoint();
//                coordinates[4][10].setHoldedObject(new Point(coordinates[4][10]));
//                layout.getChildren().add(coordinates[4][10].getHoldedObject());

//            coordinates[1][10].makePoint();
//            coordinates[1][10].setHoldedObject(new Point(coordinates[1][10]));
//            layout.getChildren().add(coordinates[1][10].getHoldedObject());
//            for (int j=0 ; j < 12 ; j++){
//                if(j > 3 && j < 7){
//                    coordinates[1][j].makePoint();
//                    coordinates[1][j].setHoldedObject(new Point(coordinates[1][j]));
//                    layout.getChildren().add(coordinates[1][j].getHoldedObject());
//                    coordinates[18][j].makePoint();
//                    coordinates[18][j].setHoldedObject(new PrizeCoin(coordinates[18][j]));
//                    layout.getChildren().add(coordinates[18][j].getHoldedObject());
//
//                }
//                if(j > 3 && j < 8){
//                    coordinates[4][j].makePoint();
//                    coordinates[4][j].setHoldedObject(new PrizeCoin(coordinates[4][j]));
//                    layout.getChildren().add(coordinates[4][j].getHoldedObject());
//
//                }
//                coordinates[2][5].makePoint();
//                coordinates[2][5].setHoldedObject(new PenaltCoin(coordinates[2][5]));
//                layout.getChildren().add(coordinates[2][5].getHoldedObject());
        }
//        coordinates[1][10].makePoint();
//        coordinates[1][10].setHoldedObject(new Point(coordinates[1][10]));
//        layout.getChildren().add(coordinates[1][10].getHoldedObject());
    }

}
