package trainingday4.by.epam.training.task3.service;

import trainingday4.by.epam.training.task3.entities.TextHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    Scanner scan;
    String[] primaryArrayStrings;
    String[] primaryArrayStringChanged;
    TextHandler forWork;

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

                    break;
                case 3:
                    scan.close();
                    break;
            }
        }
    }

    private void getStringFromFile() throws IOException {
        try{
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

    private void workWithString() throws IOException {
        System.out.println("Choose what you want to do with the resulting string : 1. In each word, replace the k - th letter with the given character. If k is greater than the word length, do not adjust.\n" +
                "2. In the text after the letter P, if it is not the last in the word, the letter A is incorrectly printed instead of O. Make corrections to the text.\n" +
                "3. In the text of the word of a given length, replace the specified substring, the length of which may not coincide with the length of the word.\n" +
                "4. From the small text, delete all characters except spaces that are not letters. Between sequences of consecutive letters, leave at least one space.\n" +
                "5. From the text, delete all words of a given length starting with a consonant." +
                "6. exit.");
        if(forWork == null){
            forWork = new TextHandler();
        }
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
                case 3:

                case 4:
                case 5:
                case 6:
                    scan.close();
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
        for(int i = 0;i<primaryArrayStrings.length;i++){
            String[] forChange = breakStringInToWords(primaryArrayStrings[i]);
            String[] changed = forWork.changekElementToSymbol(forChange,numberElem,element);
            primaryArrayStringChanged[i] = getStringFromArr(changed);
        }
    }

    public String[] breakStringInToWords(String str){
        return str.split(" ");
    }

    public String getStringFromArr(String[] arr){
        String forReturn = "";
        for(int i =0;i<arr.length;i++){
            forReturn += arr[i] + " ";
        }
        return forReturn;
    }

    public void printResultingString(String[] str){
        for(String a : str){
            System.out.println(a + " ");
        }
    }
}