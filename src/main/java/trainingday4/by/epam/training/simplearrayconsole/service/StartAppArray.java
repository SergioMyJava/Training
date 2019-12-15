package trainingday4.by.epam.training.simplearrayconsole.service;

import trainingday4.by.epam.training.simplearrayconsole.entities.SimpleArrayList;
import trainingday4.by.epam.training.simplearrayconsole.service.sortingclass.BubbleSort;
import trainingday4.by.epam.training.simplearrayconsole.service.sortingclass.MergeSort;
import trainingday4.by.epam.training.simplearrayconsole.service.sortingclass.QuickSort;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StartAppArray {
    Scanner scan;
    SimpleArrayList array;

    public void run() {
        System.out.println("Select the method of filling the array: 1. Load a number from the file. " +
                "2. Enter the numbers from the console. 3. Fill with random numbers.4.Exit");
        scan = new Scanner(System.in);
        int enteredNumber = checkNumber();

        switch (enteredNumber) {
            case 1:
                loadFromFile();
                workWithArray();
                break;
            case 2:
                loadFromConsole();
                workWithArray();
                break;
            case 3:
                randomNumber();
                workWithArray();
                break;
            case 4:
                scan.close();
                break;

        }
    }

    private int checkNumber() {
        if (scan.hasNextInt()) {
            int enteredNumber = scan.nextInt();
            return enteredNumber;
        } else {
            System.out.println("You enter not a number.");
            run();
        }
        return -1;
    }

    public void loadFromFile() {
        System.out.println("In the root of the project is the numberforarray.txt folder. Enter numbers in it with a space." +
                " Press any button to continue.");
        if (scan.hasNext()) {
            array = new SimpleArrayList();
            String filePath = scan.nextLine();

            try {
                Scanner testFilePath = new Scanner(new FileReader("numberforarray.txt"));
                while (testFilePath.hasNext()) {
                    array.add(testFilePath.nextInt());
                }
                System.out.println("The following numbers are added to the array " + array.toString());
            } catch (FileNotFoundException e) {
                System.out.println("Fail not found " + e);
            }
        }
    }

    private void loadFromConsole() {
        System.out.println("How many digits do you want to enter.Stop typing click any letter.");
        if (scan.hasNextInt()) {
            int sizeArray = scan.nextInt();
            array = new SimpleArrayList(sizeArray);
            System.out.println("Вводите числа : ");
            for (int i = 0; i < sizeArray; i++) {
                array.add(scan.nextInt());
            }
            System.out.println("The following numbers are added to the array " + array.toString());
        } else {
            run();
        }
    }

    private void randomNumber() {
        System.out.println("Enter how many digits should be in the array.");
        if (scan.hasNextInt()) {
            int arraySize = scan.nextInt();
            array = new SimpleArrayList(arraySize);
            Random rand = new Random();
            for (int i = 0; i < arraySize; i++) {
                int r = rand.nextInt();
                if (r < 0) {
                    r = r * (-1);
                    array.add(r);
                } else {
                    array.add(r);
                }
            }
            System.out.println("The following numbers are added to the array " + array.toString());
        } else {
            run();
        }
    }

    private void workWithArray() {
        System.out.println(("What actions do you want to perform with the array: 1.Sort the array. 2. Array element search. "
                + "3. Finding the maximum and minimum element of the array. 4. Get all the primes in the array. "
                + "5. Get all the Fibonacci numbers in the array. 6. Get all three-digit numbers, in decimal records " +
                "which do not have the same digits. 7.Back to array creation."));

        scan = new Scanner(System.in);
        int enteredNumber = checkNumber();


        switch (enteredNumber) {
            case 1:
                sortArray();
                break;
            case 2:
                arraySearch();
                workWithArray();
                break;
            case 3:
                maxMinInArray();
                workWithArray();
                break;
            case 4:
                getAllPrimes();
                workWithArray();
                break;
            case 5:
                fibonachNum();
                workWithArray();
                break;
            case 6:
                threeDigitNum();
                workWithArray();
                break;
            case 7:
                run();
                break;
        }
    }

    private void sortArray() {
        System.out.println("How to sort : 1.MergeSort 2.QuickSort 3.BubbleSort ");
        int enteredNumber = checkNumber();
        switch (enteredNumber) {
            case 1:
                mergeSort();
                workWithArray();
                break;
            case 2:
                quickSort();
                workWithArray();
                break;
            case 3:
                bubbleSort();
                workWithArray();
                break;
        }
    }

    private void mergeSort() {
        if (array != null) {
            MergeSort sort = new MergeSort();
            array.setArray(sort.sort(array.getArray()));
            System.out.println("That's what happened " + array.toString());
        } else {
            System.out.println("Create an array.");
            run();
        }
    }

    private void quickSort() {
        if (array != null) {
            QuickSort sort = new QuickSort();
            array.setArray(sort.sort(array.getArray()));
            System.out.println("That's what happened " + array.toString());
        } else {
            System.out.println("Create an array.");
            run();
        }
    }

    private void bubbleSort() {
        if (array != null) {
            BubbleSort sort = new BubbleSort();
            array.setArray(sort.sort(array.getArray()));
            System.out.println("That's what happened " + array.toString());
        } else {
            System.out.println("Create an array.");
            run();
        }
    }

    private void arraySearch() {
        System.out.println("Enter the item you want to find.");
        int enteredNumber = checkNumber();
        BinarySearch binSearch = new BinarySearch();
        int[] arr = sortArray(array);
        int index = 0;
        for (int y = 0; y < array.size(); y++) {
            index = binSearch.search(arr, enteredNumber);
            if (index != -1) {
                index = index;
            }
        }
        System.out.println("Your number is under the index " + index);
    }

    private int[] sortArray(SimpleArrayList array) {
        int[] ar = array.getArray();
        MergeSort sorting = new MergeSort();
        return sorting.sort(ar);
    }

    private void maxMinInArray() {
        int[] sortedArr = sortArray(array);
        System.out.println(sortedArr.toString());
        MinMaxInArray mm = new MinMaxInArray();
        int[] minMax = mm.getMinMax(sortedArr);
        System.out.println(minMax.toString());
        int min = minMax[0];
        int max = minMax[1];
        System.out.println("Minimum Number " + min + " Maximum Number " + max);
    }

    private void getAllPrimes() {
        PrimeNumbers prim = new PrimeNumbers();
        List primFromArr = prim.getPrimeNumbers(array.getArray());
        System.out.println("Prime number " + primFromArr.toString());
    }

    private void fibonachNum() {
        int a = 0;
        int b = 1;
        List fib = new LinkedList();
        for (int i = 0; i < array.size(); i++) {
            for (int k = 2; k <= 17711; ++k) {
                int next = a + b;
                if (array.get(i) == next) {
                    fib.add(array.get(i));
                }
                a = b;
                b = next;
            }
        }
        System.out.println("Fibonnachi number " + fib.toString());
    }

    private void threeDigitNum() {
        ThreeDigitNumbers numberDi = new ThreeDigitNumbers();
        List forRet = numberDi.getThreeDigitNumbers(array.getArray());
        System.out.println("All three-digit numbers in the decimal record of which there are no identical digits : " +
                forRet.toString());
    }
}
