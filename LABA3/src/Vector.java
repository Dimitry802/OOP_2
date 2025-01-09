import static java.lang.Math.*;
/**
 * <b>Класс Вектор</b>
 * Данный класс реализует векторы и некоторые операции над ними
 * @author Chesnokov Andrey
 * @version 1.0
 * @since 2024-11-07
 */
public class Vector {
    private double x1 = 0;
    private double y1 = 0;

    private double x2 = 0;
    private double y2 = 0;

    /**
     * Конструктор объекта класса Вектор
     * @param newx1 - координата X для начала вектора
     * @param newy1 - координата Y для начала вектора
     * @param newx2 - координата X конца вектора
     * @param newy2 - координата Y конца вектора
     */
    public Vector(double newx1, double newy1, double newx2, double newy2){
        x1 = newx1;
        y1 = newy1;
        x2 = newx2;
        y2 = newy2;
    }
    public Vector(){}
    /**
     * @return Метод используется для получения координаты X вектора
     */
    public double getX(){
        return x2 - x1;
    }
    /**
     * @return Метод используется для получения координаты Y вектора
     */
    public double getY() {
        return y2 - y1;
    }
    /**
     * Метод изменяет координаты начала вектора
     * @param newx1 новая координата X
     * @param newy1 новая координата Y
     */
    public void setStart(double newx1, double newy1){
        x1 = newx1;
        y1 = newy1;
    }

    /**
     * Метод изменяет координаты конца вектора
     * @param newx2 новая координата Х
     * @param newy2 новая координата Y
     */
    public void setFinish(double newx2, double newy2){
        x2 = newx2;
        y2 = newy2;
    }
    /**
     * Метод, производящий скалярное произведение
     * @param a первый вектор произведения
     * @param b второй вектор произведения
     * @return возвращает результат скалярного произведения
     */
    public static double scalar(Vector a, Vector b){
        return a.getX() * b.getX() + a.getY() * b.getY();
    }
    /**
     * Mетод для вычисления длины вектора
     */
    public double length(){
        return sqrt(getX()*getX() - getY()*getY());
    }
    /**
     * Метод умножает вектор на число
     * @param l число, на которое умножается вектор
     */
    public void multiply(double l){
        x2 = x2 * l - x1;
        y2 = y2 * l - y1;
    }
    /**
     * Метод скадывает два вектора
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return возвращается сумма двух векторов
     */
    public static Vector sum(Vector a, Vector b){
        return new Vector(0, 0, a.getX() + b.getX(), a.getY() + b.getY());
    }
    /**
     * Метод вычитает из вектора а вектор b
     * @param a уменьшаемый вектор
     * @param b вычитаемый векто
     * @return возвращается разность двух векторов
     */
    public static Vector sub(Vector a, Vector b){
        return new Vector(0, 0, a.getX() - b.getX(), a.getY() - b.getY());
    }
    public static void main(String[] args){
        Vector a = new Vector(1,2,4,4);
        Vector b = new Vector();
        b.setStart(3,2);
        b.setFinish(8,3);
        System.out.println("b = (" + b.getX() + ", " + b.getY() + ")");
        System.out.println(scalar(a,b));
        System.out.println("|a| = " + a.length());
        b.multiply(3);
        System.out.println("b = (" + b.getX() + ", " + b.getY() + ")");
    }
}
