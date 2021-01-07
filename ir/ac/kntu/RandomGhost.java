package ir.ac.kntu;

import java.util.Random;

public class RandomGhost extends Ghost{

    public RandomGhost(String imgPath, int x, int y) {
        super("resources/Random_Ghost.png", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.RANDOM;
    }

    /*@Override
    public void move(Coordinate pacPosition) {
        super.move(pacPosition);
        public void moveGhost(Location[][] map) {
            Random rand=new Random();
            int moveSelector=rand.nextInt(999999999%2);
            if (moveSelector==1){
                if (this.getLocation().isInSizeX())
                    if (!(map[getLocation().getX()+1][getLocation().getY()].getFull()))
                        this.getLocation().moveX();
                    else
                        this.getLocation().moveBackX();

                else
                    this.getLocation().moveBackX();
            }
            else{
                if (this.getLocation().isInSizeX0())
                    if (!(map[getLocation().getX()-1][getLocation().getY()].getFull()))
                        this.getLocation().moveBackX();
                    else
                        this.getLocation().moveX();
                else
                    this.getLocation().moveX();
            }
        }
    }*/
}
