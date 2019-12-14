package trainingday4.by.epam.training.simplearrayconsole.service;

import trainingday4.by.epam.training.simplearrayconsole.entities.SimpleArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StartAppArray {
        Scanner scan;
        SimpleArrayList array;

        public void run(){
            System.out.println("Select the method of filling the array: 1. Load a number from the file. " +
                    "2. Enter the numbers from the console. 3. Fill with random numbers.");
            scan = new Scanner(System.in);
            int enteredNumber = checkNumber();

            switch (enteredNumber){
                case 1:

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

    private void loadFromFile()  {
        System.out.println("Enter file path.");
        String filePath= scan.nextLine();
        File fromUser = new File(filePath);
        if(fromUser.exists() && fromUser.canRead()){
            List forReadInt = new LinkedList();
            try {
                Scanner readFile = new Scanner(fromUser);

                if(readFile.hasNextInt()){
                    int fromFile = Integer.parseInt(readFile.next());
                    forReadInt.add(fromFile);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Fail by the address " + fromUser + " not fucken found.");
            }

            array = new SimpleArrayList(forReadInt);
        }
    }
}
