package Ex2;

public class MoveablePoint implements Moveable{
    private int x ;
    private int y ;

    @Override
    public int moveUp() {
        return y++;
    }

    @Override
    public int moveDown() {
        return y--;

    }

    @Override
    public int moveLeft() {
        return x++;

    }

    @Override
    public int moveRight() {
        return x--;

    }
}
