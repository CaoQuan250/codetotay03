package Ex1;

public abstract class Rectangle extends Shape{
    private int width = 7;
    private int length = 4;

    @Override
    public int getArea(){
        return length * width ;
    }
    public String toString(){
        return super.toString();
    }
}
