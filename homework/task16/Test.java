package homework.task16;

/**
 * Created by Admin on 15.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        String str = "Тесто?вая. строка, с неско!лькими,, запятыми";
        int counter = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == ';' || symbol == ':' || symbol == '!' || symbol == '?') {
                counter++;
            }
        }
        System.out.println("У нас есть " + counter + " знаков препинания");
    }
}
