import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;



public class Part_3 {

    public static void main(String[] args) {

        try {
            // Use Scanner object to read from my files
            Scanner fileInput1 = new Scanner(new File("Input1.txt"));
            Scanner fileInput2 = new Scanner(new File("Input2.txt"));

            try {
                PrintWriter outputFile = new PrintWriter(new FileWriter("diff.txt"));


                while (fileInput1.hasNext() && fileInput2.hasNext()) // check for next strings
                {
                    // save the next lines into the following variables
                    String line1 = fileInput1.nextLine();
                    String line2 = fileInput2.nextLine();

                    //if (fileInput1.nextLine().equals(fileInput2.nextLine()) == true) {
                    if (line1.equals(line2) == true) {
                        //System.out.println("Same");
                        outputFile.println("Same");
                    }

                    else {
                        //System.out.println("Different");
                        outputFile.println("Different");
                    }
                }

                outputFile.close();

            } catch (IOException exc) {
                System.out.println("There was a problem opening the file for output");
            }

            fileInput1.close();
            fileInput2.close();

        }catch (FileNotFoundException exc) {
            System.out.println("IDIOT, you screwed up (•̀o•́)ง");
            System.out.println("In other words, there was a problem opening the input file");
        }


    }


}
