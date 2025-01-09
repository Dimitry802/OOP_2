package service.impl;

import colors.Color;
import service.ShapesService;
import shapes.Shape;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapeServiceImpl implements ShapesService {
    @Override
    public double getSquares(List<Shape> shapeList) {
        int i = 0; double sum = 0;
        while(i <= shapeList.indexOf(shapeList.getLast())){
            sum += shapeList.get(i).getArea();
            i++;
        }
        return sum;
    }

    @Override
    public double getMaxPerimeters(List<Shape> shapeList) {
        double maxShape = shapeList.getFirst().getPerimeter();
        int i = 1;
        while(i <= shapeList.indexOf(shapeList.getLast())){
            if(shapeList.get(i).getPerimeter() > maxShape)  maxShape = shapeList.get(i).getPerimeter();
            i++;
        }
        return maxShape;
    }

    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> colors = new HashSet<Color>();
        int i = 0;
        while(i <= shapeList.indexOf(shapeList.getLast())){
            colors.add(shapeList.get(i).getColor());
            i++;
        }
        return colors;
    }
}
