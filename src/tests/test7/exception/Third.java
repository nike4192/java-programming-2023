package tests.test7.exception;

import java.util.Arrays;

public class Third {

    public static final String[] CAT_SYNONYMS = {
        "puma", "panther", "tabby", "kitty",
        "lynx", "tiger", "cougar", "lion",
        "puss", "kitten", "leopard", "bobcat",
        "jaguar", "tomcat", "pussy", "ocelot",
        "tom", "cheetah", "mouser", "grimalkin",
        "cat"
    };

    public static void main(String[] args) {
        String[] answers = {
            "kitty",
            "cat",
            "rat"  // exception
        };

        for (String answer: answers) {
            try {
                checkAnswer(answer);
                System.out.printf("\"%s\" is right answer\n", answer);
            } catch (CatException exception) {
                System.out.printf("\"%s\" is wrong\n", answer);
                System.out.println(exception.getMessage());
            }
        }
    }

    public static void checkAnswer(String answer) throws CatException {
        if (!Arrays.asList(CAT_SYNONYMS).contains(answer)) {
            throw new CatException();
        }
    }
}
