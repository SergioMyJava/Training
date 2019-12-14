package trainingday4.by.epam.training.simplearrayconsole;

import trainingday4.by.epam.training.simplearrayconsole.service.MinMaxInArray;
import trainingday4.by.epam.training.simplearrayconsole.entities.SimpleArrayList;
import trainingday4.by.epam.training.simplearrayconsole.service.PrimeNumbers;
import trainingday4.by.epam.training.simplearrayconsole.service.ThreeDigitNumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        SimpleArrayList test = new SimpleArrayList();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        //test.set(2,89);
        List toTest2 = new ArrayList();
        toTest2.add(1);
        toTest2.add(2);
        toTest2.add(3);
        toTest2.add(4);
        SimpleArrayList test2 = new SimpleArrayList(toTest2);

        SimpleArrayList test3 = new SimpleArrayList();
        test3.add(1);
        test3.add(2);
        test3.add(3);
        test3.add(4);
        test3.add(5);

        SimpleArrayList test4 = new SimpleArrayList(2);
        int[] rec = {2, 632, 1678, 354, 162,564, 133, 45, 23};
        test4.add(5);
        test4.add(2);
        test4.add(2);
        test4.add(8);
        test4.add(5);

        ThreeDigitNumbers red = new ThreeDigitNumbers();
        List terf = red.getThreeDigitNumbers(rec);
        System.out.println(terf.toString());;
    }
}
