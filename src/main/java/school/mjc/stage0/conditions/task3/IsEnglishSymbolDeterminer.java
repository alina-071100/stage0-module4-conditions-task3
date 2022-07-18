package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int getNumFromChar = symbol;
        if ((getNumFromChar >= 65 && getNumFromChar <= 90) || (getNumFromChar >= 97 && getNumFromChar <= 122)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
