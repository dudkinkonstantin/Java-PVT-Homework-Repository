package homework.task17;

/**
 * Created by Admin on 15.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        String str = "        Тестовая строка с  несколькими  пробелами  ";
        int counter = 0;
        char symbol;
        char nextSymbol;
        for (int i = 0; i < str.length() - 1; i++) {
            symbol = str.charAt(i);
            nextSymbol = str.charAt(i + 1);
            if (symbol == ' ' && nextSymbol != ' ') {
                counter++;
            }
        }
        System.out.println("У нас есть " + counter + " слов");
    }
}
