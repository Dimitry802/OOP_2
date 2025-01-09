package shapes;

import static java.lang.Math.abs;

public class Rectangle extends Shape{
    private Point A, C;

    public Point getP1(){
        return A;
    }
    public Point getP2(){
        return C;
    }
    public void setP1(double x, double y){
        A.setX(x);
        A.setY(y);
    }
    public void setP2(double x, double y){
        C.setX(x);
        C.setY(y);
    }
    private boolean validate(){
        if(A.getX() == C.getX() || A.getY() == C.getY()){
            Exception();
            return false;
        }
        return true;
    }
    private void Exception(){
        System.out.println("Ошибка");
    }
    public Rectangle(Point p1, Point p2){
        A = p1;
        C = p2;
    }
    public Rectangle(){
        A = new Point();
        C = new Point();
    }
    public double getPerimeter(){
        double dx = A.getX() - C.getX();
        double dy = A.getY() - C.getY();
        return (abs(dx) + abs(dy)) * 2;
    }
    public double getArea(){
        double dx = A.getX() - C.getX();
        double dy = A.getY() - C.getY();
        return abs(dx) * abs(dy);
    }

    @Override
    public void move(double moveX, double moveY) {
        double dx = moveX - A.getX();
        double dy = moveY - A.getY();
        A = new Point(moveX,moveY);
        C = new Point(C.getX() + dx, C.getY() + dy);
    }
    public void draw(){
        if(!validate()) return;
        System.out.println("Фигура Прямоугольник");
        System.out.println("Точки диагонали прямоугольника: Р1(x = " + A.getX() + "; y = " + A.getY() + ") , Р2(x = " + C.getX() + "; y = " + C.getY() + ")");
        System.out.println("Площадь прямоугольника: " + getArea());
        System.out.println("Периметр прямоугольника: " + getPerimeter());
        System.out.println("Цвет прямоугольника: " + getColor());
    }
}
