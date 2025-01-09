package shapes;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private Point P1, P2, P3;
    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public Point getP3() {
        return P3;
    }

    public void setP1(Point newP) {
        P1 = newP;
    }

    public void setP2(Point newP) {
        P2 = newP;
    }

    public void setP3(Point newP) {
        P3 = newP;
    }

    private double getP1P2(){
        return sqrt((P1.getX() - P2.getX()) * (P1.getX() - P2.getX()) + (P1.getY() - P2.getY()) * (P1.getY() - P2.getY()));
    }
    private double getP1P3(){
        return sqrt((P1.getX() - P3.getX()) * (P1.getX() - P3.getX()) + (P1.getY() - P3.getY()) * (P1.getY() - P3.getY()));
    }
    private double getP2P3(){
        return sqrt((P2.getX() - P3.getX()) * (P2.getX() - P3.getX()) + (P2.getY() - P3.getY()) * (P2.getY() - P3.getY()));
    }

    private boolean validate() {
        if ((P3.getX() - P2.getX()) / (P2.getX() - P1.getX()) == (P3.getY() - P2.getY()) / (P2.getY() - P1.getY())) {
            Exception();
            return false;
        }
        return true;
    }

    private void Exception() {
        System.out.println("Ошибка(три точки на одной прямой)");
    }
    public Triangle(){
        P1 = new Point();
        P2 = new Point();
        P3 = new Point();
    }
    public Triangle(Point newP1, Point newP2, Point newP3){
        P1 = newP1;
        P2 = newP2;
        P3 = newP3;
    }

    @Override
    public double getPerimeter() {
        return getP1P2() + getP1P3() + getP2P3();
    }

    @Override
    public double getArea() {
        return sqrt(getPerimeter()/2*(getPerimeter()/2 - getP1P2())*(getPerimeter()/2 - getP1P3())*(getPerimeter()/2 - getP2P3()));
    }

    @Override
    public void move(double moveX, double moveY) {
        double dx = moveX - P1.getX();
        double dy = moveY - P1.getY();
        P1 = new Point(moveX, moveY);
        P2 = new Point(P2.getX() + dx, P2.getY() + dy);
        P3 = new Point(P3.getX() + dx, P3.getY() + dy);
    }

    public void draw(){
        System.out.println("Фигура Треугольник");
        System.out.println("Точки диагонали треугольника:");
        System.out.println("Р1(x = " + P1.getX() + "; y = " + P1.getY() + ")");
        System.out.println("Р2(x = " + P2.getX() + "; y = " + P2.getY() + ")");
        System.out.println("Р3(x = " + P3.getX() + "; y = " + P3.getY() + ")");
        System.out.println("Площадь треугольника: " + getArea());
        System.out.println("Периметр треугольника: " + getPerimeter());
        System.out.println("Цвет треугольника: " + getColor());
    }
}
