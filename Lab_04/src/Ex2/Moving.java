package Ex2;

public class Moving {
    public static void main(String[] args) {
        MoveablePoint move1 = new MoveablePoint();
        int x = 0;
        int y = 0;

        for (int i=0; i<7; i++){
            x = move1.moveDown();
        }
        for (int i=0;i<10;i++){
            y = move1.moveRight();
        }
        System.out.println("X = "+x);
        System.out.println("Y = "+y);

    }
}
