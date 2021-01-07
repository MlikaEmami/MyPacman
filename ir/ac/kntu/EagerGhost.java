package ir.ac.kntu;

public class EagerGhost extends Ghost{
    public EagerGhost(String imgPath, int x, int y) {
        super(imgPath, x, y);
    }

    @Override
    public Directions getMove() {
        return super.getMove();
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.EAGER;
    }
}
