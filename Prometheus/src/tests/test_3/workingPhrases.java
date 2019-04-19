package tests.test_3;

import java.util.Random;
public class workingPhrases {
    public static void main(String args[]) {
        String a = "А я тут при чём?";
        String b = "Как на источнике, так и у нас.";
        String c = "У нас все работает! ";
        String d = "Если что-то не работает, то это не у нас.";
        String e = "Ну шо? Пора?";
        String f = "Я пока пойду чайник поставлю";
        String g = "Та щас сильно будет!";
        String i = "Ну!";
        String phrases [] = {a, b, c + d, e, f, g, i};
        System.out.println(phrases[new Random().nextInt(phrases.length)]);
    }
}
