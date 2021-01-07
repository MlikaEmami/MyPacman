package ir.ac.kntu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public abstract class Ghost  extends ImageView implements AI{
    protected Directions lastDirection = Directions.LEFT;
    protected Directions curDirection;

    private Coordinate position;
    private Coordinate[][] mapCoordinates;

    public Ghost(String imgPath, int x, int y){
        super(new Image(imgPath));
        super.setFitWidth(40);
        super.setFitHeight(40);
        super.setLayoutX(x*50+25);
        super.setLayoutY(y*50+25);
        position = new Coordinate(x,y);
        mapCoordinates = Map.getCoordinates();
    }

    public Directions getMove(){
        return curDirection;
    }
    protected abstract Directions getAIMove();

    public boolean moveIsAllowed(Directions d)
    {
        if (d == Directions.UP && position.getX()>1 && !mapCoordinates[position.getX()][position.getY()-1].isWall())
            return true;
        if (d == Directions.DOWN && position.getY()<20*50 && !mapCoordinates[position.getX()][position.getY()+1].isWall())
            return true;
        if (d == Directions.LEFT && position.getY()>1 && !mapCoordinates[position.getX()-1][position.getY()].isWall())
            return true;
        if (d == Directions.RIGHT&& position.getX()<49 && !mapCoordinates[position.getX()+1][position.getY()].isWall())
            return true;
        else
            return false;
    }
    public void move(Coordinate pacPosition){
        tryMove(position.getX(),position.getY(),pacPosition.getX(),pacPosition.getY());

        switch (curDirection){
            case LEFT:
                position = new Coordinate(position.getX()-1,position.getY());
                break;
            case UP:
                position = new Coordinate(position.getX(),position.getY()-1);
                break;
            case DOWN:
                position = new Coordinate(position.getX(),position.getY()+1);
                break;
            case RIGHT:
                position = new Coordinate(position.getX()+1,position.getY());
                break;

            default:
                break;
        }

        super.setLayoutX(position.getX()*50);
        super.setLayoutY(position.getY()*50);
    }
    protected void tryMove(int curX, int curY, int targetX, int targetY){
        int horizontalDifference = curX - targetX;
        int verticalDifference = curY - targetY;

        /*if (horizontalDifference > 0){
            Directions preferredHorizontal = Directions.LEFT;
        }else{
            Directions preferredHorizontal = Directions.RIGHT;
        }

        if (verticalDifference > 0){
            Directions preferredVertical = Directions.UP;
        }else{
            Directions preferredVertical = Directions.DOWN;
        }*/

        Directions preferredHorizontal = horizontalDifference > 0 ? Directions.LEFT : Directions.RIGHT;
        Directions preferredVertical = verticalDifference > 0 ? Directions.UP : Directions.DOWN;

        boolean verticalMoreImportant = Math.abs(verticalDifference) > Math.abs(horizontalDifference);

        if (verticalMoreImportant)
            curDirection = preferredVertical;
        else
            curDirection = preferredHorizontal;

        if (!this.moveIsAllowed(curDirection)) {
            if (verticalMoreImportant) {
                if (lastDirection == Directions.LEFT || lastDirection == Directions.RIGHT) {
                    curDirection = lastDirection;
                    if (!this.moveIsAllowed(curDirection))
                        curDirection = curDirection == Directions.LEFT ? Directions.RIGHT : Directions.LEFT;
                } else {
                    curDirection = preferredHorizontal;
                    if (!this.moveIsAllowed(curDirection)) {
                        curDirection = preferredHorizontal == Directions.LEFT ? Directions.RIGHT : Directions.LEFT;
                        if (!this.moveIsAllowed(curDirection))
                            curDirection = preferredVertical == Directions.UP ? Directions.DOWN : Directions.UP;
                    }
                }
            } else {
                if (lastDirection == Directions.UP || lastDirection == Directions.DOWN) {
                    curDirection = lastDirection;
                    if (!this.moveIsAllowed(curDirection))
                        curDirection = curDirection == Directions.UP ? Directions.DOWN : Directions.UP;
                } else {
                    curDirection = preferredVertical;
                    if (!this.moveIsAllowed(curDirection)) {
                        curDirection = preferredVertical == Directions.UP ? Directions.DOWN : Directions.UP;
                        if (!this.moveIsAllowed(curDirection))
                            curDirection = preferredHorizontal == Directions.LEFT ? Directions.RIGHT : Directions.LEFT;
                    }
                }
            }
        }
    }


    public abstract GhostType getGhostType();
}
