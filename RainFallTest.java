//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 4
  //   Version 1.0


/**
 * The RainFallTest class provides methods to read, process, and display rainfall data.
 * It reads rainfall data from an initializer list and an external file, calculates various statistics,
 * and allows users to search for rainfall in a specific month.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class RainFallTest {
   /**
    * Main method to test the RainFall class.
    * @param args Command-line arguments (not used).
    */
   public static void main(String[] args) {
      double dataFromInitializer[] = { 2.1, 1.7, 3.5, 2.6, 4.3, 3.7, 3.9, 2.6, 2.9, 1.6, 2.4, 3.7 };
      RainFall rf = new RainFall(dataFromInitializer);
      System.out.println("1) Test data from the initializer list...");
      displayResult(rf);
   
      double dataFromExternalFile[] = readDataFromFile();
      RainFall rf1 = new RainFall(dataFromExternalFile);
      System.out.println("\n2) Test data read from the file...");
      displayResult(rf1);
   
      // 3) Search rainfall in any month from the file ...
      System.out.println("\n3) Search rainfall in any month from the file...\n");
      Scanner scnr = new Scanner(System.in);
      System.out.print("Please enter a month number (e.g., 1 for January, 12 for December, and so on): ");
      int month = scnr.nextInt();
      System.out.println("The amount of rain in " + rf1.getMonthName(month) +
             " is " + rf1.getRainFallInGivenMonth(month) + " inches.");
   
   }

   /**
    * Display various statistics based on the RainFall data.
    * @param rf The RainFall object containing the data.
    */
   public static void displayResult(RainFall rf) {
      DecimalFormat df = new DecimalFormat("#.0");
      int mostRainMonth = rf.calculateMonthWithMostRain();
      int leastRainMonth = rf.calculateMonthWithLeastRain();
      System.out.println("\nThe total rainfall for this year is " + df.format(rf.calculateTotalRainFall()));
      System.out.println("The average rainfall for this year is " + df.format(rf.calculateAverageRainFall()));
      System.out.println("The month with the highest amount of rain is " + rf.getMonthName(mostRainMonth) +
             " with " + df.format(rf.getRainFallInGivenMonth(mostRainMonth)) + " inches.");
      System.out.println("The month with the lowest amount of rain is " + rf.getMonthName(leastRainMonth) +
             " with " + df.format(rf.getRainFallInGivenMonth(leastRainMonth)) + " inches.\n");
      rf.displayAboveAverageMonths();
   }

   /**
    * Read rainfall data from an external file.
    * @return An array of rainfall data read from the file.
    */
   public static double[] readDataFromFile() {
      // Open the file.
      // We know there are 12 months at this time; otherwise, we need to find the line number
      // first or use an ArrayList.
      double dataFromFile[] = new double[12];
      File file = new File("rainfallData.txt");
      try {
         Scanner inputFile = new Scanner(file);
         // Initialize line number
         int lineNumber = 0;
         // Read lines from the file until no more are left.
         while (inputFile.hasNext()) {
            // Read the next line.
            double lineData = inputFile.nextDouble();
            lineNumber++;
            // Add data to the array
            dataFromFile[lineNumber - 1] = lineData;
         }
         // Close the file.
         inputFile.close();
      } catch (FileNotFoundException e) {
         System.out.println("rainFallData.txt not found");
         e.printStackTrace();
      }
      return dataFromFile;
   }
}
