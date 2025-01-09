package shapes;

public class Circle extends Shape{
    private Point point;
    private double radius;
    public void setC(Point p){
        point = p;
    }
    public void setR(double r){
        this.radius = r;
    }
    public Point getC(){
        return point;
    }
    public double getR(){
        return radius;
    }
    private boolean validate(){
        if(radius < 0) {
            Exception();
            return false;
        }
        return true;
    }
    private void Exception(){
        System.out.println("Ошибка(радиус меньше нуля)");
    }
    public Circle(){
        point = new Point(0,0);
        radius = 0.0;
    }
    public Circle(Point newP, double newR){
        point = newP;
        radius = newR;
    }

    @Override
    public void move(double moveX, double moveY) {
        this.point.setX(moveX);
        this.point.setY(moveY);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void draw() {
        if(!validate()) return;
        System.out.println("Фигура круг");
        System.out.println("Центр круга: (х = " + point.getX() + ", y = " + point.getY() + ")");
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + getArea());
        System.out.println("Периметр круга: " + getPerimeter());
        System.out.println("Цвет круга: " + getColor());
    }
}