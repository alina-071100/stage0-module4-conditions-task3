package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
        public void vowelDeterminer(char character) {
            int getNumFromChar = character;
            if (!((getNumFromChar >= 65 && getNumFromChar <= 90) || (getNumFromChar >= 97 && getNumFromChar <= 122))) {
                System.out.println("wrong alphabet!");
            } else if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
}
