package shapes;

import colors.Color;

public abstract class Shape {
    private Color color = Color.transparent;
    private double perimeter, area;
    public void setColor(Color newColor){
        this.color = newColor;
    }
    public Color getColor(){
        return color;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
    public void move(double moveX, double moveY){

    }
    public void draw(){

    }
}
