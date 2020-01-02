package trainingday4.by.epam.training.task3.service;

import trainingday4.by.epam.training.task3.entities.TextHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Task 3
 * Программа обработки текста, который может быть получен как с консоли, так и с файла.
 * 1. В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова,
 * корректировку не выполнять.
 * 2. В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А // как определить что ОШИБОЧНО?
 * вместо О. Внести исправления в текст.                                                 // или любую А менять на О?
 * 3. В тексте слова заданной длины заменить указанной подстрокой, длина которой может
 * не совпадать с длиной слова.
 * 4. Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
 * Между последовательностями подряд идущих букв оставить хотя бы один пробел.
 * 5. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 *
 * At first glance, it may seem that the program processes English text, but the
 * feature is that the program is designed to process ONLY TEXT IN Russian.
 */

public class Run {
    private Scanner scan;
    private String[] primaryArrayStrings;
    private String[] primaryArrayStringChanged;
    private TextHandler stringTool;

    public void start() throws IOException {
        System.out.println("Where do you want to enter the string : 1. From file(will be loaded from a file in the root" +
                " directory of the program stringFile.txt) 2.Will be loaded from the console. 3. Close. ");
        scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int numChois = scan.nextInt();

            switch (numChois) {
                case 1:
                    getStringFromFile();
                    break;
                case 2:
                    getFileFromConsole();
                    break;
                case 3:
                    scan.close();
                    break;
            }
        }
    }

    private void getStringFromFile() throws IOException {
        try {
            List fromFile = new ArrayList<String>();
            scan = new Scanner(new File("stringFile.txt"));
            while (scan.hasNext()) {
                String line = scan.nextLine();
                fromFile.add(line);
            }
            primaryArrayStrings = (String[]) fromFile.toArray(new String[0]);
            workWithString();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    private void getFileFromConsole() throws IOException {
        System.out.println("Enter the line you are going to work with.");
        scan = new Scanner(System.in);
        List fromFile = new ArrayList<String>();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.equals("Q") ) {
                primaryArrayStrings = (String[]) fromFile.toArray(new String[0]);
                workWithString();
            }
            fromFile.add(line);

        }
    }

    private void workWithString() throws IOException {
        System.out.println("Choose what you want to do with the resulting string : 1. In each word, replace the k - th letter with the given character. If k is greater than the word length, do not adjust.\n" +
                "2. In the text after the letter P, if it is not the last in the word, the letter A is incorrectly printed instead of O. Make corrections to the text.\n" +
                "3. In the text of the word of a given length, replace the specified substring, the length of which may not coincide with the length of the word.\n" +
                "4. From the small text, delete all characters except spaces that are not letters. Between sequences of consecutive letters, leave at least one space.\n" +
                "5. From the text, delete all words of a given length starting with a consonant." +
                "6. exit.");
        if (stringTool == null) {
            stringTool = new TextHandler();
        }
        primaryArrayStringChanged = new String[primaryArrayStrings.length];
        scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int chouseUser = scan.nextInt();
            switch (chouseUser) {
                case 1:
                    changeKelem();
                    printResultingString(primaryArrayStringChanged);
                    workWithString();
                    break;
                case 2:
                    wrongLetterA(primaryArrayStrings);
                    printResultingString(primaryArrayStringChanged);
                    workWithString();
                case 3:
                    wordSubstitution();
                    printResultingString(primaryArrayStringChanged);
                    workWithString();
                case 4:
                    leaveOnlyLettersAndSpaces();
                    printResultingString(primaryArrayStringChanged);
                    workWithString();
                case 5:
                    givenLengthStartingWithVowel();
                    printResultingString(primaryArrayStringChanged);
                    workWithString();
                case 6:
                    start();
                    break;
            }
        }
    }

    private void changeKelem() {
        System.out.println("Entered number elem");
        int numberElem = 0;
        char element = 0;
        scan = new Scanner(System.in);
        if (scan.hasNext()) {
            numberElem = scan.nextInt();
        }
        System.out.println("Entered which element to change");
        scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String getElement = scan.next();
            char[] c = getElement.toCharArray();
            element = c[0];

        }
        primaryArrayStringChanged = new String[primaryArrayStrings.length];
        for (int i = 0; i < primaryArrayStrings.length; i++) {
            String[] forChange = breakStringInToWords(primaryArrayStrings[i]);
            String[] changed = stringTool.changekElementToSymbol(forChange, numberElem, element);
            primaryArrayStringChanged[i] = getStringFromArr(changed);
        }
    }

    private void wrongLetterA(String[] str) {
        for (int i = 0; i < primaryArrayStringChanged.length; i++) {
            String[] arrWords = breakStringInToWords(str[i]);
            String[] wordsForChange = stringTool.changeTheMistakenlyPrintedLetterA(arrWords);
            primaryArrayStringChanged[i] = getStringFromArr(wordsForChange);
        }
    }

    private void wordSubstitution() {
        System.out.println("Enter an expression that needs to be replaced");
        String newWord = "";
        int wordLength = 0;
        scan = new Scanner(System.in);
        if (scan.hasNext()) {
            newWord = scan.next();
        }
        System.out.println("Enter the length of the word to be replaced");
        if (scan.hasNext()) {
            wordLength = scan.nextInt();
        }

        for (int i = 0; i < primaryArrayStrings.length; i++) {
            String[] word = breakStringInToWords(primaryArrayStrings[i]);
            String[] changed = stringTool.substitutionWordForSubstring(word, newWord, wordLength);
            primaryArrayStringChanged[i] = getStringFromArr(changed);
        }
    }

    private void leaveOnlyLettersAndSpaces() {
        for (int i = 0; i < primaryArrayStrings.length; i++) {
            String[] word = breakStringInToWords(primaryArrayStrings[i]);
            String[] changed = stringTool.deleteAllButLetters(word);
            primaryArrayStringChanged[i] = getStringFromArr(changed);
        }
    }

    private void givenLengthStartingWithVowel() {
        System.out.println("Enter the length of the word");
        scan = new Scanner(System.in);
        int wordLength = 0;
        if (scan.hasNext()) {
            wordLength = scan.nextInt();
        }
        for (int i = 0; i < primaryArrayStrings.length; i++) {
            String[] word = breakStringInToWords(primaryArrayStrings[i]);
            String[] changed = stringTool.wordsGivenLengthStartingWithVowel(word, wordLength);
            primaryArrayStringChanged[i] = getStringFromArr(changed);
        }
    }

    private String[] breakStringInToWords(String str) {
        return str.split(" ");
    }

    private String getStringFromArr(String[] arr) {
        String forReturn = "";
        for (int i = 0; i < arr.length; i++) {
            forReturn += arr[i] + " ";
        }
        return forReturn;
    }

    private void printResultingString(String[] str) {
        for (String a : str) {
            System.out.println(a + " ");
        }
    }
}