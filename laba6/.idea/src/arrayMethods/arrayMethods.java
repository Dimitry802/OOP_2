package arrayMethods;
import java.util.ArrayList;
import java.util.function.Predicate;

public class arrayMethods {
    public static <T> boolean some(T[] array, Predicate<T> condition){
        for(T element : array){
            if(condition.test(element)) return true;
        }
        return false;
    }

    public static <T> boolean every(T[] array, Predicate<T> condition){
        for(T element : array){
            if(!condition.test(element)) return false;
        }
        return true;
    }

}
