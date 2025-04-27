//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 4
  //   Version 1.0


/**
 * The RainFall class represents a collection of rainfall data for each month of the year.
 * It provides methods to calculate statistics on the rainfall data and display information about the data.
 */
public class RainFall {

   private double[] data;

   /**
    * Default constructor, initializes the data array as null.
    */
   public RainFall() {
      data = null;
   }

   /**
    * Constructor to initialize the RainFall object with given rainfall data.
    * @param annualRainFall An array containing the monthly rainfall data.
    */
   public RainFall(double annualRainFall[]) {
      data = new double[annualRainFall.length];
      for (int i = 0; i < annualRainFall.length; i++) {
         data[i] = annualRainFall[i];
      }
   }

   /**
    * Get the rainfall data.
    * @return The array of rainfall data.
    */
   public double[] getData() {
      return data;
   }

   /**
    * Set the rainfall data.
    * @param data An array of rainfall data to set.
    */
   public void setData(double[] data) {
      this.data = data;
   }

   /**
    * Calculate and return the total rainfall for the year.
    * @return The total annual rainfall.
    */
   public double calculateTotalRainFall() {
      double sum = 0;
      for (int i = 0; i < data.length; i++) {
         sum += data[i];
      }
      return sum;
   }

   /**
    * Calculate and return the average (mean) rainfall for the year.
    * @return The average annual rainfall.
    */
   public double calculateAverageRainFall() {
      return calculateTotalRainFall() / data.length;
   }

   /**
    * Find and return the index (month) with the highest amount of rainfall.
    * @return The index of the month with the most rainfall.
    */
   public int calculateMonthWithMostRain() {
      double max = data[0];
      int maxIndex = 0;
   
      for (int i = 1; i < data.length; i++) {
         if (data[i] > max) {
            max = data[i];
            maxIndex = i;
         }
      }
      return maxIndex + 1;
   }

   /**
    * Find and return the index (month) with the lowest amount of rainfall.
    * @return The index of the month with the least rainfall.
    */
   public int calculateMonthWithLeastRain() {
      double min = data[0];
      int minIndex = 0;
   
      for (int i = 1; i < data.length; i++) {
         if (data[i] < min) {
            min = data[i];
            minIndex = i;
         }
      }
      return minIndex + 1;
   }

   /**
    * Get the amount of rainfall in a specific month.
    * @param month The index of the month (0 to 11).
    * @return The amount of rainfall in the specified month.
    */
   public double getRainFallInGivenMonth(int month) {
      return data[month -1];
   }

   /**
    * Get the name of a month based on its index.
    * @param month The index of the month.
    * @return The name of the month.
    */
   public String getMonthName(int month) {
      String[] monthNames = {
         "January", "February", "March", "April",
         "May", "June", "July", "August", "September",
         "October", "November", "December"
         };
      return monthNames[month - 1];
   }

   /**
    * Display the months with rainfall above the average.
    */
   public void displayAboveAverageMonths() {
      double average = calculateAverageRainFall();
      int numMonthAboveAverage = 0;
   
      for (int i = 0; i < data.length; i++) {
         if (data[i] > average) {
            numMonthAboveAverage++;
         }
      }
   
      System.out.println("There are " + numMonthAboveAverage + " months with rainfall above average:");
      for (int i = 0; i < data.length; i++) {
         if (data[i] > average) {
            System.out.println(getMonthName(i+1) + "   " + data[i]);
         }
      }
   }
}
