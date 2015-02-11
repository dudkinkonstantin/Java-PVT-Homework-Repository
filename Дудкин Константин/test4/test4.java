package lesson2;

/**
 * Created by Admin on 09.02.2015.
 */
public class test4 {
    public static void main(String[] args) {
        float a = 6;
        float b = 8;
        float r = 6;
        float x = a / 2 * a / 2 + b / 2 * b / 2;
        if (r * r >= x) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }

    }
}
