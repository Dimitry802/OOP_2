/**
 * Класс Sun позволяет создать объект Солнце, при этом
 * это можно сделать не более одного раза.
 */
//пораждающий
public class Sun {
    private static Sun instance;
    public static Sun getInstance(){
        if(instance == null) instance = new Sun();
        return instance;
    }
}
