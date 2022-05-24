package Ex1;

public abstract class Triangle extends Shape {
    private int base = 7;

    private int  height = 4;
    @Override
    public int getArea(){
        return base * height / 2;
    }
    public String toString(){
        return super.toString();
    }

}
