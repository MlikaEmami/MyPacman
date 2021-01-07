package ir.ac.kntu;

public class VerticalGhost extends Ghost{
    public VerticalGhost(int x, int y) {
        super("resources/Vertical_Ghost.png", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.VERTICAL;
    }

    /*@Override
    public boolean checkDistance(double curDistanceDiff) {
        return false;
    }*/

    /*@Override
    public void move(Coordinate pacPosition) {
        super.move(pacPosition);
        // VerticalGhost verticalGhost= new VerticalGhost(18,5);
        /*
        for(int i=5 ; i<11 ; i++){
            y++;
            if(i==9){
                for(int i=9 ; i>0 ; i--){
                    y--;
                }

            }
        }
        */

    //}

}
