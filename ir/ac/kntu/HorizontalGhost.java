package ir.ac.kntu;

public class HorizontalGhost extends Ghost{
    public HorizontalGhost( int x, int y) {
        super("resources/Horizontal_Ghost.png", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.HORIZONTAL;
    }

    /*@Override
    public boolean checkDistance(double curDistanceDiff) {
        return false;
    }*/


    /*@Override
    public void move(Coordinate pacPosition) {
        super.move(pacPosition);
        // HorizontalGhost horizontalGhost= new HorizontalGhost(16,10);
        /*
        for(int i=16 ; i<19 ; i++){
            x++;
            if(i==18){
                for(int i=19 ; i>0 ; i--){
                    x--;
                }

            }
        }
        */

    //}
}
