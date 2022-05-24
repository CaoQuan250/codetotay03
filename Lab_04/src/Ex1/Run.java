package Ex1;

public class Run {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle() {
            @Override
            public int getArea() {
                return super.getArea();
            }
        };
        System.out.println("Rectangle area = "+rectangle.getArea());
        Triangle triangle = new Triangle() {
            @Override
            public int getArea() {
                return super.getArea();
            }
        };
        System.out.println("Triangle area = "+triangle.getArea());


    }
}
