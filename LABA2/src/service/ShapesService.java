package service;

import colors.Color;
import shapes.Shape;

import java.util.List;
import java.util.Set;
public interface ShapesService {
    double getSquares(List<Shape> shapeList);
    double getMaxPerimeters(List<Shape> shapeList);
    Set<Color> getColors(List<Shape> shapeList);
}
