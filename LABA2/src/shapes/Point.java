package shapes;
import shapes.Shape;
public class Point extends Shape{
    private double x, y;
    public void setX(double newX){
        x = newX;
    }
    public void setY(double newY){
        y = newY;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    public Point(double setX, double setY){
        setX(setX);
        setY(setY);
    }
    @Override
    public void move(double moveX, double moveY) {
        this.x = moveX;
        this.y = moveY;
    }
}