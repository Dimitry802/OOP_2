import arrayMethods.arrayMethods;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, -12, 8, -4, 25, 42};

        boolean allPositive = arrayMethods.every(numbers, n -> n > 0);
        System.out.println("Все элементы больше 0: " + allPositive);

        boolean hasPositive = arrayMethods.some(numbers, n -> n > 0);
        System.out.println("Есть хотя бы один элемент больше 0: " + hasPositive);

    }
}
