package lesson3;

/**
 * Created by Admin on 09.02.2015.
 */
public class test9 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        int max = x;
        System.out.print(x + " ");

        while (x != 0) {
            x = (int) (Math.random() * 20);
            System.out.print(x + " ");
            if (max < x) {
                max = x;
            }
        }

        System.out.println();
        System.out.print("Максимальное: " + max);
    }
}
